//Ryan Kartiko
//CSE002
//lab04-Cookies
//Feb. 13, 2015
//
//  Given user inputs for number of cookies, number of people, and cookies
//  per person, determine, first if the number are valid, if the number of cookies
//  is divisible among the people, and if not then how many more cookies are needed.

import java.util.Scanner; //import Scanner

//class setup
public class Cookies {
    //main method used for every program
    public static void main(String [] args) {
    
    Scanner myScanner;
    myScanner = new Scanner(System.in);     //prompt the user for input    
    
    //Ask the user for number of people
        System.out.print("Enter the number of people: "); //ask for number of people
        if (myScanner.hasNextInt()){ //validates that the value entered is an int
        }
        else {
            System.out.println("You did not enter an int."); //states that input was not an integer
            return; //terminates the program
        }
                int nPeople = myScanner.nextInt(); //declare nPeople and assign value from user

    //Ask the user for number of cookies
        System.out.print("Enter the number of cookies: "); //ask for number of cookies
        if (myScanner.hasNextInt()){ //validates that the value entered is an int
        }
        else {
            System.out.println("You did not enter an int."); //states that input was not an integer
            return; //terminates the program
        }
                int nCookies = myScanner.nextInt(); //declare nCookies and assign value from user
        
    //Ask the user for number of cookies per person
        System.out.print("How many cookies should each person get? "); //Ask for how many cookies each person should get
        int nCookiesper = myScanner.nextInt(); //declare nCookiesper and assign value from user
        
    //Run the conditional statements    
        if (nPeople > 0 && nCookies > 0){ //make sure the number of people and cookies > 0
            if ((nPeople * nCookiesper) <= nCookies && nCookies % nPeople == 0){ //make sure you have enough cookies for everyone and that the amount divides evenly
                System.out.println("You have enough cookies for each person and the amount will divide evenly."); //states that the number of cookies is enough and divides evenly
            }    
            else if ((nPeople * nCookiesper) <= nCookies && nCookies % nPeople != 0){ //make sure you have enough cookies for everyone, but the amount doesn't divide evenly
                System.out.println("You have enough cookies for each person but the amount will not divide evenly.");//states that the number of cookies is enough but doesn't divide evenly
            }
            else if ((nPeople * nCookiesper) > nCookies){ //if there aren't enough cookies
                int nNeeded = (nPeople * nCookiesper) - nCookies; //variable to determine how many more cookies are need
                System.out.println("You do not have enough cookies for each person. You need at least " + nNeeded + " more cookies."); //states that there aren't enough cookies and outputs how many more are needed
            }
        }
        else { //else statement if the inputs were not > 0
            System.out.println("You did not enter an int > 0."); //states that the inputs were not > 0
        }
    } //end of main method
} //end of class