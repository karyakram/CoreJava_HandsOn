package corejava.hoa.day1;
import java.util.Scanner;

public class HwQ4_DoWhileAtmPinChecker {
	public static void main(String[] args){
		int correct_pin = 1912;
	    	int entered_pin;
	    	int count = 3;
	    	Scanner scan_inp = new Scanner(System.in);
	    	do{
	        	System.out.println("Enter your pin: ");
	        	entered_pin = scan_inp.nextInt();
	    	}while(entered_pin != correct_pin && --count != 0);
	    	if(count == 0)
	  	      	System.out.println("**Attempts limit reached**\nAccount Locked.");   
	    	else
    			System.out.println("Welcome. You may now proceed to banking.");

	}
}



	
