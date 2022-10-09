
public class Stock extends Commodity {

	// Stores the CEO of the company
	private String ceo;

	// Stores the headquarters of the company
	private String headquarters;

	// Stores the year in which the company was founded
	private int founded;

	// Stores the opening price of the stock
	private double open;

	// Stores the high of the stock
	private double high;

	// Stores the low of the stock
	private double low;

	// Stores the market capitalization of the stock
	private double marketCap;

	// Stores the 52-week high of the stock
	private double weekHigh52;

	// Stores the 52-week low of the stock
	private double weekLow52;

	// Stores the trade volume of the stock
	private long volume;

	/**
	 * Gets the CEO of the company
	 * @return the CEO of the company
	 */
	public String getCEO() {
		return ceo;
	}
	
	public void setCEO(String ceo) {
		this.ceo = ceo;
	}

	/**
	 * Gets the headquarters of the company
	 * @return the headquarters of the company
	 */
	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	/**
	 * Gets the year in which the company was founded
	 * @return the year in which the company was founded
	 */
	public int getFounded() {
		return founded;
	}

	/**
	 * Sets the founding year of the company
	 * @param founded the founding year of the company
	 */
	public void setFounded(int founded) {
		this.founded = founded;
	}

	/**
	 * Gets the opening price of the stock
	 * @return the opening price of the stock
	 */
	public double getOpen() {
		return open;
	}

	/**
	 * Sets the opening price of the stock
	 * @param open the opening price of the stock
	 */
	public void setOpen(double open) {
		this.open = open;
	}

	/**
	 * Gets the high price of the stock
	 * @return the high price of the stock
	 */
	public double getHigh() {
		return high;
	}

	/**
	 * Sets the high price of the stock
	 * @param high the high price of the stock
	 */
	public void setHigh(double high) {
		this.high = high;
	}

	/**
	 * Gets the low price of the stock
	 * @return the low price of the stock
	 */
	public double getLow() {
		return low;
	}

	/**
	 * Sets the low price of the stock
	 * @param low the low price of the stock
	 */
	public void setLow(double low) {
		this.low = low;
	}

	/**
	 * Gets the market capitalization of the stock
	 * @return the market capitalization of the stock
	 */
	public double getMarketCap() {
		return marketCap;
	}

	/**
	 * Sets the market capitalization of the stock
	 * @param marketCap the market capitalization of the stock
	 */
	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	/**
	 * Gets the 52-week high of the stock
	 * @return the 52-week high of the stock
	 */
	public double getWeekHigh52() {
		return weekHigh52;
	}

	/**
	 * Sets the 52-week high of the stock
	 * @param weekHigh52 the 52-week high of the stock
	 */
	public void setWeekHigh52(double weekHigh52) {
		this.weekHigh52 = weekHigh52;
	}

	/**
	 * Gets the 52-week low of the stock
	 * @return the 52-week low of the stock
	 */
	public double getWeekLow52() {
		return weekLow52;
	}

	/**
	 * Sets the 52-week low of the stock
	 * @param weekLow52 the 52-week low of the stock
	 */
	public void setWeekLowh52(double weekLow52) {
		this.weekLow52 = weekLow52;
	}

	/**
	 * Gets the trading volume of the stock
	 * @return the trading volume of the stock
	 */
	public long getVolume() {
		return volume;
	}

	/**
	 * Sets the trading volume of the stock
	 * @param volume the trading volume of the stock
	 */
	public void setVolume(long volume) {
		this.volume = volume;
	}
}
