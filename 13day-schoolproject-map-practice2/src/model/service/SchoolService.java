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
		boolean flag = false;
			if(map.containsKey(tel)) {
				flag = true;
			}
		return flag;
	}
	public void addMember(Member member) {
	if(checkKey(member.getTel()) != true) 
			map.put(member.getTel(), member);
	else 
		System.out.println(member.getTel() +" 이미 중복 됩니다.");
	}
	public void printAll() {
		Iterator<Member> member = map.values().iterator();
		while(member.hasNext()) 
			System.out.println(member.next());
	}
	public Member findMemberByTel(String tel) {
		Member member = null;
		if(checkKey(tel) == true) {
			member = map.get(tel);
		}
		return member;
	}
	public void deleteMemberByTel(String tel) {	
		if(checkKey(tel) == true) 
			map.remove(tel);
		else 
			System.out.println("멤버가 없습니다.");
	}
	public void updateMember(Member member) {
		if(checkKey(member.getTel()) == true) 
			map.replace(member.getTel(), member);
		else 
			System.out.println("멤버가 없습니다.");
	}
}
