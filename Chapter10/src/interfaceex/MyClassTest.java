package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mClass=new MyClass();
		X xClass=mClass;
		xClass.x();
		
		Y yClass=mClass;
		yClass.y();
		
		Myinterface iClass=mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}

}
