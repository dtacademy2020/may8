package shapes;

import java.util.Date;

public class Shape {
	
	
	private String color = "white";
	private boolean isFilled = false;
	private Date dateCreated;
	
	
	
	public Shape(String color, boolean filled) {
		
		this.color = color;
		this.isFilled = filled;
		
		dateCreated = new Date();
	}
	
	public Shape() {}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean filled) {
		this.isFilled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	
	public String toString() {
		return "Shape [color=" + color + ", filled=" + isFilled + ", dateCreated=" + dateCreated + "]";
	}
	
	
	
	
	
	
	
	

}
