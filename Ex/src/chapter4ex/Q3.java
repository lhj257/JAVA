package chapter4ex;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("x값을 입력하세요.");
		int x =s.nextInt();
		int y=(x*x)-(3*x)+7;
		
		System.out.println("x="+x+", y="+y);
	}

}
