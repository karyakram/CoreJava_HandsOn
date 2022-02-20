package corejava.hoa.day7.que1;

import java.util.Comparator;

public class DevExperienceCompare implements Comparator<DeveloperDemo> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(DeveloperDemo o1, DeveloperDemo o2) {
		// TODO Auto-generated method stub
		DeveloperDemo d1 = o1;
		DeveloperDemo d2 = o2;  
		  
		if(d1.exp==d2.exp)  
		return 0;  
		else if(d1.exp>d2.exp)  
		return 1;  
		else  
		return -1;  
	}

}
