package model.service;

import java.io.File;
// import java.io.IOException;
import java.util.ArrayList;

import model.exception.DuplicateTelException;
import model.exception.MemberNotFoundException;
import model.vo.Member;
// import model.vo.Teacher;

// Service : business logic 담당 객체
public class SchoolService {
	private String path = "C:"+File.separator+"kosta250"+File.separator+"iotest"+File.separator+"school"+File.separator+"member-list.obj";
			
	private ArrayList<Member> list = new ArrayList<>();
	File dir1 = new File(path);
	public SchoolService() {
		// 직렬화 할 파일 경로에 해당하는 디렉토리가 존재하지 않는다면 동적으로 디렉토리를 생성한다
		File file=new File(path);
		File dir= file.getParentFile();
		if(dir.isDirectory()==false) {
			dir.mkdir()	;
		}
	}
/*
 * 객체 역직렬화 작업을 하는 메서드
 */
	public void loadData() {
		
	}
/*
 * 객체 직렬화 작업을 하는 메서드
 */
	public void saveData() {

	}

	public int findIndexByTel(String tel) {
		int position = -1;
		for (int i = 0; i < list.size(); i++) {
			if (tel.equals(list.get(i).getTel())) {
				position = i;
				break;
			}
		}
		return position;
	}

	public void addMember(Member member) throws DuplicateTelException {
		if (findIndexByTel(member.getTel()) != -1) // - 1이 아니면 (기본 구성원이 존재하면)
			throw new DuplicateTelException(member.getTel() + "이 중복되어 등록불가");
		list.add(member);
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		int index = findIndexByTel(tel);
		// System.out.println(index);
		if (index == -1)
			throw new MemberNotFoundException(tel + " tel에 해당하는 구성원 정보가 없습니다");
		return list.get(index);
	}

	public void deleteMemberByTel(String tel) throws MemberNotFoundException {
		int index = findIndexByTel(tel);
		if (index != -1) {
			list.remove(findIndexByTel(tel));

		} else {
			throw new MemberNotFoundException(tel + " tel에 해당하는 구성원 정보가 없어서 삭제불가!");

		}
	}

	public void updateMember(Member member) throws MemberNotFoundException {
		int index = findIndexByTel(member.getTel());
		if (index == -1) {
			throw new MemberNotFoundException(member.getTel() + " tel에 해당하는 구성원이 존재하지 않아 수정불가");
		} else {
			list.set(index, member);
		}

	}
}
