//Ryan Kartiko
//CSE2
//hw03-Root
//Feb. 10, 2015
//
//  Given a user input, I
//  will estimate its cube root


import java.util.Scanner; //import Scanner

//class setup
public class Root {
    //main method used for every program
    public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);     //prompt the user for input
    
    //Ask the user for a double
        System.out.print("Enter a double: "); //ask for a double
        double number = input.nextDouble(); //declares number and assigns user value
    
    //Begin estimating
        double root = number/3; //first estimate
        root = (2*root*root*root+number)/(3*root*root); //second estimate
        root = (2*root*root*root+number)/(3*root*root); //third estimate
        root = (2*root*root*root+number)/(3*root*root); //fourth estimate
        root = (2*root*root*root+number)/(3*root*root); //fifth estimate
        root = (2*root*root*root+number)/(3*root*root); //sixth estimate
        double original =(root*root*root); //final check
        
    //print the results
        System.out.println("The cube root is "+root+": ");
        System.out.println(+root+"*"+root+"*"+root+" = "+original);
    }
}