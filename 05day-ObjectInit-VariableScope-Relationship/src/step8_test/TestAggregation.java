package step8_test;

public class TestAggregation {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("아이유");
		
		s.setNoteBook(new NoteBook("SAMSUNG", "WHITE"));
		System.out.println("모델 : " + s.getNoteBook().getModel());
		System.out.println("색깔 : " + s.getNoteBook().getColor());
		
		s.getNoteBook().setColor("RED");
		System.out.println("변경된 후 색깔 : " + s.getNoteBook().getColor());
		
		System.out.println(s); // 주소값 
		
	}
}
