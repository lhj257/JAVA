package alone;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private static int carNum = 10000;

	private CarFactory() {
	}

	public Car createCar() {
		Car car = new Car();
		carNum++;
		car.setcarNum(carNum);
		return car;
	}

	public static CarFactory getInstance() {
		return instance;
	}

	public static void setInstance(CarFactory instance) {
		CarFactory.instance = instance;
	}

	public static int getCarNum() {
		return carNum;
	}

	public static void setCarNum(int carNum) {
		CarFactory.carNum = carNum;
	}

}
