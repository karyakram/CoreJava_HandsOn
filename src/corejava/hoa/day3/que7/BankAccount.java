package corejava.hoa.day3.que7;

public class BankAccount implements CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		b.rupees();
		b.dollars();
		b.pounds();

	}

	@Override
	public void rupees() {
		// TODO Auto-generated method stub
		System.out.println("This method is for rupees");
		
	}

	@Override
	public void dollars() {
		// TODO Auto-generated method stub
		System.out.println("This method is for dollars");
		
	}

	@Override
	public void pounds() {
		// TODO Auto-generated method stub
		System.out.println("This method is for pounds");
		
	}

}
