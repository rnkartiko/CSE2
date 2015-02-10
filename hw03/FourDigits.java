//Ryan Kartiko
//CSE2
//hw03-FourDigits
//Feb. 10, 2015
//
//  Given a user input, I will
//  display the four digits to
//  the right of the decimal point


import java.util.Scanner; //import Scanner

//class setup
public class FourDigits {
    //main method used for every program
    public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);     //prompt the user for input
    
    //Ask the user for a double
        System.out.print("Enter a double: "); //ask for a double
        double number = input.nextDouble(); //declares number and assigns user value
        
    //Get the four digits to the right of the decimal point
        number = number*10000;
        number = (int) number;
        number = (number % 10000);
        int newnumber = (int) number;
    
    //print the result
        System.out.println(newnumber);
    }
}