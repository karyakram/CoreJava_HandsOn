package corejava.hoa.day2.que8;

public class Items {

	String headphone;
	String shirt;
	String mobile;
	String shoes;
	
	
	public Items(String headphone, String shirt, String mobile, String shoes) {
		super();
		this.headphone = headphone;
		this.shirt = shirt;
		this.mobile = mobile;
		this.shoes = shoes;
	}


	public void display(){
		System.out.println(" Items Catalogue : ");
		System.out.println(" Available Headphone = "+headphone );
		System.out.println(" Available Shirt = "+shirt);
		System.out.println(" Available Mobiles = "+mobile);
		System.out.println(" Available Shoes = "+ shoes);
		
		
	}
	
	
}
