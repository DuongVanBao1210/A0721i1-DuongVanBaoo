package ss6_inheritance.thuc_hanh;
import ss7_abstract_class_and_interface.bai_tap.bai1_trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Resizeable;
import ss7_abstract_class_and_interface.bai_tap.bai2_trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.Colorable;
public class Square extends Shape implements Resizeable,Colorable {
	private double size = 3.0;
	

	public Square() {
		
	}
	
	public Square(double size) {
		this.size = size;
	}
	
	public Square(double size, String color, boolean filled) {
		super(color, filled);
		this.size = size;
		
	}
	
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    

    public double getArea() {
        return size*size;
    }

    public double getPerimeter() {
        return 4*size;
    }

    @Override
    public String toString() {
        return "A Rectangle with size = "
                + getSize()
                +" Area= "
                +getArea()
                + ", which is a subclass of "
                + super.toString();
    }
    
    @Override
    public void resize(double percent) {
        this.size += (this.size*percent/100);
    }
    
    @Override
    public void howToColor() {
    	System.out.println("Color all four sides...");
    }
}
