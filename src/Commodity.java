
public abstract class Commodity {
	private String scrip;
	private String name;
	private String about;
	private double value;
	
	public String getScrip() {
		return scrip;
	}
	
	public void setScrip(String scrip) {
		this.scrip = scrip;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
}
