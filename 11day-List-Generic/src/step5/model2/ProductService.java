package step5.model2;

import java.util.ArrayList;
import step5.test2.Product;
public class ProductService {
	ArrayList<Product> list;
	public ProductService() {
		list = new ArrayList<Product>();
	}
	public void addProduct(Product product) {
		list.add(product);
	}
	public void printAll() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
