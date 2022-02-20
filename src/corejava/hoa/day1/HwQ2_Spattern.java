package corejava.hoa.day1;


	
public class HwQ2_Spattern{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10 ; j++){
				if(i == 0 || i == 1 || i == 4 || i == 5 || i > 7){
					System.out.print("*");
				}
				else if(i < 4 && j < 3){
					System.out.print("*");
				}
				else if (i > 5){
					if(j < 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}


