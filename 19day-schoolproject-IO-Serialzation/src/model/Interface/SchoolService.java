package model.Interface;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import model.exception.DuplicatedException;
import model.exception.MemberNotException;
import model.service.ObjectService;
import model.vo.Member;

public class SchoolService extends ObjectService implements Service {
	private ArrayList<Member> list = new ArrayList<Member>();
	private ObjectService os = new ObjectService();

	public void info() throws FileNotFoundException, ClassNotFoundException, IOException  {
		if(deserizable() != null) {
			list = deserizable();
		}
	}
	public void save() throws FileNotFoundException, IOException {
		serizable(list);
	}
	@Override
	public int findIndexMember(String tel) {
		int index = -1;
		for(int i=0; i<list.size();i++) {
			if(tel.equals(list.get(i).getTel()))
				index = i;
		}
		return index;
	}
	@Override
	public Member findMemberByTel(String tel) throws MemberNotException {
		Member member = null;
		if(findIndexMember(tel) != -1) {
			member= list.get(findIndexMember(tel));
		} else 
			throw new MemberNotException("멤버를 찾을수없습니다.");
		return member;
	}
	@Override
	public void addMember(Member member) throws DuplicatedException {
		if(findIndexMember(member.getTel()) != -1) {
			throw new DuplicatedException("중복됩니다.");
		}
		list.add(member);
		System.out.println("추가 완료");
	}
	@Override
	public void printAll() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	@Override
	public void deleteMember(String tel) throws MemberNotException {
		if(findIndexMember(tel) != -1) {
			list.remove(findIndexMember(tel));
			System.out.println("삭제 완료");
		} else 
			throw new MemberNotException("멤버를 찾을수없습니다.");
	}
	@Override
	public void updateMember(Member member) throws MemberNotException {
		if(findIndexMember(member.getTel()) != -1) {
			list.set(findIndexMember(member.getTel()), member);
			System.out.println("수정 완료");
		}
		throw new MemberNotException("멤버를 찾을수없습니다.");
	}
}
