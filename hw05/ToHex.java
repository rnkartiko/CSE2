//Ryan Kartiko
//CSE2
//hw05-ToHex
//Feb. 24, 2015
//
//  This code takes user input for 
//  decimal RGB values and 
//  converts them to hexadecimal values.

import java.util.Scanner; //import Scanner

public class ToHex {
    // main method for every program
    public static void main (String [] args) {
        
        Scanner myScanner = new Scanner(System.in); //declare and assign myScanner
        
        System.out.println("Please enter three numbers representing RGB values: "); //prompt the user for input
        int r = myScanner.nextInt();
        int g = myScanner.nextInt();
        int b = myScanner.nextInt();
        
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255){ //if statement to make sure inputs are valid
            int r2 = (int) r/16;
            int r3 = r%16;
            int g2 = (int) g/16;
            int g3 = g%16;
            int b2 = (int) b/16;
            int b3 = b%16;
            
            String r2s;
            String r3s;
            String g2s;
            String g3s;
            String b2s;
            String b3s;
                //declare the string values
            
             switch (r2){ //this switch statement determines the hexadecimal value if the decimal value is between 10-15
                case 10:
                    r2s = "A";
                    break;
                case 11:
                    r2s = "B";
                    break;
                case 12:
                    r2s = "C";
                    break;
                case 13:
                    r2s = "D";
                    break;
                case 14:
                    r2s = "E";
                    break;
                case 15:
                    r2s = "F";
                    break;
                default: 
                    r2s = Integer.toString(r2);
            }
            
            switch (r3){ //this switch statement determines the hexadecimal value if the decimal value is between 10-15
                case 10:
                    r3s = "A";
                    break;
                case 11:
                    r3s = "B";
                    break;
                case 12:
                    r3s = "C";
                    break;
                case 13:
                    r3s = "D";
                    break;
                case 14:
                    r3s = "E";
                    break;
                case 15:
                    r3s = "F";
                    break;
                default: 
                    r3s = Integer.toString(r3);
            }
            
             switch (g2){ //this switch statement determines the hexadecimal value if the decimal value is between 10-15
                case 10:
                    g2s = "A";
                    break;
                case 11:
                    g2s = "B";
                    break;
                case 12:
                    g2s = "C";
                    break;
                case 13:
                    g2s = "D";
                    break;
                case 14:
                    g2s = "E";
                    break;
                case 15:
                    g2s = "F";
                    break;
                default: 
                    g2s = Integer.toString(g2);
            }
            
            switch (g3){ //this switch statement determines the hexadecimal value if the decimal value is between 10-15
                case 10:
                    g3s = "A";
                    break;
                case 11:
                    g3s = "B";
                    break;
                case 12:
                    g3s = "C";
                    break;
                case 13:
                    g3s = "D";
                    break;
                case 14:
                    g3s = "E";
                    break;
                case 15:
                    g3s = "F";
                    break;
                default:
                    g3s = Integer.toString(g3);
            }
            
            switch (b2){ //this switch statement determines the hexadecimal value if the decimal value is between 10-15
                case 10:
                    b2s = "A";
                    break;
                case 11:
                    b2s = "B";
                    break;
                case 12:
                    b2s = "C";
                    break;
                case 13:
                    b2s = "D";
                    break;
                case 14:
                    b2s = "E";
                    break;
                case 15:
                    b2s = "F";
                    break;
                default: 
                    b2s = Integer.toString(b2);
            }
            
            switch (b3){ //this switch statement determines the hexadecimal value if the decimal value is between 10-15
                case 10:
                    b3s = "A";
                    break;
                case 11:
                    b3s = "B";
                    break;
                case 12:
                    b3s = "C";
                    break;
                case 13:
                    b3s = "D";
                    break;
                case 14:
                    b3s = "E";
                    break;
                case 15:
                    b3s = "F";
                    break;
                default:
                    b3s = Integer.toString(b3);
            }
            
            System.out.println("The decimal numbers R: "+r+ ", G: "+g+ ", B: "+b+" is represented in hexadecimal as: "+r2s+r3s+g2s+g3s+b2s+b3s);
            //final print statement to display decimal numbers in hexadecimal
        }
        else {
            System.out.println("Sorry, you must enter integer values between 0 & 255.");
            //print statement if inputs are invalid
        }
    }
}