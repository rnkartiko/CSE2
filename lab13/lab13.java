//Ryan Kartiko
//CSE2
//lab13
//April 24, 2015

import java.util.Scanner;

public class lab13 {
    public static void main(String [] args) {
        int[][] myArray = new int [5][];
        
        for (int i=0; i < 5; i++) {
            myArray[i] = new int[(i*3)+5];
        } //this allocates space for each member array
        
        for (int i=0; i<5; i++) {
            for (int k=0; k< myArray[i].length; k++) {
                myArray[i][k] = (int) (Math.random()*(40)+0); //random number between 0 and 39
            }
        }
        
        System.out.println("The array before sorting:");
        for (int i=0; i<5; i++) {
            System.out.print("row "+(i+1)+": ");
            for (int j=0; j<myArray[i].length; j++) {
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------"); //prints out myArray before sorting
        
        System.out.println("The array after sorting:");
        for (int i=0; i<5; i++) {
            System.out.println(sort(myArray[i]));
        }    
        System.out.println("----------------------------------------------------");
        
        System.out.println("The array after sorting and copying:");
        int[][] newArray = new int[5][17];
        for (int i=0; i<5; i++) {
            for (int j=0; j<myArray[i].length; j++) {
                newArray[i][j]=myArray[i][j];
            }
            for (int k=myArray[i].length+1; k<17; k++) {
                newArray[i][k]= 0;
            }
            System.out.println(newArray[i]);
        }
    } //end of main method
    
    public static int[] sort(int[] x) {
        for (int i=0; i<x.length-1; i++) {
            for (int j=i+1; j<x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    } //end of sort method
} //end of class