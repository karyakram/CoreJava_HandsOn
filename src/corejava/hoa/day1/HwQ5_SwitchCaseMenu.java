package corejava.hoa.day1;
import java.util.Scanner;
public class HwQ5_SwitchCaseMenu {

		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			int choice;
			char ch;
			int total_amount = 0;
			do{
				System.out.println("Paradise Hotel Menu");
				System.out.println("1. Masala Dosa...100");
				System.out.println("2. Chole Kulche...120");
				System.out.println("3. Daal Baati...150");
				System.out.println("4. Dhokla...70");
				System.out.println("5. Luchi Aloo...85");
				System.out.println("6. White Chocolate Gajak...25");
				System.out.println("Enter the number to pick dish: ");
				choice = s.nextInt();
				s.nextLine();
				switch(choice){
				case 1:
					total_amount += 100;
					break;
				case 2:
					total_amount += 120;
					break;
				case 3:
					total_amount += 150;
					break;
				case 4:
					total_amount += 70;
					break;
				case 5:
					total_amount += 85;
					break;
				case 6:
					total_amount += 25;
					break;
				default:
					System.out.println("Invalid choice.");
				}
				System.out.println("Press Y to continue.");
				ch = s.nextLine().charAt(0);
			}while(ch=='Y' || ch=='y');
			if(total_amount > 500)
				System.out.println("You have received bonus dessert.");
			System.out.println("Total amount: "+total_amount);
		}
	}



