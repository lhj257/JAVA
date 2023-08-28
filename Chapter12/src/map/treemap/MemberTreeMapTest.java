package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap memberaHashMap = new MemberTreeMap();

		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon = new Member(1002, "손민국");

		memberaHashMap.addMember(memberPark);
		memberaHashMap.addMember(memberLee);
		memberaHashMap.addMember(memberHong);
		memberaHashMap.addMember(memberSon);

		memberaHashMap.showAllMember();

		memberaHashMap.removeMember(1004);
		memberaHashMap.showAllMember();
	}
}


