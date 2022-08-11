package step3;
import java.util.ArrayList;
public class TestList3 {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1,"진라면","오뚜기",1000));
		list.add(new Product(2,"테라","하이트진로",1410));
		list.add(new Product(3,"처음처럼","롯데",1300));
		list.add(new Product(4,"열라면","오뚜기",1100));
		System.out.println("**상품의 총합**");
		int totalPrice = 0;
		for(int i = 0; i < list.size(); i++ ) {
			totalPrice += list.get(i).getPrice();
		}
		System.out.println("총합 : " + totalPrice);
		System.out.println("**maker가 오뚜기인 상품정보를 모두 출력**");
		String maker = "오뚜기";
		// for loop 와 if 를 이용해 maker에 해당하는 상품 정보를 출력 (equals() 를 이용, toString())
		boolean check = false;
		for(int i = 0; i < list.size(); i++) {
			if(maker.equals(list.get(i).getMaker())) {
				System.out.println(list.get(i).toString());
				check = true;
			}
		}
		if(check == false) {
			System.out.println("maker가 "+maker+"인 상품이 없습니다.");
		}
	}
}
