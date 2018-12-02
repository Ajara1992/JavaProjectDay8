package Task;

public class TernaryOperators {

	public static void main(String[] args) {
		int number=3;
		if(number >0) {
			System.out.println("positive");
			
		}else {
			System.out.println("negative");
		}
		
		System.out.println((number>0) ? "positive" : "negative");
		
		String drink="hot";
		if (drink.equals("cold")) {
			System.out.println("You selected cold drink");
		}else {
			System.out.println("You selected hot drink");
		}
			System.out.println((drink.equalsIgnoreCase("cold")) ? "You selected cold drink" : "You selected hot drink");
	}

}
