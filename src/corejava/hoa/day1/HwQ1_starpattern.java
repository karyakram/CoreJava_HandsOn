package corejava.hoa.day1;
import java.util.Scanner;
public class HwQ1_starpattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i;j--) {
				System.out.print(" * ");	
			}
			System.out.println();	
		}
		
	}
}
