package classpart;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
//	public (int day,int month,int year){
//		this.day=day;
//		this.month=month;
//		this.year=year;
//	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<1||month>12) {
			System.out.println("1~12 사이의 값을 입력해주세요.");
		}else {
			this.month=month;
		}
	}
	public void setDay(int day) {
		if(month==2) {
			if(day<1||day>28) {
				System.out.println("오류입니다.");
			}else {
				this.day=day;
			}
		}
	}
}
