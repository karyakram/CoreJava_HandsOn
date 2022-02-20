package corejava.hoa.day6.que3;

import java.util.HashMap;
import java.util.Map;

class PlayerCount{
	public static void main(String[] args){
		String[] cricketTeam = {"Sehwag Batsman", "Tendulkar Batsman", "Gambhir Batsman", "Kohli Batsman", "Dhoni Batsman", "Yuvraj All-Rounder", "Raina Batsman", "Harbhajan Bowler", "Zaheer Bowler", "Munaf Bowler", "Sreesanth Bowler"};
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for(String s: cricketTeam){
			String[] parts = s.split(" ");
			if(!countMap.containsKey(parts[1])){
				countMap.put(parts[1], 1);
			}			
			else{
				int cnt = countMap.get(parts[1]);
				cnt++;
				countMap.put(parts[1], cnt);
			}
		}
		System.out.println("Player count according to category:");
		for (Map.Entry<String, Integer> entry : countMap.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}