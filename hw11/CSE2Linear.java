//Ryan Kartiko
//CSE2
//hw11-CSE2Linear
//April 14, 2015

import java.util.Scanner;

public class CSE2Linear {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int[] array = new int[15];
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        for (int i = 0; i<15; i++) {
            if (myScanner.hasNextInt()) {
                array[i] = myScanner.nextInt();
            }
            else {
                System.out.println("You did not enter an int.");
                break;
            }
        } //fill the array with user inputs
        
        System.out.println("Enter a grade to search for: ");
        int grade = myScanner.nextInt();
        String result = binarySearch(array,0,14,grade);
        System.out.println(result);
        
        //Scramble the array and use linear search to find a certain grade
        int[] scrambled = new int[15];
            scrambled[0] = array[9];
            scrambled[1] = array[5];
            scrambled[2] = array[13];
            scrambled[3] = array[7];
            scrambled[4] = array[1];
            scrambled[5] = array[14];
            scrambled[6] = array[11];
            scrambled[7] = array[8];
            scrambled[8] = array[3];
            scrambled[9] = array[2];
            scrambled[10] = array[12];
            scrambled[11] = array[4];
            scrambled[12] = array[6];
            scrambled[13] = array[10];
            scrambled[14] = array[0];
        System.out.println("Scrambled: "+scrambled);
        System.out.println("Enter a grade to search for: ");
        int grade2 = myScanner.nextInt();
        int counter = 0;
        for (int j=0; j<15; j++) {
            counter += 1;
            if (scrambled[j] == grade2) {
                System.out.println("The value was found and it took "+counter+"iterations.");
                break;
            }
        }
        System.out.println("The value was not found.");
        
    } //end of main method
    
    public static String binarySearch(int[] array, int low, int high, int key) {
        
        int counter = 0;
        String result = "The value was not found in "+counter+" iterations.";
        while(high >= low) {
            counter += 1;
            int middle = (low + high) / 2;
            if(array[middle] == key) {
                 result = "The value was found with "+counter+" iterations.";
            }
            if(array[middle] < key) {
                 low = middle + 1;
            }
            if(array[middle] > key) {
                 high = middle - 1;
            }
        }
        return result;
    } //end of binarySearch method
} //end of class