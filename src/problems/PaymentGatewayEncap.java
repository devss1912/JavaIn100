package problems;


public class PaymentGatewayEncap {


	public static void main(String[] args) {
		MySecureData encapedData = new MySecureData();
		short cvv = encapedData.getCVV();
		if(cvv ==1233) {
			System.out.println("Cvv verified");
		}
		else {
			System.out.println("CVV is wrong");
		}
		
		encapedData.setPurchaseAmt(787878);
		
	}}


