package staticex;

public class Student2 {
	private static int serialNum=1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;
		studentID=serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static int getSerialNum() {
		int i=10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setStudentName(String name) {
		studentName=name;
	}
}
