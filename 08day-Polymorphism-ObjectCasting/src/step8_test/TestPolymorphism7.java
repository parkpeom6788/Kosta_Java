package step8_test;

import step8.Employee;
import step8.Engineer;
import step8.HumanResourceService;
import step8.Manager;

public class TestPolymorphism7 {
	Employee  e = new Employee(1,"아이유",400); // 사원번호 , 사원명 , 월급명
	Manager m = new Manager(2,"손석구",500,"영업부"); 
	HumanResourceService service = new HumanResourceService(); // 인적자원 서비스
	service.printInfo(e); // empNo : 1  name : 아이유 salary : 400
	service.printInfo(m); // empNo : 2 , name : 손석구 , salary : 500 department : 영업부
	// Engineer만 구성되면 service 코드는 바꿀필요가 없다.
	Engineer en = new Engineer(3,"고슬링",700,"자바",300); // 개발자는 보너스가 있다.
	service.printInfo(en); // empNo : 3 , name : 고슬링 , salary : 700 , skill : 자바 , bonus : 300
	
	// 연봉을 출력해주는 메소드 만들기
	//  x 12 
	service.printAnnualSalary(e); // Employee salary * 12
	service.printAnnualSalary(m); // Manager salary * 12
	service.printAnnualSalary(en); // Engineer salary * 12 + bonus * 12 결과
}
