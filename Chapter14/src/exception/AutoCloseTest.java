package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(AutoCloseObj obj =new AutoCloseObj()){
		}catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}

}
