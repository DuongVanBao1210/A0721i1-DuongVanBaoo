package ss4_class_and_oop_in_java.bai_tap.bai3_xay_dung_lop_fan;

public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public int getSLOW() {
		return SLOW;
	}
	
	public int getMEDIUM() {
		return MEDIUM;
	}
	
	public int getFAST() {
		return FAST;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Fan() {
		
	}
	
	public String toString() {
		String result;
		if(this.on) {
			 result = "Speed = "+this.speed + ", Color is: " + this.color + ", Radius of fan is: " + this.radius + ", fan is on";
		}
		else {
			 result ="Color is: "+ this.color + ", Radius of fan is: " + this.radius + ", fan is off";
		}
		return result;
	}

}
