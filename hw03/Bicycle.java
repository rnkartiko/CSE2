//Ryan Kartiko
//CSE002
//hw03-Bicycle
//Feb. 10, 2015
//
//  Given two user inputs, calculate distance
//  traveled and average MPH

import java.util.Scanner; //import Scanner

//class setup
public class Bicycle {
    //main method used for every program
    public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);     //prompt the user for input
    
    //Ask the user for number of counts (rotations of wheel)
        System.out.print("Enter the number of counts: "); //ask for the number of counts
        double nCounts = input.nextDouble(); //declare nCounts and assign value from user
        
    //Ask the user for number of seconds
        System.out.print("Enter the number of seconds: "); //ask for the number of seconds
        double nSeconds = input.nextDouble(); //declare nSeconds and assign value from user
        
	//our intermediate variables and output data
    	double wheelDiameter = 27.0,  // diameter of the front wheel
      	PI = 3.14159, // constant pi
      	feetPerMile = 5280,  // number of feet in one mile
      	inchesPerFoot = 12,   // number of inches in one foot
      	secondsPerMinute = 60;  // number of seconds in one minute
      	
    //our calculations
        double distance = nCounts*wheelDiameter*PI; 
            //give the distance; diameter*pi gives circumference
            //nCounts*circumference gives distance
        distance /= inchesPerFoot*feetPerMile; //gives distance in miles
            distance = (int) (distance*100);
            distance = (double) (distance/100);
    
        double nHours = (nSeconds/secondsPerMinute)/60; //gives nHours of trip
            nHours = (int) (nHours*100);
            nHours = (double) (nHours/100);
        double aMPH = distance/nHours; //gives average MPH
            aMPH = (int) (aMPH*100);
            aMPH = (double) (aMPH/100);
        
    //print the results
        System.out.println("The distance was " + distance + " miles and took " + nHours + " hours"); //print the distance and time
        System.out.println("The average MPH was " + aMPH);
    }    
}