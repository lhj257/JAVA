package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer Lee=new Customer(10010,"이순신");
		Lee.bonusPoint=1000;
		
		System.out.println(Lee.showCustomerInfo());
		
		Customer Kim=new VIPCustomer (10020,"김유신",12345);
		Kim.bonusPoint=1000;
		
		System.out.println(Kim.showCustomerInfo());
		System.out.println("===== 할인율과 보너스 포인트 계산=====");
		
		int price =10000;
		int LeePrice = Lee.calcPrice(price);
		int KimPrice = Kim.calcPrice(price);
		
		System.out.println(Lee.getCustomerName()+" 님이 "+LeePrice+"원 지불하셨습니다.");
		System.out.println(Lee.showCustomerInfo());
		System.out.println(Kim.getCustomerName()+" 님이 "+KimPrice+"원 지불하셨습니다.");
		System.out.println(Kim.showCustomerInfo());
	}

}
