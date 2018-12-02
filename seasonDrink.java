package Task;
import java.util.Scanner;

public class seasonDrink {
	public static void main(String[] args) {
		int month;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mouth");
		 month= scan.nextInt();
		
		if(month ==12 || month<=2) {
			System.out.println("Season: Winter\n Drink: Pumpkin Spice");
		}else if (month<=5) {
			System.out.println("Season: Spring\n Drink: Caramel Machia");
		}else if (month<8) {
			System.out.println("Season: Summer \n Drink: Iced Coffee");
		}else if( month==9 || month ==10 || month==11) {
			System.out.println("Season: Fall \n Drink: Salted Caramel Mocha ");
		}else {
			System.out.println("Error month");
		}
	}

}
