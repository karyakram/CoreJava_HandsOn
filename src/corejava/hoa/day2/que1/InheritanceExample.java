package corejava.hoa.day2.que1;
class A{
	void msg1() {
		System.out.println("This is parent class");
	}
}

class B extends A{
	void msg2() {
		System.out.println("This is child class");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A();
		obj1.msg1();
		
		B obj2 = new B();
		obj2.msg2();
		
		B obj3 = new B();
		obj3.msg1();
	}

}
