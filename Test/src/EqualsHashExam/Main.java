package EqualsHashExam;

public class Main {
	
	public static void main(String[] args) {
		
		Student leo1 = new Student(1L,"Leo");
		Student leo2 = new Student(1L,"Leo");
		
		System.out.println("leo1 hashcode => " + leo1.hashCode()); 
		System.out.println("leo2 hashcode =>" + leo2.hashCode());
		System.out.println("leo1.equals(leo2) => " + leo1.equals(leo2)); // false -> true
	}
}
