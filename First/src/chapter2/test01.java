package chapter2;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 10;
		int result = num1 & num2;
		System.out.println(result);
		result = num1 | num2;
		System.out.println(result);
		result = num1 ^ num2;
		System.out.println(result);
		int num=10;
		result=~num;
		System.out.println(result);
		num=5;
		System.out.println(num<<2);
		System.out.println(num>>2);
	}

}
