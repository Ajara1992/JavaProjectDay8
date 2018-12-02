package Task;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		String operator;
		
		System.out.println("Please enter your first number: ");
		
		Scanner input=new Scanner(System.in);
		num1=input.nextInt();
		System.out.println("Please inter second number");
		num2=input.nextInt();
		
		System.out.println("Please enter operator: ");
		Scanner input2= new Scanner(System.in);
		operator=input2.next();
		
		int result;
		
		
		if (operator.equals("+")) {
			result=num1+num2;
			System.out.println(num1 + " "+ operator+ " "+num2+ " = "+result);
		}else if (operator.equals("-")) {
			result=num1-num2;
			System.out.println(num1 + " "+ operator+ " "+num2+ " = "+result);
		}else if (operator.equals("*")) {
			result=num1*num2;
			System.out.println(num1 + " "+ operator+ " "+num2+ " = "+result);
		}else if (operator.equals("/")) {
			result=num1/num2;
			System.out.println(num1 + " "+ operator+ " "+num2+ " = "+result);
			
		}else {
			System.out.println("Can't divide by 0!");
		}

	}
		
	

}
