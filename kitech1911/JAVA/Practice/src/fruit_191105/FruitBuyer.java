package fruit_191105;

public class FruitBuyer {

	//상태값: 보유금액, 사과의 개수
	int buyersMoney = 10000;
	int buyersnumofApple = 0;
	                               //?무슨뜻이지?
	void buyApple(FruitSeller seller, int money) {
		int num = seller.saleApple(money);//?어디서 튀어나옴?왜 모양새가..
		buyersnumofApple += num;
		buyersMoney -= money;
	}
	
	void showBuyResult() {
	System.out.println("현재 구매자 보유금액" + buyersMoney);
	System.out.println("사과의 개수: " + buyersnumofApple);
		
	}
	
	
	
	
	
}
