package corejava.hoa.day6.que2;

import java.util.HashSet;

class Employee{
	int id, salary, experience;
	String name, skillset;
	public Employee(int id, String name, String skillset, int experience, int salary){
		this.id = id;
		this.name = name;
		this.skillset = skillset;
		this.experience = experience;
		this.salary = salary;
	}
}

class OldEmployee extends Employee{
	public OldEmployee(int id, String name, String skillset, int experience, int salary){
		super(id, name, skillset, experience, salary);
	}
}

class NewEmployee extends Employee{
	public NewEmployee(int id, String name, String skillset, int experience, int salary){
		super(id, name, skillset, experience, salary);
	}
}

public class EmployeeDemo{
	public static void main(String[] args){
		Employee e1 = new OldEmployee(101, "Babbar", "Cpp", 10, 45);
		Employee e2 = new OldEmployee(102, "Keerti", "Java", 4, 25);
		Employee e3 = new OldEmployee(103, "Raj", "Java", 5, 30);
		Employee e4 = new OldEmployee(104, "Ali", "Python", 4, 20);
		Employee e5 = new NewEmployee(105, "Aditya", "Cpp", 2, 15);
		Employee e6 = new NewEmployee(106, "Fatima", "Java", 8, 20);
		Employee e7 = new NewEmployee(107, "Pooja", "Python", 1, 10);
		HashSet<Employee> employeeSet = new HashSet<>();
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		employeeSet.add(e5);
		employeeSet.add(e6);
		employeeSet.add(e7);
		System.out.println("Number of employees = "+employeeSet.size());
		for(Employee e: employeeSet){
			if(e.id == 106)
				System.out.println(e.name+" has 106 id.");
			if(e.skillset.equals("Java"))
				System.out.println(e.name+"'s skillset is Java");					
		}
		System.out.println("Removing employees with experience less than 4 years...");
		HashSet<Employee> tempSet = new HashSet<>();
		for(Employee e: employeeSet){
			if(e.experience < 4){
				System.out.println(e.name + " removed.");		
				tempSet.add(e);
			}
		}
		employeeSet.removeAll(tempSet);
	}
}