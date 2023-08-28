package inheritance;

public class VIPCustomer extends Customer {

	private int agentID; // VIP고객 관련 기능을 구현할 때만 필요한 멤버 변수
	double saleRatio;

//	public VIPCustomer() { 
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio=0.1;  
//		System.out.println("VIPCustomer() 생성자 호출 ");
//	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public int getAgentID() { // VIP고객에게만 필요한 메서드
		return agentID;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
	}

}
