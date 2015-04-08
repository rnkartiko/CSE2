//Ryan Kartiko
//CSE2
//hw10-Elimination
//April 7, 2015

import java.util.Scanner;
public class Elimination{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	
	do{
      	System.out.print("Random input 10 ints [0-9]");
      	num = randomInput();
      	String out = "The original array is:";
      	out += listArray(num);
      	System.out.println(out);
     
      	System.out.print("Enter the index ");
      	index = scan.nextInt();
      	newArray1 = delete(num,index);
      	String out1="The output array is ";
      	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out1);
     
        System.out.print("Enter the target value ");
      	target = scan.nextInt();
      	newArray2 = remove(num,target);
      	String out2="The output array is ";
      	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out2);
      	 
      	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      	answer=scan.next();
	}
	while(answer.equals("Y") || answer.equals("y"));
  } //end of main method
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  } //end of listArray method
  
  public static int[] randomInput() {
    int[] num = new int[10];
    num[0] = (int) (Math.random()*9);
    num[1] = (int) (Math.random()*9);
    num[2] = (int) (Math.random()*9);
    num[3] = (int) (Math.random()*9);
    num[4] = (int) (Math.random()*9);
    num[5] = (int) (Math.random()*9);
    num[6] = (int) (Math.random()*9);
    num[7] = (int) (Math.random()*9);
    num[8] = (int) (Math.random()*9);
    num[9] = (int) (Math.random()*9);
    return num;
  } //end of randomInput method
  
  public static int[] delete(int [] list, int pos) {
      int[] newArray1 = new int [9];
      if (pos >= 0 && pos <= 9) {
        for (int i=0; i<10; i++) {
            if (i == pos) {
                newArray1[i] = list[i+1];
                for (int x = i+1; x<10; x++) {
                  newArray1[x] = list[x+1];
                }
                break;
            }
            else {
              newArray1[i] = list[i];
            }  
        }
      }
      return newArray1;
  } //end of delete method
  
  public static int[] remove(int [] list, int target) {
    int[] newArray2 = new int [10];
    for (int j = 0; j<10; j++) {
      if (list[j] == target) {
        continue;
      }
      newArray2[j] = list[j];
    }
    return newArray2;
  } //end of remove method
}
