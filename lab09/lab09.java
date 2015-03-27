//Ryan Kartiko
//CSE2
//lab09-Methods
//March 27, 2015

//  This lab will be used to practice 
//  declaring and calling methods.

import java.util.Random;
import java.util.Scanner;

public class lab09 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("The "+adjective()+" "+subject()+" "+verb()+" the "+adjective()+" "+object()+".");
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
            default: adjective = " ";
        } 
        return adjective;
    } //end of adjective method
    
    public static String subject() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        
        String subject;
        switch (randomInt) {
            case 0: subject = "child";
                break;
            case 1: subject = "referee";
                break;
            case 2: subject = "player";
                break;
            case 3: subject = "coach";
                break;
            case 4: subject = "teacher";
                break;
            case 5: subject = "businessman";
                break;
            case 6: subject = "policeman";
                break;
            case 7: subject = "master";
                break;
            case 8: subject = "brother";
                break;
            case 9: subject = "student";
                break;
            default: subject = " ";
        } 
        return subject;   
    } //end of subject method
    
    public static String verb() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        
        String verb;
        switch (randomInt) {
            case 0: verb = "jumps";
                break;
            case 1: verb = "throws";
                break;
            case 2: verb = "runs";
                break;
            case 3: verb = "catches";
                break;
            case 4: verb = "hits";
                break;
            case 5: verb = "pushes";
                break;
            case 6: verb = "pulls";
                break;
            case 7: verb = "makes";
                break;
            case 8: verb = "paints";
                break;
            case 9: verb = "drinks";
                break;
            default: verb = " ";
        } 
        return verb;
    } //end of verb method
    
    public static String object() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        
        String object;
        switch (randomInt) {
            case 0: object = "chair";
                break;
            case 1: object = "plate";
                break;
            case 2: object = "cushion";
                break;
            case 3: object = "pillow";
                break;
            case 4: object = "water";
                break;
            case 5: object = "door";
                break;
            case 6: object = "fence";
                break;
            case 7: object = "bat";
                break;
            case 8: object = "ball";
                break;
            case 9: object = "piano";
                break;
            default: object = " ";
        }
        return object;
    } //end of object method
}