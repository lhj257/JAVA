package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return (s1.compareTo(s2)) * -1;
	}

}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>(new MyCompare());
		
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");

		System.out.println(set);
	}

}
