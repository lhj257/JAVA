package practice;

public class Student {
		int sno;
		String name;
		String dept;
		int scores1;
		int scores2;
		int scores3;
		
		public Student() {}
		
		public Student(int sno,String name,String dept,int scores1,int scores2,int scores3) {
			this.sno=sno;
			this.name=name;
			this.dept=dept;
			this.scores1=scores1;
			this.scores2=scores2;
			this.scores3=scores3;
		}
		
		int sum =scores1+scores2+scores3;
		int avg=sum/3;
	}


