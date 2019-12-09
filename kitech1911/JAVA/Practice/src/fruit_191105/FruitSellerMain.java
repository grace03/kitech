package fruit_191105;

public class FruitSellerMain {

	public static void main(String[] args) {
		FruitSeller seller;
		seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		buyer.buyApple(seller, 6000);
		
		System.out.println("판매자의 현재 상황");
		seller.showSaleResult();
		
		System.out.println("구매자의 현재 상황");
		buyer.showBuyResult();

	}

}
