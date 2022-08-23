package common;

import java.io.File;
// common 패키지 : 공통적으로 쓰이는 곳     자주쓰이는 경로를 인터페이스의 상수로 
public interface DirInfo {
	// Interface 이므로 public static final 상수로 인식
	String OUTPUT_TEST_PATH = "C:" + File.separator + "kosta250" + File.separator + "iotest";
}
