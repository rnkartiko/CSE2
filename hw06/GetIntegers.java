//Ryan Kartiko
//CSE2-hw06
//March 3, 2015
//
//  This program takes five non-negative 
//  user inputs and verifies them. Then
//  it outputs the sum.

import java.util.Scanner; //import Scanner

public class GetIntegers {
    //main method for every program
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in); //prompt the user for input
        
        while (true) { //boolean value is true so loop always runs until it hits break statement
            System.out.println("Enter five non-negative integers: "); //user input for five integers
        
            int a = myScanner.nextInt();
            int b = myScanner.nextInt();
            int c = myScanner.nextInt();
            int d = myScanner.nextInt();
            int e = myScanner.nextInt();
            //declare and assign variable values
            
            if (a >= 0 && b >= 0 && c >= 0 && d >= 0 && e >=0){ //test if the inputs are valid
                System.out.println(a+b+c+d+e); //print the sum
                break; //break statement to get out of loop if inputs are valid
            }
            else {
                System.out.println("Invalid input.");
                continue; //continue statement to reloop if inputs are invalid
            }
        }
    } //end of main method
} //end of class