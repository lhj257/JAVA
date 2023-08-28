package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class GradeTest {
	School goodSchool=School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	String subjectFirstSpell;
	String subjectName;
	int subjectId;
	
	GenerateGradeReport gradeReport=new GenerateGradeReport();
	
	public static void main(String[] args) throws FileNotFoundException {
		GradeTest test = new GradeTest();
		
		test.createSubject2();
		test.createStudent();
		
		String report=test.gradeReport.getReport();
		System.out.println(report);
		
		try(FileOutputStream fos = new FileOutputStream("resultInfo.txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos)){
			osw.write(report);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("resultInfo.txt 파일을 열어보세요.");
				
	}
	
	public void createSubject2() throws FileNotFoundException {
		Scanner scanner = new Scanner (new FileInputStream("subjectInfo.txt"));
		
		while (scanner.hasNextLine()) {
			subjectFirstSpell=scanner.next();
			subjectName=scanner.next();
			subjectId=scanner.nextInt();
			if(subjectFirstSpell.equals("K")) {
				korean = new Subject(subjectName, subjectId);
				goodSchool.addSubject(korean);
			}else if(subjectFirstSpell.equals("M")) {
				math = new Subject("수학", Define.MATH);
				goodSchool.addSubject(math);
			}else if(subjectFirstSpell.equals("D")) {
				dance = new Subject("방송 댄스",Define.DANCE);
				goodSchool.addSubject(dance);
			}
		}
		dance.setGradeType(Define.PF_TYPE);
	}
	
	public void createStudent() throws FileNotFoundException {
		Scanner scanner = new Scanner (new FileInputStream("studentInfo.txt"));
		String name;
		int id;
		int koreanScore;
		int mathScore;
		Integer danceScore;
		int majorCode;
		
		Student student=null;
		while (scanner.hasNextLine()) {
			name= scanner.next();
			id=scanner.nextInt();
			koreanScore=scanner.nextInt();
			mathScore=scanner.nextInt();
			danceScore=scanner.nextInt();
			if(danceScore.toString().length()==4) {
				majorCode=danceScore;
			}else {
				majorCode=scanner.nextInt();
			}
			if(majorCode==Define.KOREAN) {
				student = new Student(id, name, korean);
			}else if(majorCode==Define.MATH) {
				student = new Student(id, name, math);
			}
			else if(majorCode==Define.DANCE) {
				student = new Student(id, name, dance);
			}else {
				System.out.println("오류");
				return;
			}
			goodSchool.addStudent(student);
			korean.register(student);
			math.register(student);
			
			addScoreForStudent(student, korean, koreanScore);
			addScoreForStudent(student, math, mathScore);
			if(danceScore.toString().length()!=4) {
				dance.register(student);
				addScoreForStudent(student, dance, danceScore);
			}
			
		}
		scanner.close();
//		Student student1=new Student(181213, "안성원", korean);
//		Student student2=new Student(181518, "오태훈", math);
//		Student student3=new Student(171230, "이동호", korean);
//		Student student4=new Student(171255, "조성욱", korean);
//		Student student5=new Student(171590, "최태평", math);
//		
//		goodSchool.addStudent(student1);
//		goodSchool.addStudent(student2);
//		goodSchool.addStudent(student3);
//		goodSchool.addStudent(student4);
//		goodSchool.addStudent(student5);
//		
//		korean.register(student1);
//		korean.register(student2);
//		korean.register(student3);
//		korean.register(student4);
//		korean.register(student5);
//		
//		math.register(student1);
//		math.register(student2);
//		math.register(student3);
//		math.register(student4);
//		math.register(student5);
//		
//		dance.register(student1);
//		dance.register(student2);
//		dance.register(student3);
//		
//		addScoreForStudent(student1, korean, 95);
//		addScoreForStudent(student1, math, 56);
//		addScoreForStudent(student1, dance, 95);
//		
//		addScoreForStudent(student2, korean, 95);
//		addScoreForStudent(student2, math, 95);
//		addScoreForStudent(student2, dance, 85);
//		
//		addScoreForStudent(student3, korean, 100);
//		addScoreForStudent(student3, math, 88);
//		addScoreForStudent(student3, dance, 55);
//		
//		addScoreForStudent(student4, korean, 89);
//		addScoreForStudent(student4, math, 95);
//		
//		addScoreForStudent(student5, korean, 85);
//		addScoreForStudent(student5, math, 56);
	}
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score=new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
}
