package ss7_abstract_class_and_interface.bai_tap.bai2_trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;
import ss6_inheritance.thuc_hanh.Rectangle;
import ss6_inheritance.thuc_hanh.Shape;
import ss6_inheritance.thuc_hanh.Circle;
import ss6_inheritance.thuc_hanh.Square;
public class Main {

	public static void main(String[] args) {
		 Shape []shapes=new Shape[3];
	        shapes[0]=new Circle(2);
	        shapes[1]=new Rectangle(2,3);
	        shapes[2]=new Square(2);
	        
	        for (Shape shape : shapes) {
	            if (shape instanceof Circle) {
	                System.out.println(((Circle) shape).getArea());
	            } else if (shape instanceof Square) {
	                System.out.println(((Square) shape).getArea());
	            } else if (shape instanceof Rectangle) {
	                System.out.println(((Rectangle) shape).getArea());
	            }
	            if (shape instanceof Colorable) {
	                ((Colorable) shape).howToColor();
	            }
	        }
	    }

	}


