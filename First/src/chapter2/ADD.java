package chapter2;

public class ADD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=2,z=2;
		z=++x/y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		x*=y+1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		z=++x + ++y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
