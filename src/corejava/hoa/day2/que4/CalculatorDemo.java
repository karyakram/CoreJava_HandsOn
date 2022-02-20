package corejava.hoa.day2.que4
;
class Calculator{
	void addition(int a, int b) {
		System.out.println("The sum of operands : "+(a+b));
	}
	
	void addition(String s1, String s2, String s3) {
		System.out.println("The string after concatenation "+(s1+s2+s3));
	}
	
	void substraction(int p, int q) {
		System.out.println("The subtration of numbers is : "+(p-q));
	}
	
	void substration(double d, double e) {
		System.out.println("Decimal point substraction "+(d-e));
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.addition(5, 4);
		c1.addition("Sudesh", "Singh","Rajput");
		c1.substraction(10, 5);
		c1.substration(11.55, 5.50);

	}

}
