package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc=new VIPCustomer(0, null, 0);
		VIPCustomer kim = new VIPCustomer(10020,"김유신",1001);
		kim.bonusPoint=10000;
		System.out.println(kim.showCustomerInfo());
		System.out.println(kim.showVIPInfo());
	}

}
