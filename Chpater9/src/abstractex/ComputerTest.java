package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer c1=new Computer(); //abstract는 클래스를 인스턴스로 생성 안됨
		Computer c2=new DeskTop();
//		Computer c3=new NoteBook();
		Computer c4=new MyNoteBook();
		c2.display();
		c2.typing();
		c4.display();
		c4.typing();
	}

}
