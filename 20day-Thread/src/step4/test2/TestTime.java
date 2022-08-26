package step4.test2;

import java.text.SimpleDateFormat;

public class TestTime {
	/*
	 * 파일명이 중복될 경우 시간 정보(파일 생성시간)를 이용해 구분
	 * System.currentTimeMillis() : 반환 되는 타입인 long 형인 시간데이터
	 * 												: 세계 표준시 기준으로 몇 밀리세컨드가 흘렀는지 기록된 값 
	 * SimpleDateFormat을 이용하면 사람이 확인할 수 있는 시간정보를 확인가능하다
	 *  
	 */
	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String nowTime = s.format(time);
		System.out.println(nowTime);
		// 생성할 파일명
		String fileName = "0_"+time+".mp3";
		System.out.println(fileName);
	}
}
