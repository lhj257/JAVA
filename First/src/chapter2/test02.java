package chapter2;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1
		System.out.println("1번");
		int num1=10;
		int num2=2;
		int total=0;
		char operator='+';
		
		switch (operator) {
		case '+' : total =num1 + num2;
			break;
		case '-' : total =num1 - num2;
			break;
		case '*' : total =num1 * num2;
			break;
		case '/' : total =num1 / num2;
			break;
		}
		System.out.println(total);
//	2
		System.out.println("2번");
	for(int num3=1;num3<=9;num3++) {
		if(num3%2==1)
			continue;
			for(int num4=1;num4<=9;num4++) {
		System.out.println(num3+"*"+num4+"="+ num3*num4);
	}		
	}
//	3
	System.out.println("3번");
	for (int num5=2;num5<=9;num5++) {
		for(int num6=1;num6<=9;num6++) {
			if(num6>num5) {
				break;
			}
			System.out.println(num5+"*"+num6+"="+num5*num6);
			}
			}
//	4
	System.out.println("4번");
	int count=3;
	for(int i=4; i<=7; i++) {
		for(int j =1;j<=i;j++) {
			if(j<=count) {
				System.out.print(" ");
			}else {
			System.out.print("*");
		}
	}count--;
	System.out.println();
		}
//	5
	System.out.println("5번");
	 count=3;
	for(int i=4; i<=7; i++) {
		for(int j =1;j<=i;j++) {
			if(j<=count) {
				System.out.print(" ");
			}else {
			System.out.print("*");
		}
	}count--;
	System.out.println();
		}
	count =1;
	for(int i=6;i>=4;i--) {
		for(int j=1;j<=i;j++) {
			if(j<=count) {
				System.out.print(" ");
			}else {
			System.out.print("*");
			}
		}
		count++;
		System.out.println();
	}
	}
}
	
