package corejava.hoa.day2.que6;

class Vehicle{
	
	Vehicle(){
	
	}

	public void sound(String s){
		System.out.println("Sound of car is so good and "+s);
	}
	public void engine(String e) {
		System.out.println("Engine is "+e);
	}
	
	public void sitting(String s) {
		System.out.println("Sitting in car is "+s);
	}
}	
class Car1 extends Vehicle{
	 
	public void colour(String c) {
		System.out.println("Colour of car is "+c);
	}
	public void model(int m) {
		System.out.println("Model of car is "+m);
	}
}

class Honda extends Car1{
	public void hp(int h) {
		System.out.println("Horse power of car is "+h);
	}
}

class HondaCity extends Honda{
	void display() {
		System.out.println("Honda City is a fully loaded car");
	}
}

public class CarInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HondaCity h = new HondaCity();
		h.sound("Excellent");
		h.engine("1000cc");
		h.sitting("4 seater");
		h.colour("White");
		h.model(2021);
		h.hp(1000);
		h.display();
	}

}
