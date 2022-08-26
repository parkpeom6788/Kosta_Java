package model.Interface;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.exception.DuplicatedException;
import model.exception.MemberNotException;
import model.vo.Member;

interface Service {
	
	public int findIndexMember(String tel);
	
	public Member findMemberByTel(String tel) throws MemberNotException ;

	public void addMember(Member member) throws DuplicatedException;
	
	public void printAll();
	
	public void deleteMember(String tel) throws MemberNotException;
	
	public void updateMember(Member member) throws MemberNotException;

	public void save() throws FileNotFoundException, IOException;

	public void info()  throws FileNotFoundException, ClassNotFoundException, IOException;
}
