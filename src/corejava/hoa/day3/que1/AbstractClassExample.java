package corejava.hoa.day3.que1;

abstract class Parent{
	void display() {
		System.out.println("This is Parent class");
	}
}

class A extends Parent{
	void msg() {
		System.out.println("This is first subclass");
	}
}

class B extends Parent{
	void msg() {
		System.out.println("This is second subclass");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.msg();
		
		B b = new B();
		b.msg();

	}

}
