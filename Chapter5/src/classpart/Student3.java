package classpart;

public class Student3 {
	int StudentID;
	String studentName;
	Subject Korean;
	Subject math;
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Subject getKorean() {
		return Korean;
	}
	public void setKorean(Subject korean) {
		Korean = korean;
	}
	public Subject getMath() {
		return math;
	}
	public void setMath(Subject math) {
		this.math = math;
	}
	public void showStudent3Info() {
		System.out.println(StudentID);
		System.out.println(studentName);
		System.out.println(Korean.subjectName);
		System.out.println(Korean.scorePoint);
		System.out.println(math.subjectName);
		System.out.println(math.scorePoint);
	}
}
