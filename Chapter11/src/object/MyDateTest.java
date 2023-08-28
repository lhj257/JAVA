package object;

class MyDate {
	int day;
	int month;
	int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			return (this.day == date.day && this.month == date.month && this.year == date.year);
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt("" + this.year + this.month + this.day);
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));

		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());

		System.out.println(System.identityHashCode(date1));
		System.out.println(System.identityHashCode(date2));
	}

}
