package model;

public interface SchoolService {

	/**
	 * SchoolServiceVer2 에 새롭게 추가된 메서드
	 * tel에 해당하는 list 요소의 position을 반환한다
	 * 만약 tel에 해당하는 list의 구성요소가 없다면 -1 반환 
	 * @param tel
	 * @return 
	 */
	int findIndexByTel(String tel);

	void addMember(Member member);

	void printAll();

	Member findMemberByTel(String tel);

	void deleteMemberByTel(String tel);

	void updateMember(Member member);

}