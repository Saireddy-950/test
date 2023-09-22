package sai;

public class Demo2 extends Demo1 {
	public static float f1=20, f2=30;
	
	public static void display() {
		System.out.println(f1+f2);
		System.out.println(Demo1.f1+Demo1.f2);
		
	}

	public static void main(String[] args) {
		display();
		
	}

}
