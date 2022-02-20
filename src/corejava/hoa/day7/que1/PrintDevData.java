package corejava.hoa.day7.que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PrintDevData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DeveloperDemo> dv = new ArrayList<>();
		dv.add(new DeveloperDemo(12, "Messi", 5, 100000));
		dv.add(new DeveloperDemo(14, "Aguero", 10, 120000));
		dv.add(new DeveloperDemo(16, "Silva", 3, 70000));
		dv.add(new DeveloperDemo(13, "Mahrez", 4, 60000));
		dv.add(new DeveloperDemo(111, "Dias", 2, 50000));

		
		System.out.println("Arranging data according to highest experience :");
		
		Collections.sort(dv, new DevExperienceCompare());
		
		Iterator<DeveloperDemo>  it = dv.iterator();
			while(it.hasNext()) {
				DeveloperDemo d = it.next();
				System.out.println("Developer Id = "+d.devId+" ,Developer Name = "+d.name+" ,Developer Experience = "+d.exp+" ,Developer's Salary = "+d.salary);
			}
			
			System.out.println("Arranging data according to name :");
			
		Collections.sort(dv, new DevNameCompare());
			
		Iterator<DeveloperDemo>  it1 = dv.iterator();
			while(it1.hasNext()) {
				DeveloperDemo d = it1.next();
				System.out.println("Developer Id = "+d.devId+" ,Developer Name = "+d.name+" ,Developer Experience = "+d.exp+" ,Developer's Salary = "+d.salary);
			}
			
			DeveloperDemo devSalary = dv.stream().max((d1,d2) -> d1.salary > d2.salary ? 1: -1).get();  
		      System.out.println("Developer name with highest salary : " +(devSalary.name));
	}

}
