package exercise;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabets = new char[26];
		char ch = 'A'+32;

		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
		}

		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int) alphabets[i]);
		}
	}

}
