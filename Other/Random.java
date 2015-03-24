//Ryan Kartiko
//CSE02
//lab08-Factorials
//March 20, 2015

import java.util.Scanner; //import Scanner

//class setup
public class Random {
    //main method
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in); //prompt user for input
        int number = myScanner.nextInt();
        System.out.println(Factorial(number));
    } //end of main method
    
        //method for finding factorial
    public static int Factorial(int x) {
            int fact = 1;
            for (int j=1; j<=x; x--) {
                fact = fact*x;
            } //this for loop calculates the normal factorial for a number
    return fact;    
    } //end of Factorial method   
} //end of class