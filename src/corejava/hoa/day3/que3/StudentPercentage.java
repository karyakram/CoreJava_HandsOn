package corejava.hoa.day3.que3;

abstract class Marks{
	abstract float getPercentage();
	
}

class A12 extends Marks{
	
	 float s1,s2,s3;
	 float per=0;
	 
	public A12(float s1, float s2, float s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	@Override
	public float getPercentage() {
		per=(s1+s2+s3)/300*100;
		return per;
	}
	 
	 
}

class B12 extends Marks{
	 
		float s1,s2,s3,s4;
		float per=0;
		
		public B12(float s1, float s2, float s3, float s4) {
			super();
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
			this.s4 = s4;
		}
		
		public float getPercentage() {
			per=(s1+s2+s3+s4)/400*100;
			return per;
		}
}

public class StudentPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12 obj1 = new A12(92f, 89f, 96f);
		System.out.println("The percentage of student A is :"+obj1.getPercentage());

		B12 obj2 = new B12(93f, 80f, 64f, 76f);
		System.out.println("The percentage of student B is :"+obj2.getPercentage());
	}

}
