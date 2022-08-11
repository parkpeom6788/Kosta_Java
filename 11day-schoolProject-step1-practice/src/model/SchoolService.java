package model;
import java.util.ArrayList;
public class SchoolService {

	private ArrayList<Member> list;
	public SchoolService() {
		list = new ArrayList<Member>();
	}
	public void addMember(Member member) {
		boolean flag = true;
		for(int i = 0; i < list.size(); i++) {
			if(member.getTel().equals(list.get(i).getTel())) {
				System.out.println(member.getTel() + "이 중복되어 추가될수 없습니다.");
				flag = false;
				break;
			}
		}
			if(flag == true) {
				list.add(member);
			}
	}
	public void printAll() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
