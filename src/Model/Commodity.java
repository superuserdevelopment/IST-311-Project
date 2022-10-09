package Model;

public abstract class Commodity {

	//Stores the unique string to identify each Model.Commodity
	private String scrip;

	//Stores the name of the Model.Commodity
	private String name;

	//Stores the description of the Model.Commodity
	private String about;

	//Stores the value of the Model.Commodity
	private double value;

	/**
	 * Get the scrip of the Model.Commodity
	 * @return the scrip of the Model.Commodity
	 */
	public String getScrip() {
		return scrip;
	}

	/**
	 * Set the scrip of the Model.Commodity
	 * @param scrip the scrip of the Model.Commodity
	 */
	public void setScrip(String scrip) {
		this.scrip = scrip;
	}

	/**
	 * Get the name of the Model.Commodity
	 * @return the name of the Model.Commodity
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the scrip of the Model.Commodity
	 * @param name the name of the Model.Commodity
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the about of the Model.Commodity
	 * @return the about of the Model.Commodity
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * Set the about of the Model.Commodity
	 * @param about the about of the Model.Commodity
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * Get the value of the Model.Commodity
	 * @return the value of the Model.Commodity
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Set the value of the Model.Commodity
	 * @param value the value of the Model.Commodity
	 */
	public void setValue(double value) {
		this.value = value;
	}
}
