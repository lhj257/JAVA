package exercise;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance = new CarFactory();

	private CarFactory() {
	}

	private static HashMap<String, Car> hashMap = new HashMap<String, Car>();

	public static CarFactory getInstance() {
		return instance;
	}

	public Car createCar(String name) {
		Car car;
		if (hashMap.containsKey(name)) {
			return car = hashMap.get(name);
		}
		car = new Car(name);
		hashMap.put(name, car);
		return car;
	}
}
