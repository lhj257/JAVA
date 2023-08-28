package alone;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory=CarFactory.getInstance();
		Car mySonata=factory.createCar();
		Car yourSonata=factory.createCar();
		System.out.println(mySonata.getcarNum());
		System.out.println(yourSonata.getcarNum());
	}

}
