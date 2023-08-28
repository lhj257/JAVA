package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);

		// 람다식으로 인터페이스 구현
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);

		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
		concat3.makeString(s1, s2);
		
		int i=100;
		StringConcat concat4 = (s,v) ->{
//			i=200;
			System.out.println(i);
			System.out.println(s+","+v);
		};
		concat4.makeString(s1, s2);
	}

}
