package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap memberaHashMap = new MemberHashMap();

		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");

		memberaHashMap.addMember(memberLee);
		memberaHashMap.addMember(memberSon);
		memberaHashMap.addMember(memberPark);
		memberaHashMap.addMember(memberHong);

		memberaHashMap.showAllMember();

		memberaHashMap.removeMember(1004);
		memberaHashMap.showAllMember();
	}

}
