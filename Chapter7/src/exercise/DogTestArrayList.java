package exercise;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dogs=new ArrayList<Dog>();
		dogs.add(new Dog("일","진돗개"));
		dogs.add(new Dog("이","치와와"));
		dogs.add(new Dog("삼","시바견"));
		dogs.add(new Dog("사","도베르만"));
		dogs.add(new Dog("호","포메라니안"));
		
		for(int i=0;i<dogs.size();i++) {
			Dog dog=dogs.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		for(Dog dog:dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}
