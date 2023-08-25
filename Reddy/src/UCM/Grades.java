package UCM;

import java.util.*;

public class Grades {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value");

		int a = Sc.nextInt();
		Sc.close();

		if (a < 25) {
			System.out.println("The grade is f ");
		} else if (a > 25 && a < 45) {

			System.out.println("E");
		} else if (a > 45 && a < 50) {

			System.out.println("D");
		} else {

		}

	}

}
