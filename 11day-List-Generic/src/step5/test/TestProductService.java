package step5.test;
import step5.model.ProductService;
public class TestProductService {
	public static void main(String[] args) {
		ProductService service = new ProductService();
		service.addProduct(new Product(1,"진라면","오뚜기",1200));
		service.addProduct(new Product(2,"테라","하이트진로",1410));
		service.addProduct(new Product(3,"처음처럼","롯데",1100));
		service.printAll();
	}
}
