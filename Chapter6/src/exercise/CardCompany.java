package exercise;

public class CardCompany {


		private static CardCompany instance = new CardCompany();
		private static int cardNum = 1000;

		public static CardCompany getInstance() {
			return instance;
		}

		public static void setInstance(CardCompany instance) {
			CardCompany.instance = instance;
		}

		public static int getCardNum() {
			return cardNum;
		}

		public static void setCardNum(int cardNum) {
			CardCompany.cardNum = cardNum;
		}

		private CardCompany() {
		}

		public Card createCard() {
			Card card = new Card();
			cardNum++;
			card.setCardNum(cardNum);
			return card;
		}

}

