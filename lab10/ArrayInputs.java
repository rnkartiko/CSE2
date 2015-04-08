//Ryan Kartiko
//CSE2
//lab10-ArrayInputs
//April 3, 2015

import java.util.Scanner;

public class ArrayInputs {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter an integer for the size of the array: ");
        int sizeOfArray = myScanner.nextInt();
        int [] array = new int[sizeOfArray];
        System.out.println("Please enter 10 positive integers: ");
        int i = 0;
        do {
            if (inputCheck(myScanner.nextInt())) {
                array[i] = myScanner.nextInt();
            }
            i++;
        }
        while (i < sizeOfArray);
    } //end of main method
    
    public static int inputCheck(int x) {
        
    } //end of inputCheck method
} //end of class