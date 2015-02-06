//Ryan Kartiko
//CSE2
//lab03-2/6/15
//
// This program computes the cost of buying BigMacs
// given user inputs for number of and cost per BigMac
// and the sales tax depending on which state
//
import java.util.Scanner; //import Scanner class

public class BigMac {
    //class reqquired for every program
    public static void main(String[] args) {
        
        Scanner myScanner; //declare myScanner
        myScanner = new Scanner( System.in ); //Scanner constructor
        
        //get the user inputs
        
            System.out.print("Enter the number of Big Macs(an integer > 0): "); //asks for user input of number of Big Macs
            int nBigMacs = myScanner.nextInt(); //accepts the user input as integer
            
            System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx):" ); //ask for user input of cost per Big Mac
            double bigMac$ = myScanner.nextDouble(); //accepts user input as double
            
    	    System.out.print("Enter the percent tax as a whole number (xx): "); //asks for user input of sales tax in percentage
            double taxRate = myScanner.nextDouble(); //accepts user input as double
            taxRate/=100; //user enters percent, but this converts in to a proportion
    
        //declare and assign variables that compose final cost
            
            double cost$; //declare cost$ of Big Macs
            int dollars; //whole dollar amount of cost 
            int dimes; 
            int pennies; //dimes and pennis used for storing digits 
                        //to the right of the decimal point 
                        //for the cost$ 
            cost$ = nBigMacs*bigMac$*(1+taxRate); //get the whole amount, dropping decimal fraction
            dollars=(int)cost$; //cast cost$ to an integer
    
            dimes=(int)(cost$*10)%10; //gets dimes amount //% mod operator returns the remainder after division (division by 10 in this case)
            pennies=(int)(cost$*100)%10; //gets pennies amount (division by 100)
        
        //print out the final cost statement
        
            System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+"."+dimes+pennies);
; 
        
    } //end of main method
} //end of class

