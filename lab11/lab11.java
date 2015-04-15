//Ryan Kartiko
//CSE2
//lab11-Arrays
//April 10, 2015

import java.util.Scanner;

public class lab11 {
    public static void main(String [] args) {
        int [] array1 = new int[50];
        int [] array2 = new int[50];
        
        //this next part is for array1
            for (int i = 0; i<50; i++) {
                array1[i] = (int) (Math.random()*101);
            }
    
            int min1 = 100; //set min1 to 100
            int max1 = 0; //set max1 0
            for (int j = 0; j<50; j++) {
                if (array1[j] > max1) {
                    max1 = array1[j];
                }
                if (array1[j] < min1) {
                    min1 = array1[j];
                }
            }
            System.out.println("The max of array1 is: "+max1);
            System.out.println("The min of array1 is: "+min1);
            
            
        //this next part is for array2
            //declare values for array2
            array2[0] = (int) (Math.random()*101);
            for (int k = 1; k<50; k++) {
                if (k%3 == 0) {
                    array2[k] = array2[-1] + 2;
                }
                else if (k%5 == 0) {
                    array2[k] = array2[k-1] + 3;
                }
                else {
                    array2[k] = array2[k-1] + 1;
                }
            }
            
            //find and print the min and max of array2
            int min2 = array2[0];
            int max2 = array2[0];
            for (int x = 1; x<50; x++) {
                if (array2[x] > max2) {
                    max2 = array2[x];
                }
                else if (array2[x] < min2) {
                    min2 = array2[x];
                }
            }
            System.out.println("The max of array2 is: "+max2);
            System.out.println("The min of array2 is: "+min2);
            
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter an int: ");
            if (myScanner.hasNextInt()) {
                int key = myScanner.nextInt();
                if (key >= 0) {
                    binarySearch(array2,0,49,key);
                }
                else {
                    System.out.println("You did not enter an int >= 0.");
                }
            }
            else {
                System.out.println("You did not enter an int.");
            }
    } //end of main method
    
    public static String binarySearch(int[] list, int lower, int upper, int key) {
        int position = (lower + upper)/2;
        String result;
        
        while (lower <= upper) {
            if (list[position] > key) {
                upper = position - 1;
            }
            else if (list[position] < key) {
                lower = position + 1;
            }
            else {
                result = "The number was found.";
                break;
            }
            position = (lower + upper)/2;
            result = "The number was not found. /n The number above was: " +list[upper]+ "./n The number below was: " +list[lower]+".";
        }
        return result;
    } //end of binarySearch method 
} //end of class