package exercise;

public class TakeDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerKim = new Customer("Kim", 50000);
		Customer customerLee = new Customer("Lee", 40000);
		
		Star americano = new Star();
		customerKim.takeStar(americano);
		americano.showInfo();
		customerKim.showInfo();
	
		
		Bean latte = new Bean();
		customerLee.takeBean(latte);
		latte.showInfo();
		customerLee.showInfo();
	}

}
