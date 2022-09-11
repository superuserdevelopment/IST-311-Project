
public class CryptoHolding extends Crypto {
	private double quantity;
	private double holdingValue;
	
	public CryptoHolding(){
		quantity = 0.0;
		holdingValue = 0.0;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public double getHoldingValue() {
		return holdingValue;
	}
	
	public void setHoldingValue(double holdingValue) {
		this.holdingValue = holdingValue;
	}
}
