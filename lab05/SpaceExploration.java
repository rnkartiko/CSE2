//Ryan Kartiko
//CSE002
//lab05-SpaceExploration
//Feb. 20, 2015

//  Given a random input of a year between 2000 and 2010
//  we will use a switch statement to list events that 
//  happened from 2000 to the desired year


public class SpaceExploration {
    //main method for every code
    public static void main (String [] args) {

        int year =(int)(Math.random()*11) + 2000; //generates random number between 2000 and 2010 inclusive
        System.out.println("The timeline of space exploration events from " +year+ " to 2000 is: ");
        
        switch (year) { //switch statement 
            case 2010: 
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
            case 2009:
                System.out.println("2009: N/A");
            case 2008:    
                System.out.println("2008: Kepler launched to study deep space");
            case 2007:
                System.out.println("2007: N/A");
            case 2006:   
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 2005:
                System.out.println("2005: Spacecraft collies with comet");
            case 2004:   
                System.out.println("2004: N/A");
            case 2003:
                System.out.println("2003: Largest infrared telescope released");
            case 2002:
                System.out.println("2002: N/A");
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
                /* this switch statement takes advantage of the fallthrough behavior; if a year is generated
                then it will only print events that occurred from 2000 up to that year. This is because no "break"
                statement is put in until the very end */
                break; //break to close switch statement
        }
        
    }
}