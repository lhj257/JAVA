package exercise;

public class Bean {
	int money;
	
	public void take(int money) {
		this.money=money;
	}
	public void showInfo() {
		System.out.println(money+"원결제 되었습니다.");
	}
}
