//Ryan Kartiko
//CSE2
//hw04-WhichNumber
//Feb. 17, 2015
//
//  Have the user think of an int between 1 and 10 inclusive.
//  The program will go through a series of questions via 
//  selection statements in order to guess the number.


import java.util.Scanner; //import Scanner

//class setup
public class WhichNumber {
    //main method used for every program
    public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);     //prompt the user for input
    String Y, y, N, n;
    
    //Have the user think of a number
        System.out.println("Think of an int value between 1 and 10 inclusive and answer "); 
        System.out.println("the following questions with Y or y for yes and N or n for no.");
        
    //Go through the series of questions
        System.out.println("Is the number even? ");
        String q1 = input.nextLine(); //declares q1 and assigns user value
        if (q1.equalsIgnoreCase ("y")){
            System.out.println("Is it divisible by 3? ");
            String q2a = input.nextLine(); //declares q2a and assigns user value
            if (q2a.equalsIgnoreCase ("y")){
                System.out.println("Is your number 6? ");
                String q6 = input.nextLine();
                if (q6.equalsIgnoreCase("y")){
                    System.out.println("Yay!");
                }
                else if (q6.equalsIgnoreCase("n")){
                    System.out.println("That is not consistent.");
                }
                else { //for output if input is invalid
                    System.out.println("Sorry that is not a valid input."); 
                }
                
            }
            else if (q2a.equalsIgnoreCase("n")){
                System.out.println("Is your number divisible by 4? ");
                String q3a = input.nextLine(); //declares q3a and assigns user value
                if (q3a.equalsIgnoreCase ("y")){
                    System.out.println("Is the number divided by 4 greater than 1?");
                    String q4a = input.nextLine(); //declares q4a and assigns user value
                    if (q4a.equalsIgnoreCase ("y")){
                        System.out.println("Is your number 8? ");
                        String q8 = input.nextLine();
                        if (q8.equalsIgnoreCase("y")){
                            System.out.println("Yay!");
                        }
                        else if (q8.equalsIgnoreCase("n")){
                            System.out.println("That is not consistent.");
                        }
                        else { //for output if input is invalid
                            System.out.println("Sorry that is not a valid input.");
                        }
                        
                    }
                    else if (q4a.equalsIgnoreCase("n")){
                        System.out.println("Is your number 4? ");
                        String q4 = input.nextLine();
                        if (q4.equalsIgnoreCase("y")){
                            System.out.println("Yay!");
                        }
                        else if (q4.equalsIgnoreCase("n")){
                            System.out.println("That is not consistent.");
                        }
                        else { //for output if input is invalid
                            System.out.println("Sorry that is not a valid input.");
                        }
                        
                    }
                    else { //for output if input is invalid
                        System.out.println("Sorry that is not a valid input.");
                    }
                }
                else if (q3a.equalsIgnoreCase("n")){
                    System.out.println("Is it divisible by 5? ");
                    String q5a = input.nextLine(); //declares q5a and assigns user value
                    if (q5a.equalsIgnoreCase ("y")){
                        System.out.println("Is your number 10? ");
                        String q10 = input.nextLine();
                        if (q10.equalsIgnoreCase("y")){
                            System.out.println("Yay!");
                        }
                        else if (q10.equalsIgnoreCase("n")){
                            System.out.println("That is not consistent.");
                        }
                        else { //for output if input is invalid
                            System.out.println("Sorry that is not a valid input.");
                        }
                        
                    }
                    else if (q5a.equalsIgnoreCase ("n")){
                        System.out.println("Is your number 2? ");
                        String q2 = input.nextLine();
                        if (q2.equalsIgnoreCase("y")){
                            System.out.println("Yay!");
                        }
                        else if (q2.equalsIgnoreCase("n")){
                            System.out.println("That is not consistent.");
                        }
                        else { //for output if input is invalid
                            System.out.println("Sorry that is not a valid input.");
                        }
                        
                    }
                    else { //for output if input is invalid
                        System.out.println("Sorry that is not a valid input.");
                    }
                }
                else { //for output if input is invalid
                    System.out.println("Sorry that is not a valid input.");
                }     
            }
            else { //for output if input is invalid
            System.out.println("Sorry that is not a valid input.");
            }
        }
        else if (q1.equalsIgnoreCase ("n")){
            System.out.println("Is it divisible by 3? ");
            String q2b = input.nextLine(); //declares q2b and assigns user value
            if (q2b.equalsIgnoreCase ("y")){
                System.out.println("When divided by 3, is the result greater than 1? ");
                String q3b = input.nextLine(); //declares q3b and assigns user value
                if (q3b.equalsIgnoreCase("y")){
                    System.out.println("Is your number 9? ");
                    String q9 = input.nextLine();
                    if (q9.equalsIgnoreCase("y")){
                        System.out.println("Yay!");
                    }
                    else if (q9.equalsIgnoreCase("n")){
                        System.out.println("That is not consistent.");
                    }
                    else { //for output if input is invalid
                        System.out.println("Sorry that is not a valid input.");
                    }
                    
                }
                else if (q3b.equalsIgnoreCase("n")){
                    System.out.println("Is your number 3? ");
                    String q3 = input.nextLine();
                    if (q3.equalsIgnoreCase("y")){
                        System.out.println("Yay!");
                    }
                    else if (q3.equalsIgnoreCase("n")){
                        System.out.println("That is not consistent.");
                    }
                    else { //for output if input is invalid
                        System.out.println("Sorry that is not a valid input.");
                    }
                    
                }
                else { //for output if input is invalid
                    System.out.println("Sorry that is not a valid input.");
                }
            }
            else if (q2b.equalsIgnoreCase("n")){
                System.out.println("Is it greater than 6? ");
                String q4b = input.nextLine(); //declares q4b and assigns user value
                if (q4b.equalsIgnoreCase("y")){
                    System.out.println("Is your number 7? ");
                    String q7 = input.nextLine();
                    if (q7.equalsIgnoreCase("y")){
                        System.out.println("Yay!");
                    }
                    else if (q7.equalsIgnoreCase("n")){
                        System.out.println("That is not consistent.");
                    }
                    else { //for output if input is invalid
                        System.out.println("Sorry that is not a valid input.");
                    }
                    
                }
                else if (q4b.equalsIgnoreCase("n")){
                    System.out.println("Is it less than 3? ");
                    String q5b = input.nextLine(); //declares q5b and assigns user value
                    if (q5b.equalsIgnoreCase("y")){
                        System.out.println("Is your number 1? ");
                        String q1x = input.nextLine();
                        if (q1x.equalsIgnoreCase("y")){
                            System.out.println("Yay!");
                        }
                        else if (q1x.equalsIgnoreCase("n")){
                            System.out.println("That is not consistent.");
                        }
                        else { //for output if input is invalid
                            System.out.println("Sorry that is not a valid input.");
                        }
                        
                    }
                    else if (q5b.equalsIgnoreCase("n")){
                        System.out.println("Is your number 5? ");
                        String q5 = input.nextLine();
                        if (q5.equalsIgnoreCase("y")){
                            System.out.println("Yay!");
                        }
                        else if (q5.equalsIgnoreCase("n")){
                            System.out.println("That is not consistent.");
                        }
                        else { //for output if input is invalid
                            System.out.println("Sorry that is not a valid input.");
                        }
                        
                    }
                    else { //for output if input is invalid
                        System.out.println("Sorry that is not a valid input.");
                    }
                }
                else { //for output if input is invalid
                    System.out.println("Sorry that is not a valid input.");
                }
            }
            else { //for output if input is invalid
                System.out.println("Sorry that is not a valid input.");
            }
        }
        else { //for output if input is invalid
            System.out.println("Sorry that is not a valid input.");
        }
    
    } //end of main method
} //end of class