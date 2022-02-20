package corejava.hoa.day3.que5;
import java.util.Scanner;
public class testClass implements in1 {

	
	boolean isprime(int n) {
		boolean result=true;
		if(n==1 || n==0) {
			return false;
		}
		for(int i =2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				result=false;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int k = sc.nextInt();
			testClass p = new testClass();
			p.display(k);
		}

	}

	@Override
	public void display(int k) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2;i<=k;i++) {
			if(isprime(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
