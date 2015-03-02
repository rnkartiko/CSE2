//Ryan Kartiko
//CSE2
//lab06-SmileGenerator
//Feb. 27, 2015

//  This program will print out 5 smileys on 1 line three times using three different loops,
//  randomly generate a number between 1 and 100 and print that number of smileys
//  with only 30 per line, and print that number of smileys again with an increment of 1 on each line.

public class SmileGenerator {
    //main method for every program
    public static void main (String [] args) {
        
        for (int i = 0; i <5; i++){
            System.out.print(":)");
        }
        System.out.println(" ");
        //this for loop prints out 5 smiley faces
        
        int j = 0;
        while (j < 5){
            System.out.print(":)");
            j++;
        }
        System.out.println(" ");
        //this while loop prints out 5 smiley faces
        
        int k = 0;
        do{
            System.out.print(":)");
            k++;
        }
        while (k < 5);
        System.out.println(" ");
        //this do-while loop prints out 5 smiley faces

        int nSmileys = (int) Math.floor((Math.random() * 100) + 1);
        System.out.println("The random number is: " +nSmileys); //random number of Smileys generated between 1 and 100
        
        int x = 1;
        while (x < nSmileys){
            System.out.print(":)");
            if (x == 30 || x == 60 || x == 90){
                System.out.println(" ");
            }
            x++;
        } 
        System.out.println(":)");
        //this loop prints out the random number of smileys with only 30 per line
        
        int y = 1, z = 1;
        while (z < nSmileys){
            System.out.print(":)"); 
            y++;
            z++;
        }
        
    } //end of main method
} //end of class