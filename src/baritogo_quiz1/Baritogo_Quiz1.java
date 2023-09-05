/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baritogo_quiz1;
import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author Tovi Myer
 */
public class Baritogo_Quiz1 {
private static LinkedList<Integer> bomb = new LinkedList<>();
private static LinkedList<Integer> ba = new LinkedList<>();
private static Scanner scn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
                
    }
    public static void menu(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Which no. Do you Want to go?\n1, 2, or 3?");
        int input = scn.nextInt();
        
        if (input == 1){
            numberone();
        } else if (input == 2){
            numbertwo();
        } else if (input == 3){
            numberthree();
        } else {
            System.out.println("Pasagad rakag type!");
            menu();
        }
    }
    public static void numberone(){
        Scanner scn = new Scanner(System.in);
        int [] arr = {82, 44, 96, 7, 13, 56, 74, 14, 98, 36};
        
        System.out.println("Basic array");
        printArray(arr);
        
        System.out.println("Wanna go Back? Just type 1.");
        int input = scn.nextInt();
        if (input == 1){
        menu();
         } else{
            numberone();
        }
    }
    public static void numbertwo(){
         Scanner scn = new Scanner(System.in);
         System.out.println("Want to add? press 1\nWant to delete? press 2\nWant to see your Array? press 3\ntype 4 if gusto ka mo balik");
          int input = scn.nextInt();
          
          if(input == 1){
              add();
          } else if (input == 2){
              delete();             
          } else if (input == 3){
              array();
          } else if (input == 4){
              menu();
          } else{
              System.out.println("Pasagad rakag pili maong binuangan ka1");
              numbertwo();
          }
         
         
    }
    public static void numberthree(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Imong array"+ ba);
        System.out.println("type 1 to add the array\ntype 2 to sort\ntype 3 back");      
        int input = scn.nextInt();
        
        if (input == 1){
            butang();
            
        } else if(input ==2) {
        
        }
            else {
            numberthree();
        }
        
        
        int [] arr = { 7, 9, 10, 1, 5};
        
        System.out.println("Original array");
        printbarray(arr);
        
        bubblesort(arr);
        System.out.println("Sorted array");
        printbarray(arr);
        
        
                
    }
    public static void add(){
         Scanner scn = new Scanner(System.in);
         System.out.println("Choose element to add:\n[1]2\n[2]4\n[3]6\n[4]8\n[5]10\n[6]Done");
         int input = scn.nextInt();
         
         int num1 = 2;
         int num2 = 4;
         int num3 = 6;
         int num4 = 8;
         int num5 = 10;
         
         if (input == 1){
             bomb.offer(num1);
           add();
         } else if (input == 2){
             bomb.offer(num2);
           add();
         } else if (input == 3){
             bomb.offer(num3);
           add();
         } else if (input == 4){
             bomb.offer(num4);
           add();
         } else if (input == 5){
             bomb.offer(num5);
           add();
         } else if (input == 6){         
           numbertwo();
         }  else{
             add();
         }
    }
    public static void delete(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Pili unsa imong i delete start from 0!");
        System.out.println(bomb);
        int input = scn.nextInt();
        System.out.println("imong gi delete kay " + bomb.get(input));
        
        bomb.remove(input);
        System.out.println("imohang array nabilin" + bomb);
        System.out.println("[1] Balik");
        int ha = scn.nextInt();
        
        if(ha == 1){
            numbertwo();
        } else{
            System.out.println("Pasagad raka!");
            delete();
        }
    }
    public static void array(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Imong array nabilin kay");
        System.out.println("" + bomb);
         System.out.println("[1] Balik");
        int ha = scn.nextInt();
        
        if(ha == 1){
            numbertwo();
        } else{
            System.out.println("Pasagad raka!");
            delete();
        }
    }
    public static void bubblesort(int arr[]){
        
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++){
        for(int j= 0; j < n -1; j++){
            if(arr[j] > arr [ j + 1]){
                int m = arr[j];
                arr[j] = arr[j + 1 ];
                arr[j + 1 ] = m;
             }
          }
      }
    }
    public static void butang(){
        
    }
    public static void printArray(int[] arr) {
        for(int num: arr) {
            System.out.println(num +"");
        }
    }
 public static void printbarray(int[] arr) {
        for(int num: arr) {
            System.out.println(num +"");
        }
    }
}

