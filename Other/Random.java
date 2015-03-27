//Ryan Kartiko
//CSE02
//lab08-Factorials
//March 20, 2015

import java.util.Scanner; //import Scanner

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("The"+adjective()+subject()+verb()+"the"+adjective()+object());
            System.out.println("Enter 1 for another sentence. Enter any other int to quit.");
            int value = myScanner.nextInt();
            if (value == 1) {
                continue;
            }
            else {
                break;
            }
        }

    }
    
    public static String adjective() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        
        String adjective;
        switch (randomInt) {
            case 0: adjective = "blue";
                break;
            case 1: adjective = "soft";
                break;
            case 2: adjective = "gooey";
                break;
            case 3: adjective = "golden";
                break;
            case 4: adjective = "quick";
                break;
            case 5: adjective = "charming";
                break;
            case 6: adjective = "sacred";
                break;
            case 7: adjective = "smart";
                break;
            case 8: adjective = "long";
                break;
            case 9: adjective = "fuzzy";
                break;
        } 
        return adjective;
    } //end of adjective method
}