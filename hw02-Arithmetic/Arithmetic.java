//Ryan Kartiko
//CSE 02
//hw02-Arithmetic
//Feb. 3, 2015
//
//  Using data stored in variables and simple calculations print:
//      Total cost of each kind of item; sales tax for that total cost
//      Total cost of purchases (before tax)
//      Total actually paid for this transaction, including sales tax


//set up class 
public class Arithmetic {
    //main method for every java program
    public static void main(String [] args) { 
        
        //Enter our input variables 
        
            int nSocks=3;  //Number of pairs of socks
            double sockCost$=2.58; //cost per pair of socks, "$" is part of variable name
    
            int nGlasses=6; //Number of drinking glasses
            double glassCost$=2.29; //cost per glass
    
            int nEnvelopes=1; //Number of boxes of envelopes
            double envelopeCost$=3.25; //cost per box of envelopes
            double taxPercent=0.06; //sales tax percentage
        
        //Calculate total cost of each item & sales tax for that cost
        
            //Calculate total cost of socks & sales tax for socks
            
                double Socks$=nSocks*sockCost$; //total cost of socks before tax
                double SocksTax$=Socks$*taxPercent; //sales tax for socks
                double totalSocks$=Socks$+SocksTax$; //total cost of socks with tax
                
                //Convert SocksTax$ to value with two decimal places
                    
                    double x=SocksTax$*100; //multiply sales tax for socks by 100
                    int y=(int) x; //cast tax of Socks into integer value
                    double z=(double) y; //cast tax of Socks back into double value
                    double NewSocksTax$=z/100; //final tax price for socks with two decimal places
                
                //print the cost of Socks and tax from Socks
                
                    System.out.println("The cost of socks without tax is $" + Socks$); //print the cost of socks without tax
                    System.out.println("The tax from socks is $" + NewSocksTax$); //print the tax from the socks
                    
            //Calculate total cost of glass & sales tax for glasses
                
                double Glasses$=nGlasses*glassCost$; //total cost of glasses before tax
                double GlassesTax$=Glasses$*taxPercent; //sales tax for glasses
                double totalGlasses$=Glasses$+GlassesTax$; //total cost of glasses with tax
                
                //Convert GlassesTax$ to value with two decimal places
                
                    double a=GlassesTax$*100; //multiply sales tax for glasses by 100
                    int b=(int) a; //cast tax of Glasses into integer value
                    double c=(double) b; //cast tax of Glasses back into double value
                    double NewGlassesTax$=c/100; //final tax price for glasses with two decimal places
                    
                //print the cost of glasses and tax from glasses
                
                    System.out.println("The cost of glasses without tax is $" + Glasses$); //print the cost of glasses without tax
                    System.out.println("The tax from glasses is $" + NewGlassesTax$); //print the tax from glasses
                    
            //Calculate total cost of envelopes & sales tax for envelopes
            
                double Envelopes$=nEnvelopes*envelopeCost$; //total cost of envelopes before tax
                double EnvelopesTax$=Envelopes$*taxPercent; //sales tax for envelopes
                double totalEnvelopes$=Envelopes$+EnvelopesTax$; //total cost of envelopes with tax
                
                //Convert EnvelopesTax$ to value with two decimal places
                
                    double h=EnvelopesTax$*100; //multiply sales tax for envelopes by 100
                    int i=(int) h; //cast tax of envelopes into integer value
                    double j=(double) i; //cast tax of envelopes back into double value
                    double NewEnvelopesTax$=j/100; //final tax price for envelopes with two decimal places
                    
                //print the cost of envelopes and tax from envelopes
                
                    System.out.println("The cost of envelopes without tax is $" + Envelopes$); //print the cost of envelopes without tax
                    System.out.println("The tax from envelopes is $" + NewEnvelopesTax$); //print the tax from envelopes
                
        //Calculate total Costs of All Items and total sales tax
        
            double TotalCosts$=Socks$+Glasses$+Envelopes$; //total cost of all items before tax
            double TotalTax$=SocksTax$+GlassesTax$+EnvelopesTax$; //total sales tax from all items
            double FinalCost$=TotalCosts$+TotalTax$; //total cost of all items with tax
            
            //Convert TotalTax$ to value with two decimal places
                
                double d=TotalTax$*100; //multiply total tax by 100
                int e=(int) d; //cast total tax into integer value
                double f=(double) e; //cast total tax back into double value
                double NewTotalTax$=f/100; //final total tax price with two decimal places
            
            //Convert FinalCost$ to value with two decimal places
            
                double q=FinalCost$*100; //multiply final cost by 100
                int r=(int) q; //cast final cost into integer value
                double s=(double) r; //cast final cost back into double value
                double NewFinalCost$=s/100; //final cost of everything with two decimal places
                
            //print the total costs of all items and total sales tax
            
                System.out.println("The total cost of all items without tax is $" + TotalCosts$); //print the total cost of all items before tax
                System.out.println("The total sales tax from all items is $" + NewTotalTax$); //print the total sales tax of all items
                System.out.println("The total cost of all items with sales tax is $" + NewFinalCost$); //print the final cost
                
    }
}