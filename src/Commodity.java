
public abstract class Commodity {

	//Stores the unique string to identify each Commodity
	private String scrip;

	//Stores the name of the Commodity
	private String name;

	//Stores the description of the Commodity
	private String about;

	//Stores the value of the Commodity
	private double value;

	/**
	 * Get the scrip of the Commodity
	 * @return the scrip of the Commodity
	 */
	public String getScrip() {
		return scrip;
	}

	/**
	 * Set the scrip of the Commodity
	 * @param scrip the scrip of the Commodity
	 */
	public void setScrip(String scrip) {
		this.scrip = scrip;
	}

	/**
	 * Get the name of the Commodity
	 * @return the name of the Commodity
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the scrip of the Commodity
	 * @param name the name of the Commodity
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the about of the Commodity
	 * @return the about of the Commodity
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * Set the about of the Commodity
	 * @param about the about of the Commodity
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * Get the value of the Commodity
	 * @return the value of the Commodity
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Set the value of the Commodity
	 * @param value the value of the Commodity
	 */
	public void setValue(double value) {
		this.value = value;
	}
}
