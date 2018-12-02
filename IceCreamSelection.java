package Task;

import java.util.Scanner;

public class IceCreamSelection {

	public static void main(String[] args) {
		
		String selection;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your icecream: ");
		selection=input.nextLine();
		
		switch(selection) {
		case "Strawberry":
			System.out.println("You selected Strawberry");
			break;
		case "Cranberry":
			System.out.println("You selected Cranberry");
			break;
		default:
			System.out.println("Default is a Chocolate flavor");
			
		case "banana":
		System.out.println("You selected Banana");
			
		}
		

	}

}
