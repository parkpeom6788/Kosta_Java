package step9;

import java.util.Random;
import java.util.TreeSet;
public class LottoService  {
	/*
	 * Lotto 번호는 1이상 45이하의 중복되지 않는 정수들로 구성된다. 
	 * 랜덤한 정수들을 생성하기 위해 Random 의 nextInt(bound) 를 사용
	 * 중복을 허용하지 않아야 하므로 Set 계열 적합 
	 *  정렬 기능을 제공하는 TreeSet 으로 요소들을 저장하면 된다.
	 */
	public TreeSet<Integer> createLottoNumber() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		// 언제까지 반복해야될지 모를때 while문이 적합
		// while문을 이용해 size가 6보다 작은 동안 반복하면서 set 에 요소를 추가
		while(set.size() < 6) {
			int num = r.nextInt(45) + 1;
			set.add((int)(Math.random()*45)+1); // (int)(0.0 ~ 1.0) -> (0 ~ 1) * 45 -> 0 ~ 45 -> 1 ~ 45
		}
		return set;
	}
}
