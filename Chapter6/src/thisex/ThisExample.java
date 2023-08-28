package thisex;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year=year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void printThis() {
		System.out.println(this);
	}
}
public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);  //태어난 연도를 2000으로 지정
		System.out.println(bDay); //참조 변수 출력
		bDay.printThis(); //this 출력 메서드 호출
	}

}
