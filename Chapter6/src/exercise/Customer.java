package exercise;

public class Customer {
	public String customerName;
	public int money;
	
	public Customer(String customerName,int money) {
		this.customerName=customerName;
		this.money=money;
	}
	
	public void takeStar(Star americano) {
		americano.take(4000);
		this.money-=4000;
	}
	
	public void takeBean(Bean latte) {
		latte.take(4500);
		this.money-=4500;
	}
	public void showInfo() {
		System.out.println(customerName+"님의 통장잔액은"+money+"입니다.");
	}
}
