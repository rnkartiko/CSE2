//Ryan Kartiko
//CSE2-hw06
//March 3, 2015
//
//  This program takes a user input value
//  between 9 and 16 and outputs its factorial value.

import java.util.Scanner; //import Scanner

public class RunFactorial {
    //main method for every program
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in); //prompt the user for input
         
        while (true) {
            System.out.println("Enter an integer between 9 and 16: ");
            if (myScanner.hasNextInt()){ //validates that the value entered is an int between 9 and 16
                int value = myScanner.nextInt();
                
                if (value >= 9 && value <= 16){
                    switch (value) {
                        case 9: System.out.println(9*8*7*6*5*4*3*2*1);
                        break;
                        case 10: System.out.println(10*9*8*7*6*5*4*3*2*1);
                        break;
                        case 11: System.out.println(11*10*9*8*7*6*5*4*3*2*1);
                        break;
                        case 12: System.out.println(12*11*10*9*8*7*6*5*4*3*2*1);
                        break;
                        case 13: System.out.println(13*12*11*10*9*8*7*6*5*4*3*2*1);
                        break;
                        case 14: System.out.println(14*13*12*11*10*9*8*7*6*5*4*3*2*1);
                        break;
                        case 15: System.out.println(15*14*13*12*11*10*9*8*7*6*5*4*3*2*1);
                        break;
                        case 16: System.out.println(16*15*14*13*12*11*10*9*8*7*6*5*4*3*2*1);
                        break;
                    }
                    break; //exits the while loop when input is valid
                }
                else {
                System.out.println("Your input is invalid."); //states that input was not an integer
                continue; //reloops if input is invalid
                }
            }
            else {
            System.out.println("Your input is invalid."); //states that input was not an integer
            continue; //reloops if input is invalid
            }
        } //end of while loop    
    } //end of main method
} //end of class
        