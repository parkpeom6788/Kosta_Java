package step4_test;

public class ItemService {
	private Item[] items;
	private int total;
	
	public ItemService() {
	}
	public ItemService(Item[] items) {
		this.items = items;
	}
	public void printNameAll() {
		for(int i = 0 ; i < items.length; i++) {
			System.out.println(items[i].getName());
		}
	}
	public void printPriceAll() {
		for(int i = 0; i < items.length; i++) {
			total += items[i].getPrice();
		}
		System.out.println("총 가격 : " + total);
	}
	public void infoItem(String str) {
		for(int i = 0; i < items.length; i++) {
			if(str.equals(items[i].getName())) {
				System.out.print("검색한 " + items[i].getName() + "가격은 ");
				System.out.println(items[i].getPrice() +"원");
			}
		}
	}
	public void orderPrice() {
		int temp;
		for(int i = 0 ; i < items.length; i++) {
			for(int j = 0 ; j < items.length -1-i; j++) {
				if(items[i].getPrice() > items[j+1].getPrice()) {
					temp = items[j].getPrice();
					//items[j].getPrice() = items[j+1].getPrice();
				}
			}
		}
	}
}
