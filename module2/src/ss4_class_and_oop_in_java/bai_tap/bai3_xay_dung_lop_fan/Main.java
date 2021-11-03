package ss4_class_and_oop_in_java.bai_tap.bai3_xay_dung_lop_fan;

public class Main {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setOn(true);
		fan1.setColor("Blue");
		System.out.println(fan1.toString());
		fan1.setOn(false);
		System.out.println(fan1.toString());

	}

}
