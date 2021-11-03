package ss7_abstract_class_and_interface.bai_tap.bai1_trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;
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
	        System.out.println("Trước khi tăng kích thước: ");
	       for (Shape shape1: shapes){
	           System.out.println(shape1);
	       }
	       
	       System.out.println("Sau khi tăng kích thước: ");
	       double percent;
	        for (Shape shape:shapes){

	             percent=Math.floor(Math.random()*100);
	            System.out.println("percent= "+percent+"%");
	            if (shape instanceof Circle){
	                Circle circle=(Circle)shape;
	                circle.resize(percent);
	                System.out.println(circle);
	            }else if (shape instanceof Square){
	                Square square=(Square)shape;
	                square.resize(percent);
	                System.out.println(square);
	            } else if (shape instanceof Rectangle){
	                Rectangle square=(Rectangle) shape;
	                square.resize(percent);
	                System.out.println(square);
	            }

	        }

	}

}
