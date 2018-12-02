package Task;
 import java.util.Scanner;
 
public abstract class DrinkOrder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		boolean hot=false;
		boolean cold=true;
		
		if(cold) {
			System.out.println("Water or juice");
			boolean water=false;
			boolean juice=false;
			if(water) {
				System.out.println("Select water");
			}else if(juice) {
				System.out.println("Select juice");
			}else {
				System.out.println("No drink");
			}
		}else if(hot){
			System.out.println("Tea or cofee");
			
		}else {
			System.out.println("No thanks");
		}
		
	}

	}
