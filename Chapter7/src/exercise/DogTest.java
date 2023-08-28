package exercise;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dogs=new Dog[5];
		dogs[0]=new Dog("일","짓돗개");
		dogs[1]=new Dog("이","치와와");
		dogs[2]=new Dog("삼","시바견");
		dogs[3]=new Dog("사","도베르만");
		dogs[4]=new Dog("오","포메라니안");
		
		for(int i=0;i<dogs.length;i++) {
			System.out.println(dogs[i].showDogInfo());
		}
	}

}
