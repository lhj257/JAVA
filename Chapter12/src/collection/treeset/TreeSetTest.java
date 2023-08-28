package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");

		for (String str : treeSet) {
			System.out.println(str);
		}

		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		treeSet2.add(23);
		treeSet2.add(10);
		treeSet2.add(48);
		treeSet2.add(15);
		treeSet2.add(7);
		treeSet2.add(22);
		treeSet2.add(56);

		for (int i : treeSet2) {
			System.out.print(i + ",");
		}
	}

}
