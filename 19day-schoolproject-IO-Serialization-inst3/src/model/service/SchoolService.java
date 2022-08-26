package model.service;
// Service : business logic 담당 객체 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.exception.DuplicateTelException;
import model.exception.MemberNotFoundException;
import model.vo.Member;

public class SchoolService {
	private String path=
	"C:"+File.separator+"kosta250"+File.separator+"iotest"+File.separator+"school"+File.separator+"member-list.obj";
	private ArrayList<Member> list=new ArrayList<>();	
	
	public SchoolService() {
		// 직렬화 할 파일 경로에 해당하는 디렉토리가 존재하지 않는다면 동적으로 디렉토리를 생성한다 
		File file=new File(path);
		File dir=file.getParentFile();
		if(dir.isDirectory()==false) {
			dir.mkdirs();
		}
	}	
	/*
	 *  객체 역직렬화 작업을 하는 메서드 
	 */
	@SuppressWarnings("unchecked")
	public void loadData() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file=new File(path);
		if(file.isFile()) { //path의 파일이 존재하면 역직렬화를 수행한다 
			ObjectInputStream ois=null;
			try {
				ois=new ObjectInputStream(new FileInputStream(file));
				this.list=(ArrayList<Member>) ois.readObject();
			}finally {
				if(ois!=null)
					ois.close();
			}
		}//if
	}//method
	/*
	 *  객체 직렬화 작업을 하는 메서드 
	 */
	public void saveData() throws FileNotFoundException, IOException {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(list);
		}finally {
			if(oos!=null)
				oos.close();
		}
	}
	
	
	public int findIndexByTel(String tel) {
		int position=-1;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				position=i;
				break;
			}
		}
		return position;
	}
	public void addMember(Member member) throws DuplicateTelException{
		if(findIndexByTel(member.getTel())!=-1) //-1 이 아니면 ( 기존 구성원이 존재하면 ) 
			throw new DuplicateTelException(member.getTel()+" tel이 중복되어 등록불가");
		list.add(member);
	}
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	public Member findMemberByTel(String tel) throws MemberNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없습니다! ");
		return list.get(index);
	}
	public void deleteMemberByTel(String tel) throws MemberNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없어서 삭제불가!");
		list.remove(index);
	}
	public void updateMember(Member member) throws MemberNotFoundException {
		int index=findIndexByTel(member.getTel());
		if(index==-1)
			throw new MemberNotFoundException(member.getTel()+" tel에 해당하는 구성원이 존재하지 않아 수정불가! ");
		list.set(index, member);
	}
}



















