//Ryan Kartiko
//CSE02
//lab08-Factorials
//March 20, 2015

import java.util.Scanner; //import Scanner

//class setup
public class Factorials {
    //main method
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in); //prompt user for input
        System.out.print("Enter an int: ");
        int number = myScanner.nextInt();
        System.out.println(Factorial(number));
    } //end of main method
    
        //method for finding factorial
    public static int Factorial(int number) {
        int supFact = 0;
        for (int i = number; i>0; i--) {
            int fact = 1;
            for (int j=i; j>0; j--) {
                fact = fact*j;
            } //this for loop calculates the normal factorial for a number
            supFact = supFact + fact;
        } //this for loop calculates the super factorial or sum of normal factorials    
    return supFact;    
    } //end of Factorial method   
} //end of class