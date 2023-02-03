package arithmeticCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Select an option from the given menu..");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			int sw = sc.nextInt();
			
			if(sw == 5) {
				System.out.println("Thank You..!");
				break;
			}
			
			System.out.println("Enter A value: ");
			int a = sc.nextInt();
			System.out.println("Enter B value: ");
			int b = sc.nextInt();
			
			switch(sw) {
				case 1:System.out.println("Addition : "+add(a,b));break;
				case 2:System.out.println("Subtraction : "+sub(a,b));break;
				case 3:System.out.println("Multiplication : "+multiply(a,b));break;
				case 4:System.out.println("Division: "+division(a,b));break;
				default:System.out.println("Incorrect option");
			}
			
			
		}

	}
	
	static int add(int a, int b) {
		return a+b;
	}
	static int multiply(int a, int b) {
		return a*b;
	}
	static int sub(int a, int b){
		return a-b;
	}
	static double division(int a, int b) {
		return (double)a/b;
	}
	

}
