package model.service;
import java.util.Iterator;
import java.util.LinkedHashMap;

import model.vo.Member;
public class SchoolService {
	private LinkedHashMap<String,Member> map = new LinkedHashMap<>();
	/*
	 * map 에 구성원 정보를 추가하는 메서드
	 * tel 중복확인해서 중복되지 않으면 map에 추가하고
	 * 중복되면 중복메시지를 남기고 추가시키지 않는다.
	 */	
	public boolean checkKey(String tel) {
		boolean check = false;
		if(map.containsKey(tel)){
			return !check;
		}
		return check;
	}
	public void addMember(Member member) {
		if(checkKey(member.getTel())) 
			System.out.println(member.getTel() + "중복 되었습니다.");
	  else 
			map.put(member.getTel(), member);
	}
	public void printAll() {
		Iterator<Member> it = map.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		Iterator<Entry<String, Member>> entrys = map.entrySet().iterator();
//		while(entrys.hasNext()) {
//			Entry<String, Member> entry = entrys.next();
//			System.out.println(entry.getKey() + entry.getValue());
//		}
	}
	public Member findMemberByTel(String tel) {
		Member member = null;
		if(checkKey(tel) == true) {
			member = map.get(tel);
			return member;
		} else  {
			System.out.println("회원을 못찾았습니다.");
		}
		return member;
	}
	public void deleteMemberByTel(String tel) {
		if(checkKey(tel) == true) {
			map.remove(tel);
			System.out.println(tel + " 삭제 되었습니다.");
		} else {
			System.out.println("회원이 없습니다.");
		}
	}
	public void updateMember(Member member) {
		if(checkKey(member.getTel()) == true) {
//			map.put(member.getTel(), member);
			map.replace(member.getTel(), member);
			System.out.println(member.getTel() + "수정 되었습니다.");
		} else {
			System.out.println("회원이 없습니다.");
		}
	}
}
