package step9_test;

import java.util.HashSet;
import java.util.Random;
public class LottoService {
	public HashSet<Integer> createLottoNumber() {
		Random r = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) {
			set.add(r.nextInt(45)+1);
		}
		return set;
	}
}
