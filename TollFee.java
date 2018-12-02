package Task;

public class TollFee {

	public static void main(String[] args) {
		
		int carType=1;
		double fee;
		
		
		switch(carType){
		case 1:
			fee=2.50;
			System.out.println("Passenger car. Fee amount: "+ fee);
			
		case 2:
			fee=5.00;
			System.out.println("Bus. Fee amount: "+fee);
			
		case 3:
			fee=6.50;
			System.out.println("Truck. Fee amount: "+ fee);
			break;
			
			default: 
				System.out.println("You can go free");
		}
		

	}

}
