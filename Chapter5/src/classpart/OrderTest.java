package classpart;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person(40,"James",true,3);
//		person1.age=40;
//		person1.name="James";
//		person1.isMarried=true;
//		person1.child=3;
		person1.showPerson();
		
//		System.out.println("나이 :"+person1.age);
//		System.out.println("이름 :"+person1.name);
//		System.out.println("결혼 여부 :"+person1.isMarried);
//		System.out.println("자녀수 :"+person1.child);
System.out.println();
		Order order1= new Order("201803120001","abc123","2018년 3월 12일","홍길순","PD0345-12","서울시 영등포구 여의도동 20번지");
//		order1.ordernumber = "201803120001";
//		order1.orderID = "abc123";
//		order1.orderDate="2018년 3월 12일";
//		order1.orderName="홍길순";
//		order1.goodsID="PD0345-12";
//		order1.address="서울시 영등포구 여의도동 20번지";
		order1.showOrderInfo();
		
//		System.out.println("주문 번호 :"+order1.ordernumber);
//		System.out.println("주문자 아이디 :"+order1.orderID);
//		System.out.println("주문 날짜 :"+order1.orderDate);
//		System.out.println("주문자 이름 :"+order1.orderName);
//		System.out.println("주문 상품 번호 :"+order1.goodsID);
//		System.out.println("배송 주소 :"+order1.address);
		
		System.out.println();
		
		Student3 s3 = new Student3();
		s3.setStudentID(1);
		s3.setStudentName("이름");
		s3.setKorean(new Subject("국어",90));
		s3.setMath(new Subject("수학",80));
//		Subject sj=new Subject("국어",90);
//		sj.setScorePoint(0);
//		sj.setSubjectName(null);
//		s3.setKorean(sj);
		
		s3.showStudent3Info();
	}
}
