package model;
import java.util.ArrayList;
public class SchoolService {
	private ArrayList<Member> list;
	public SchoolService() {
		list = new ArrayList<Member>();
	}
	/**
	 * 학교 구성원 정보를 리스트에 저장하는 메서드
	 * Student , Teacher , Employee 객체를 모두 처리하기 위해
	 * 부모 타입의 Member 매개변수를 선언 
	 * 등록은 list 의 add 메서드를 이용하면 된다.
	 * 
	 * tel 중복확인작업 
	 * 구성원의 tel은 유일해야 하므로 동일한 tel을 가진 구성원이 
	 * 등록되려고 할 경우 
	 * 01012311234 tel 이 중복되어 등록 불가합니다. 메세지 출력 후
	 * 리스트에 등록시키지 않는다
	 * @param member
	 */
	public void addMember(Member member) {
		// ex) 가입할때 아이디 중복확인작업도 가능
		boolean existTelFlag = false; // tel 중복여부를 저장하는 지역 변수 보통 기본값 flase로 줌
		for(int i=0; i<list.size(); i++) {
			// 등록하려고 하는 구성원의 tel 과 리스트 요소의 구성원 tel 이 동일하면			
			if(member.getTel().equals(list.get(i).getTel())) {
				System.out.println(member.getTel() +"이 중복되어 등록 불가합니다.");
				existTelFlag = true;
				break;
			}
		}
		// 등록하려고 하는 구성원의 tel 과 리스트 요소의 구성원 tel 이 중복되지않으면
		if(existTelFlag == false) {
			list.add(member); // 리스트에 매개변수로 전달된 요소를 등록한다
		}
	}
	public void printAll() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i)); // 내부적으로 toString 호출 
		}
	}
	
}