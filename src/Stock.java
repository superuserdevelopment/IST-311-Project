
public class Stock extends Commodity {
	private String ceo;
	private String headquarters;
	private int founded;
	private double open;
	private double high;
	private double low;
	private double marketCap;
	private double weekHigh52; // could not start variable name with number
	private double weekLow52;
	private long volume;
	
	public String getCEO() {
		return ceo;
	}
	
	public void setCEO(String ceo) {
		this.ceo = ceo;
	}
	
	public String getHeadquarters() {
		return headquarters;
	}
	
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	
	public int getFounded() {
		return founded;
	}
	
	public void setFounded(int founded) {
		this.founded = founded;
	}
	
	public double getOpen() {
		return open;
	}
	
	public void setOpen(double open) {
		this.open = open;
	}
	
	public double getHigh() {
		return high;
	}
	
	public void setHigh(double high) {
		this.high = high;
	}
	
	public double getLow() {
		return low;
	}
	
	public void setLow(double low) {
		this.low = low;
	}
	
	public double getMarketCap() {
		return marketCap;
	}
	
	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}
	
	public double getWeekHigh52() {
		return weekHigh52;
	}
	
	public void setWeekHigh52(double weekHigh52) {
		this.weekHigh52 = weekHigh52;
	}
	
	public double getWeekLow52() {
		return weekLow52;
	}
	
	public void setWeekLowh52(double weekLow52) {
		this.weekLow52 = weekLow52;
	}
	
	public long getVolume() {
		return volume;
	}
	
	public void setVolume(long volume) {
		this.volume = volume;
	}
}
