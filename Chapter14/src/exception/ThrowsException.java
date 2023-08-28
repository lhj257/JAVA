package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File 캐치문 실행");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Class 캐치문 실행");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
