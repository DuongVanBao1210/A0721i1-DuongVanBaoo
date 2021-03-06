package ss6_inheritance.bai_tap.bai1_lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
	
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return area()*height;
    }

    @Override
    public String toString() {
        return "height = "+height+","+super.toString()+","+"volume = "+volume();
    }
}
