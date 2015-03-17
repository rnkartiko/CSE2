//Ryan Kartiko
//CSE02
//hw07-waves
//March 17, 2015

//  This program will take a user input between 1 and 30
//  inclusive and print out the desired pattern using
//  three different loops.

import java.util.Scanner; //import Scanner

//class setup
public class waves {
    //main method for every program
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in); //prompt user for input
        
        System.out.println("Enter a number between 1 and 30: ");
        int number = myScanner.nextInt(); //declare and assign number
        
        System.out.println("FOR LOOP:");
        for (int i=1; i<(number+1); i++) { 
            if (i%2 ==0) {
                for (int m=1; m<i+1; m++) {
                    for (int n=0; n<m; n++) {
                        System.out.print(i);
                    }
                    System.out.println("");
                }
            }
            else {
                for (int t=0; t<i; t++) {
                    for (int u=i; u>t; u--) {
                        System.out.print(i);
                    }
                    System.out.println("");
                }
            }
        }
        
        System.out.println("WHILE LOOP:");
        int i=1;
        while (i<(number+1)) {
            if (i%2 == 0) {
                int m=1;
                while(m<(i+1)) {
                    int n=0; 
                    while(n<m) {
                        System.out.print(i);
                        n++;
                    }
                    System.out.println("");
                    m++;
                }
            }
            else {
                int t=0;
                while(t<i) {
                    int u=i;
                    while(u>t) {
                        System.out.print(i);
                        u--;
                    }
                    System.out.println("");
                    t++;
                }
            }
            i++;
        }
        
        System.out.println("DO-WHILE LOOP:");
        int j=1;
        do {
            if (j%2 == 0) {
                int m=1;
                do {
                    int n=0;
                    do {
                        System.out.print(j);
                        n++;
                    }
                    while (n<m);
                    System.out.println("");
                    m++;
                }
                while (m<(j+1));
            }
            else {
                int t=0;
                do {
                    int u=j;
                    do {
                        System.out.print(j);
                        u--;
                    }
                    while(u>t);
                    System.out.println("");
                    t++;
                }
                while (t<j);
            }
            j++;
        }
        while (j<(number+1));
        
        
        
    } //end of main method
} //end of class