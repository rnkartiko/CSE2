//Ryan Kartiko
//CSE2-hw06
//March 3, 2015
//
//  This program takes a user input value
//  between 9 and 16 and outputs its factorial value.

public class MakeSymbols {
    //main method for every program
    public static void main(String [] args) {
        
        int value = (int) (0 + Math.random() * 100);
        System.out.println(value);
        
        if (value % 2 == 0) {
            int i = 0;
            do {
                System.out.print("*");
                i++;
            }
            while (i <= value);
        }
        else {
            int j = 0;
            do {
                System.out.print("&");
                j++;
            }
            while (j <= value);
        }
        
    } //end of main method
} //end of class