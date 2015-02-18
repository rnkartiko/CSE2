//Ryan Kartiko
//CSE2
//hw04-Banking
//Feb. 17, 2015
//
//  Given a random amount between 1,000 and 5,000
//  user will want to deposit or withdraw money.
//  Print the remaining amount after either transaction.

import java.util.Scanner; //import Scanner

//class setup
public class Banking {
    //main method used for every program
    public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);     //prompt the user for input
    String D, d, W, w, V, v;
     
    int account = (int)(1000+(Math.random()*5000));
    System.out.println("Would you like to deposit, withdraw, or view your balance? ");
    System.out.println("Enter D, W, or V.");
    String ans = input.nextLine();
    if (ans.equalsIgnoreCase("D")){
        System.out.print("How much would you like to deposit? ");
        int dep = input.nextInt();
        if (dep > 0){
            int remaining = account + dep;
            System.out.println("Your remaining balance is " + remaining + ".");
        }
        else {
            System.out.println("Your amount is invalid.");
        }
    }
    else if (ans.equalsIgnoreCase("W")){
        System.out.println("How much would you like to withdraw? ");
        int wit = input.nextInt();
        if (0 < wit && wit <= account){
            int remaining = account - wit;
            System.out.println("Your remaining balance is " + remaining + ".");
        }
        else {
            System.out.println("Your amount is invalid.");
        }
    }
    else if (ans.equalsIgnoreCase("V")){
        System.out.println("Your remaining balance is " + account + ".");
    }
    else {
        System.out.println("Your input is invalid.");
    }
    } //end of main method
} //end of class