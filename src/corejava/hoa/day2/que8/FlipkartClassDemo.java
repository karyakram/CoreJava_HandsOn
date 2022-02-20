package corejava.hoa.day2.que8;

import java.util.Scanner;

public class FlipkartClassDemo {

//	Review 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reviews rev = new Reviews();
		
		Items items = new Items("Boat","Tommy Hilfiger","One Plus","Puma");
		items.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1 to see price of Headphone");
		System.out.println(" Enter 2 to see price of Shirt");
		System.out.println(" Enter 3 to see price of Mobile");
		System.out.println(" Enter 4 to see price of Shoes");
		
		int choice = sc.nextInt();
		switch(choice){
		
		case 1:
			System.out.println(" Price of "+items.headphone+" is 50000 ");
			break;
		case 2:
			System.out.println(" Price of "+items.shirt + " is 1200");
			break;
		case 3:
			System.out.println(" Price of "+ items.mobile + "is 10000");
			break;
		case 4:
			System.out.println(" Price of "+items.shoes + " is 3000");
			break;
		default:
			System.out.println(" Incorrect Option. Please enter a Valid Option!!");
			
			
		}
		
		System.out.println(" Enter 1 to see Review of Headphone");
		System.out.println(" Enter 2 to see Review of Shirt");
		System.out.println(" Enter 3 to see Review of Mobile");
		System.out.println(" Enter 4 to see Review of Shoes");
		
		
		int ab = sc.nextInt();
		switch(ab){
		
		case 1:
			rev.review("Boat");
			break;
		case 2:
			rev.review("Tommy Hilfiger");
			break;
		case 3:
			rev.review("One Plus");
			break;
		case 4:
			rev.review("Puma");
			break;
		default :
			System.out.println(" Enter valid input : ");
		}
		
		
	}
	

}