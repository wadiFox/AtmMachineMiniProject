package git.atmproject;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int atmnumber = 12345;
       int atmpin = 123;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter ATM number : ");
       int atmNumber = input.nextInt();	
       System.out.print("Enter PIN number : ");
       int pin = input.nextInt();	
       
       if((atmnumber==atmNumber) && (atmpin==pin)) {
    	   System.out.print("Validation correct");
       }else {
    	   System.out.print("Incorrect ATM number or pin");
       }
	}

}
