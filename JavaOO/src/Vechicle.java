
public class Vechicle {
	private String color;
	private Integer topSpeed;
	
	public Vechicle() {
		
	}
	
	public Vechicle(String color, Integer topSpeep) {
		this.color = color;
		this.topSpeed = topSpeep;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}
	
}
