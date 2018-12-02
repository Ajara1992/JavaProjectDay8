package Task;

import java.util.Scanner;

public class CarSalon {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What country car do you want? ");
		String country=input.nextLine();
		
		System.out.println("What is your budget? ");
		double amount=input.nextDouble();
		
		if(country.equals("German")){
			System.out.println("You selected German car. ");
			
			
			if(amount>5000) {
				System.out.println("You can buy this car");
			}else {
				System.out.println("We don't have any cars for this price");
			}
		}else if(country.equals("American")) {
			System.out.println("You selected American car. ");
			
			
			if(amount>3000) {
				System.out.println("You can buy this car");
			}else {
				System.out.println("We don't have any cars for this price");
			}
		}else if(country.equals("Japanesse")) {
			System.out.println("You selected Japanesse car. ");
			
			if(amount>1000) {
				System.out.println("You can buy this car");
			}else {
				System.out.println("We don't have any cars for this price");
			}
		}
			
		

	}

}
