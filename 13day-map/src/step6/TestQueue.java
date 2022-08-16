package step6;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	
	public static void main(String[] args) {
		
		// Queue 자료구조의 특징 : FIFO (First In , First Out) 
		Queue<String> queue = new LinkedList<String>();
		queue.add("상현씨 안뇽~");
		queue.add("뭐해?");
		queue.add("대답안해?");
		queue.add("우리 헤어져");
		// System.out.println(queue.poll()); // FIFO 첫번째 요소가 추출
		// System.out.println(queue)
		// while loop , isEmpty() , poll()
		while((queue.isEmpty() != true)) {
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
