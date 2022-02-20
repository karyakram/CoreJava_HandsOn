package corejava.hoa.day7.que1;

import java.util.Comparator;

public class DevNameCompare implements Comparator<DeveloperDemo>{


	@Override
	public int compare(DeveloperDemo o1, DeveloperDemo o2) {
		// TODO Auto-generated method stub
		DeveloperDemo d1 = o1;
		DeveloperDemo d2 = o2;
		return d1.name.compareTo(d2.name);
	}



}


