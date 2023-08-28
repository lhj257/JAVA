package object;

class Book {
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");

		System.out.println(book1);
		System.out.println(book1.toString());

		String str = new String("test");
		Integer i1 = new Integer(1000);

		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(i1);
		System.out.println(i1.toString());
	}

}
