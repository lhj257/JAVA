package array;

public class Student {
	private int studentID; //<<ID는 보통 String으로 만듬
	private String name;

	public Student() {
	}

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showStudentInfo() {
		System.out.println(studentID + "," + name);
	}
}
