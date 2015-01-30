//Ryan Kartiko
//CSE 02
//lab02-Cyclometer
//Jan.30, 2015
//
//  Given time in seconds and rotations, find:
//      number of minutes per trip
//      number of counts per trip
//      distance in miles per trip
//      distance in miles of whole trip
//

public class Cyclometer {
    //main method for every java program
    public static void main(String [] args) {
    
    
    //Enter our data
    
    int secsTrip1 = 480;  // time of Trip1
    int secsTrip2 = 3220; // time of Trip2
    int countsTrip1 = 1561; // number of rotations of front wheel of Trip1
	int countsTrip2 = 9037; // number of rotations of front wheel of Trip2
	
	
	//our intermediate variables and output data
	
	double wheelDiameter = 27.0,  // diameter of the front wheel
  	PI = 3.14159, // constant pi
  	feetPerMile = 5280,  // number of feet in one mile
  	inchesPerFoot = 12,   // number of inches in one foot
  	secondsPerMinute = 60;  // number of seconds in one minute
	double distanceTrip1, distanceTrip2,totalDistance;  // declare these variables


    //print out our variable values
    
    System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");


    //carry out the calculations and store the values
    
    distanceTrip1 = countsTrip1*wheelDiameter*PI;
    	// Above gives distance of Trip1 in inches
    	// (for each count, or one wheel rotation, a distance of the diameter
    	// times pi, or the circumference, is traveled)
	distanceTrip1 /= inchesPerFoot*feetPerMile; // Gives distance of Trip1 in miles
	distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance of Trip2 in miles
	totalDistance = distanceTrip1+distanceTrip2; // Gives Total distance in miles
	
	
	//Print out the output data.
	
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
    
    }
}
