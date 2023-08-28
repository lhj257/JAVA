package classpart;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public Student() {}
	public Student(String studentName) {
		this.studentName=studentName;
	}
	
	public void showStudentinfo() {
		System.out.println(studentName+","+address);
	}
	
	public String getStudentName(){
		return studentName;
	}
	public void setStudentName(String name) {
		studentName =name;
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
}
