package classpart;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int child;
	
	public Person(int age,String name,boolean isMarried,int child) {
		this.age=age;
		this.name=name;
		this.isMarried=isMarried;
		this.child=child;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	
	public void showPerson() {
		System.out.println("나이 :"+age);
		System.out.println("이름 :"+name);
		System.out.println("결혼여부 :"+isMarried);
		System.out.println("자녀수 :"+child);
	}
	
}
