import java.util.Scanner;

public class InputWithScanner {

	public static void main(String[] args) {
		
        String choice = instructions();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        String number1 = scan.nextLine();
        System.out.println("Enter second number");
        String number2 = scan.nextLine();
        
        int n1 = Integer.parseInt(number1);  
        int n2 = Integer.parseInt(number2);  
        if(choice.equals("1")) {
        	add(n1, n2);
        }else if(choice.equals("2")) {
        	sub(n1, n2);
        }else if(choice.equals("3")) {
        	mult(n1, n2);
        }else if(choice.equals("4")) {
        	div(n1, n2);
        }else {
        	System.out.println("No Method Chosen");
        }
	}

	public static String instructions() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter method you would like to use: ");
        System.out.println("1 to add values");
        System.out.println("2 to subtract values");
        System.out.println("3 to multiply values");
        System.out.println("4 to divide values");
        System.out.println("Any other key to escape");
        String value = scan.nextLine();
        return value;
	}
	
	public static int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
	public static int sub(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}
	public static int mult(int a, int b) {
		System.out.println(a * b);
		return a * b;
	}
	public static double div(double a, double b) {
		System.out.println(a / b);
		return a / b;
	}
}
