package Uno;

public class card {

	private String color;
	private String value;
	
	public card(String color, String value) {
		this.color = color;
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public String getValue() {
		return value;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override 
	public String toString() {
		return color + " " + value;
	}
}
