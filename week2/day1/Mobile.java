package week2.day1;

public class Mobile {

	public void makeCall(String mobileModel, float mobileWeight  ) {
		
		System.out.println("Mobile Model:" + mobileModel);
		System.out.println("Mobile Weight:"+ mobileWeight);
		
	}
	
	public void  sendMsg(boolean isFullCharged, int mobileCost ) {
		System.out.println("Mobile is Charged: "+ isFullCharged);
		System.out.println("Mobile Cost:"+ mobileCost);
		
	}
	
	public static void main(String[] args) {
		
		Mobile feature = new Mobile();
		feature.makeCall("oneplus", 180.00f);
		feature.sendMsg(false, 10000);
		System.out.println("This is my mobile");
	}
}
