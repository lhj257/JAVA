package exercise;

public class CardCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card card1=new Card();
//		System.out.println(card1.getCardNum());
//		
//		Card card2=new Card();
//		System.out.println(card2.getCardNum());
//		
//		Card card3=new Card();
//		System.out.println(card3.getCardNum());
//		
		CardCompany company=CardCompany.getInstance();
		Card card1=company.createCard();
		Card card2=company.createCard();
		Card card3=company.createCard();
		System.out.println(card1.getCardNum());
		System.out.println(card2.getCardNum());
		System.out.println(card3.getCardNum());
	}

}
