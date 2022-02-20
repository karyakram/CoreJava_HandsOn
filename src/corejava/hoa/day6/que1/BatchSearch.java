package corejava.hoa.day6.que1;

class BatchSearch{
	public static void main(String[] args){
		String[] batchid = {"ACD22XB", "ACD22XD", "ABD21XB", "ABD21XA", "AAD20XC", "AAD20XB", "ACD22XC"};
		//assuming that all batches are in the format xxx<year>xx
		int cntBatch22 = 0;
		for(String s: batchid){
			if(s.contains("22"))
				cntBatch22++;
		}
		System.out.println("Total batches of 22 = " + cntBatch22);
	}
}