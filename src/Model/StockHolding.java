package Model;

public class StockHolding extends Stock {
	private double quantity;
	private double holdingValue;

	/**
	 * Gets the quantity of stock in the holding
	 * @return the quantity of stock in the holding
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity of stock in the holding
	 * @param quantity the quantity of stock in the holding
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the value of the holding
	 * @return the value of the holding
	 */
	public double getHoldingValue() {
		return holdingValue;
	}

	/**
	 * Sets the value of the holding
	 * @param holdingValue the value of the holding
	 */
	public void setHoldingValue(double holdingValue) {
		this.holdingValue = holdingValue;
	}
}
