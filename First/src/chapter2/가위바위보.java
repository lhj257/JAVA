package chapter2;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		키보드 타이핑을 받아오는 방법
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		랜덤 숫자를 받아오느 방법
		Random r =new Random();
		int computerNum = r.nextInt(3); //0~2까지의 랜덤 숫자
		String computer="";
		if(computerNum==0) {
			 computer="가위";
		}else if(computerNum==1) {
			 computer="바위";
		}else if(computerNum==2) {
			 computer="보";
		}
		System.out.println("컴퓨터는 "+computer+" 입니다.");
		if(str.equals("가위")) {
			if(computerNum==0) {
				System.out.println("비겼습니다.");
			}else if(computerNum==1) {
				System.out.println("졌습니다.");
			}else if(computerNum==2) {
				System.out.println("이겼습니다.");
			}else if(computerNum==0) {
				System.out.println("이겼습니다.");
			}
		}else if(str.equals("바위")) {
			if(computerNum==0) {
				System.out.println("이겼습니다.");
			}else if(computerNum==1) {
				System.out.println("비겼습니다.");
			}else if(computerNum==2) {
				System.out.println("졌습니다.");
			}
		}else if(str.equals("보")) {
			if(computerNum==0) {
				System.out.println("졌습니다.");
			}else if(computerNum==1) {
				System.out.println("이겼습니다.");
			}else if(computerNum==2) {
				System.out.println("비겼습니다.");
			}
		}
//		String computer = "가위";
//		if(str.equals("가위")) {
//			if(computer.equals("가위")) {
//				System.out.println("비겼습니다.");
//			}
//		}else if(str.equals("바위")) {
//			if(computer.equals("가위")) {
//				System.out.println("이겼습니다.");
//			}
//		}else if(str.equals("보")) {
//			if(computer.equals("가위")) {
//				System.out.println("졌습니다.");
//			}
//		}
	}

}

