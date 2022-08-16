package model;
import java.util.ArrayList;
public class SchoolServiceImplVer2 implements SchoolService {
	private ArrayList<Member> list;
	public SchoolServiceImplVer2() {
		list = new ArrayList<Member>();
	}
	/**
	 * SchoolServiceVer2 에 새롭게 추가된 메서드
	 * tel에 해당하는 list 요소의 position을 반환한다
	 * 만약 tel에 해당하는 list의 구성요소가 없다면 -1 반환 
	 * @param tel
	 * @return 
	 */
	@Override
	public int findIndexByTel(String tel) {
		int position = -1;
		for(int i = 0; i < list.size(); i++) {
			if(tel.equals(list.get(i).getTel())) {
				position = i;
				break;
			}
		}
		return position;
	}
	@Override
	public void addMember(Member member) {
		int position = findIndexByTel(member.getTel());
		if(position == -1) {
			list.add(member);
		} else {
			System.out.println("중복");
		}
//		if(findIndexByTel(member.getTel()) == -1) {
//			list.add(member); // 기존값을 확일했을때 값이 없으면 -1 이면 add가 가능 
//		} else 
//			System.out.println(member.getTel() + "tel 이 중복되어 등록 불가합니다.");
	}
	@Override
	public void printAll() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	@Override
	public Member findMemberByTel(String tel) {
		int index = findIndexByTel(tel);
		if(index == -1) 
			return null;
		else 
			return list.get(index);
	}	
	@Override
	public void deleteMemberByTel(String tel) {
		int index = findIndexByTel(tel);
		if(index == -1) {   // 반대로 -1이 아니면 remove해서 값이 삭제 
			System.out.println("값이 없습니다.");
		} else {
			list.remove(index);
			System.out.println("삭제 되었습니다.");
		}
	}
	@Override
	public void updateMember(Member member) {
		int index = findIndexByTel(member.getTel());
		if(index == -1) {
			System.out.println("값이 없습니다.");
		} else {
			list.set(index, member);
			System.out.println("수정이 완료 되었습니다.");
		}
	}
}
