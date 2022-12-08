/**
 * IST-311 Object Oriented Design and Software Application
 * Prof. Jesse Middaugh
 * Project
 * Team-2
 */

package Model;

public class CryptoHolding extends Crypto {
	private double quantity;
	private double holdingValue;

	/**
	 * Constructor to initialize the Model.Crypto Holding object
	 */
	public CryptoHolding(){
		quantity = 0.0;
		holdingValue = 0.0;
	}

	/**
	 * Get the quantity of the crypto holding
	 * @return the quantity of the crypto holding
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * Set the quantity of the crypto holding
	 * @param quantity the quantity of the crypto holding
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/**
	 * Get the value of the crypto holding
	 * @return the value of the crypto holding
	 */
	public double getHoldingValue() {
		return holdingValue;
	}

	/**
	 * Set the value of the crypto holding
	 * @param holdingValue the value of the crypto holding
	 */
	public void setHoldingValue(double holdingValue) {
		this.holdingValue = holdingValue;
	}
}
