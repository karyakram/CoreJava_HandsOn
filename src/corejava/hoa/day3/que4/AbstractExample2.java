package corejava.hoa.day3.que4;

abstract class ABC{

	public ABC() {   //constructor
		super();
		// TODO Auto-generated constructor stub
		System.out.println("This is constructor of abstract class");
	}
	
	abstract void a_method(); //abstract method
	
	void normalMethod() {		//normal method
		System.out.println("This is a normal method of abstract class");
	}
	
}

class SubClass extends ABC{
	
	void a_method() {
		System.out.println("This is abstract method");
	}
}
public class AbstractExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj = new SubClass();
		obj.a_method();
		
		obj.normalMethod();

	}

}
