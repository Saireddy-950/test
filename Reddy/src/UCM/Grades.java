package UCM;

import java.util.*;

public class Grades {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value");

		int b = Sc.nextInt();
		Sc.close();

		if (b < 25) {
			System.out.println("The grade is f ");
		} else if (b > 25 && b < 45) {

			System.out.println("E");
		} else if (b > 45 && b < 50) {

			System.out.println("D");
		} else {

		}

	}

}
