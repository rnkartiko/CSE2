//Ryan Kartiko
//CSE2
//lab07-zigzag
//March 6, 2015

import java.util.Scanner; //import Scanner

public class zigzag {
    //main method for every program
    public static void main (String [] args) {
    
        Scanner myScanner = new Scanner(System.in); //prompt the user for input
        
        while (true) {
            System.out.println("Enter and integer value between 3 and 33.");
            if (myScanner.hasNextInt()) { //checks if input is an integer
                int nStars = myScanner.nextInt();
                if (nStars >= 3 && nStars <= 33) { //checks if input is between 3 and 33
                    for (int i = 0; i < nStars; i++){
                        System.out.print("*");
                    } //this while loop prints out nStars copies of *
                    System.out.println(" "); 
                    
                    String space = " ";
                    for (int j = 0; j < nStars; j++){
                        System.out.println(space + "*");
                        space = space + " ";
                    } //this for loop prints out stars in a diagonal pattern
                    break; //break from loop when input is valid
                }
                else {
                    continue; //reloop if input isn't between 3 and 33
                }
            }
            else {
                continue; //reloop if input isn't variable
            }
        }
    } //end of main method
} //end of class    