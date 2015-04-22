//Ryan Kartiko
//CSE2
//hw12-Multiply
//April 21, 2015

import java.util.Scanner;

public class Multiply {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        int height1, height2, width1, width2;
        while (true) { //these nested while loops will check that the inputs are compatible and that they are ints > 0
            while (true) {
                System.out.println("Enter a value for the height of the first array: ");
                if (myScanner.hasNextInt() && myScanner.nextInt() > 0) {
                    height1 = myScanner.nextInt();
                    continue;
                }
                else {
                    System.out.println("The value is invalid. Try again.");
                }
            }
            while (true) {
                System.out.println("Enter a value for the width of the first array: ");
                if (myScanner.hasNextInt() && myScanner.nextInt() > 0) {
                    width1 = myScanner.nextInt();
                    continue;
                }
                else {
                    System.out.println("The value is invalid. Try again.");
                }
            }
            while (true) {
                System.out.println("Enter a value for the height of the second array: ");
                if (myScanner.hasNextInt() && myScanner.nextInt() > 0) {
                    height2 = myScanner.nextInt();
                    continue;
                }
                else {
                    System.out.println("The value is invalid. Try again.");
                }
            }
            while (true) {
                System.out.println("Enter a value for the width of the second array: ");
                if (myScanner.hasNextInt() && myScanner.nextInt() > 0) {
                    width2 = myScanner.nextInt();
                    continue;
                }
                else {
                    System.out.println("The value is invalid. Try again.");
                }
            }
            if (height1 == width2 && height2 == width1) {
                continue;
            }
            else {
                System.out.println("The values are not compatible for Matrix Multiplication. Try again.");
            }
        } //end of outer while    
        int[][] finalMatrix = new int[height1][width2];
        finalMatrix = matrixMultiply(randomMatrix(width1,height1),randomMatrix(width2,height2));
        System.out.print(finalMatrix);
    
    } //end of main method
    
    public static int[][] randomMatrix(int width, int height) {
        int [][] randomMatrix = new int[height][width];
        for (int i = 0; i<(height-1); i++) {
            for (int j = 0; j<width - 1; j++) {
                randomMatrix[i][j] = (int)(Math.random()*21 + (-10));
            }
        }
        return randomMatrix;
    } //end of randomMatrix method
    
    public static int[][] matrixMultiply(int[][] array1, int[][]array2) {
        int[][] matrix = new int[array1.length][array2[0].length];
        for (int i =0; i<array1.length - 1; i++){
            for (int j = 0; j<array2[0].length - 1; j++) {
                int sum = 0;
                for (int k = 0; k<array1.length - 1; k++) {
                    sum += (array1[i][k]*array2[k][j]);
                }
                matrix[i][j] = sum;
            }
        }
        return matrix;
    } //endof matrixMultiply method
} //end of class