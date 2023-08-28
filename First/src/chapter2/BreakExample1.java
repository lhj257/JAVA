package chapter2;

public class BreakExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=0;
		
		for(num=0; sum<100; num++) {
			sum +=num;
			if(sum>=100) {
				break;
			}
		}
		System.out.println("num : "+num);
		System.out.println("sum : "+sum);
	}

}
