package Model;

public class Crypto extends Commodity {
	private int founded;

	/**
	 * Constructor to create a Model.Crypto object
	 */
	public Crypto(){
		founded = -1;		
	}

	/**
	 * Get the founding year of the cryptocurrency
	 * @return the founding year of the crypto
	 */
	public int getFounded() {
		return founded;
	}

	/**
	 * Set the founding year of the cryptocurrency
	 * @param founded the founding year of the cryptocurrency
	 */
	public void setFounded(int founded) {
		this.founded = founded;
	}
}
