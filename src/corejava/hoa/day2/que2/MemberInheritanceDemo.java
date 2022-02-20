package corejava.hoa.day2.que2;

class Member{
	String name;
	int age;
	int mob_no;
	String address;
	int salary;
		
	void printSalary() {
		System.out.println("The salary is : "+salary);
	}
}

class Employee extends Member{
	String spec;
	String dept;
	void display1() {
		System.out.println("Name - >"+name+" "+"Age - >"+age+" "+"Mobile number ->"+mob_no+" "+" Address - >"+address+" "+"Salary -> "+salary);
		System.out.println("The specialization is : "+spec);
		System.out.println("The Department is : "+dept);
	}
}

class Manager extends Member{
	String spec;
	String dept;
	void display2() {
		System.out.println("Name - >"+name+" "+"Age - >"+age+" "+"Mobile number ->"+mob_no+" "+" Address - >"+address+" "+"Salary -> "+salary);
		System.out.println("The specialization is : "+spec);
		System.out.println("The Department is : "+dept);
	}
}


public class MemberInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.display1();
		
		Manager m1 = new Manager();
		m1.display2();		

	}
}
