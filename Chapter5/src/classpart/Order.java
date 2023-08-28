package classpart;

public class Order {
	String ordernumber;
	String orderID;
	String orderDate;
	String orderName;
	String goodsID;
	String address;
	
	//디폴트 : 
	public Order() {
		
	}
	public Order(String ordernumber,String orderID,String orderDate,String orderName,String goodsID,String address) {
		this.ordernumber=ordernumber;
		this.orderID=orderID;
		this.orderDate=orderDate;
		this.orderName=orderName;
		this.goodsID=goodsID;
		this.address=address;
	}
	
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void showOrderInfo() {
	System.out.println("주문 번호 :"+ordernumber);
	System.out.println("주문자 아이디 :"+orderID);
	System.out.println("주문 날짜 :"+orderDate);
	System.out.println("주문자 이름 :"+orderName);
	System.out.println("주문 상품 번호 :"+goodsID);
	System.out.println("배송 주소 :"+address);
	}
}
