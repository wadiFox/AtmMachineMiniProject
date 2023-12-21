package git.atmproject;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
       int atmnumber = 12345;
       int atmpin = 123;
       System.out.println("WELOCOME TO ATM");
       Scanner input = new Scanner(System.in);
       System.out.print("Enter ATM number : ");
       int atmNumber = input.nextInt();	
       System.out.print("Enter PIN number : ");
       int pin = input.nextInt();	
       
       if((atmnumber==atmNumber) && (atmpin==pin)) {
    	   System.out.print("Validation correct");
    	   while(true) {
    		   System.out.println("1 - Check Balance\n2 - Withdraw Amount\n3 - Deposit Amount\n4 - View ministatement\n 5 -  Exit");
    		   System.out.print("Enter Choice : ");
    		   int choice = input.nextInt();
    		   switch(choice) {
    		   case 1 : 
    			   break;
    		   case 2 : 
    			   break;
    		   case 3 : 
    			   break;
    		   case 4 : 
    			   break;
    		   case 5 :
    			   System.out.print("Collect your Card\n Thank you for using our ATM");
    			   System.exit(0);
    			   break;
    		   default :	   
    			   System.out.print("Please enter a correct choice!");
    		   }
    	   }
       }else {
    	   System.out.print("Incorrect ATM number or pin");
       }
	}

}
