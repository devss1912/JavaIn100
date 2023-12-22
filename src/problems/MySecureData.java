package problems;

public class MySecureData {
	
	private short mycvv = 123;
	private int purchaseAmt = 0;
	
	public short getCVV() {
		return mycvv;
	}
	
	public void setPurchaseAmt(int x) {
		purchaseAmt = x;
		System.out.println(purchaseAmt);
		
	}
}
