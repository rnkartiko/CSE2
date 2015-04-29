//Ryan Kartiko
//CSE2
//hw13-FourDwin
//April 28, 2015

import java.util.Scanner;

public class FourDwin {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        int x = myScanner.nextInt();
        System.out.println("Enter a value for y: ");
        int y = myScanner.nextInt();
        if (x < y) {
            int[][][][] myArray = new int[3][(int) (Math.random() *(y-x+1) + x)][(int) (Math.random() *(y-x+1) + x)][(int) (Math.random() *(y-x+1) + x)];
        }
        for (int a=0; a<3;a++) {
            for (int b=0; b< myArray[][].length;b++) {
                for (int c=0; c< myArray[][][].length;c++) {
                    for (int d=0; d< myArray[][][][].length;d++) {
                        myArray[a][b][c][d] = (double) (Math.random()*31.0 + 0);
                    }
                }
            }
        }
        System.out.println("Sum: "+statArray(myArray));
        System.out.println("Mean: "+statArray(myArray));
        System.out.println("Number of Elements: "+statArray(myArray));
    } //end of main method
    
    public static int statArray(int[][][][] array) {
        int numberOfElements = 0;
        int sum = 0;
        for (int a=0; a<3;a++) {
            for (int b=0; b<array[a].length;b++) {
                for (int c=0; c<array[a][b].length;c++) {
                    for (int d=0; d<array[a][b][c].length;d++) {
                        numberOfElements += 1;
                        sum += array[a][b][c][d];
                    }
                } 
            }
        }
        int mean = sum/numberOfElements;
        return sum;
        return numberOfElements;
        return mean;
    } //end of statArray method
} //end of class