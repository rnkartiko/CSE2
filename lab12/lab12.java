//Ryan Kartiko
//CSE2
//lab12
//April 17, 2015

public class lab12 {
    public static void main(String [] args) {
        int width1 = (int) (Math.random()*9);
        int width2 = (int) (Math.random()*9);
        int height1 = (int) (Math.random()*9);
        int height2 = (int) (Math.random()*9);
        int[][] matrix1 = new int[height1][width1];
        int[][] matrix2 = new int[width1][height1];
        int[][] matrix3 = new int[width2][height2];
    } //end of main method
    
    public static void increasingMatrix(int width, int height, boolean format) {
        int[][] myArray = new int[height][width];
        if (format) {
            int counter = 0;
            for (int i=0; i<height;i++) {
                for (int j=0; j<width;j++) {
                    myArray[i][j]=counter;
                    counter += 1;
                }
            }    
        }
        else {
            int counter = 0;
            for (i=0; i<width; i++) {
                for (j=0;j<height;j++) {
                    myArray[i][j]=counter;
                    counter += 1;
                }
            }
        }
        System.out.println(myArray);
    } //end of increasingMatrix method
    
    public static void printMatrix(int[][] array, boolean format) {
        if (format) {
            
        }
    } //end of printMatrix method
} //end of class