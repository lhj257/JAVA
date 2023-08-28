package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer Lee = new Customer(10010,"이순신");
		Lee.bonusPoint=1000;
		System.out.println(Lee.showCustomerInfo());
		
		VIPCustomer Kim = new VIPCustomer(10020,"김유신",1001);
		Kim.bonusPoint=10000;
		System.out.println(Kim.showCustomerInfo());
	}

}
