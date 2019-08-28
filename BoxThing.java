/*
Clayton Lau
August 27, 2019
Draw three boxes
*/

public class BoxThing {
	public static void main(String[] args) {
		for (int counter = 0; counter < 3; counter++){
			box();
			System.out.println();	
		}
	}

	public static void plusMinusPlus() {
		System.out.println("+-----+");
	}

	public static void verticalLine() {
		System.out.println("|     |");
	}
	
	public static void box() {
		plusMinusPlus();
		verticalLine();
		verticalLine();
		plusMinusPlus();
	}
}