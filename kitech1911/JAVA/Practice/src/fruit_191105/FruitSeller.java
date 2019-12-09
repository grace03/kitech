package fruit_191105;

public class FruitSeller {

	//상태값:사과의 개수, 수익금, 사과의 가격
	int numofApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;
	
	int saleApple(int money) {
		
		int num = money/APPLE_PRICE;
		numofApple = numofApple - num;
		myMoney = myMoney + money;
		return num;
		
	}

	void showSaleResult() {
		System.out.println("남은 사과의 개수: " + numofApple);
		System.out.println("판매 수익: " + myMoney);
	}
	
	
	
	
	
	
	
}
