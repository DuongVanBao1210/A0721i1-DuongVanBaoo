package ss4_class_and_oop_in_java.bai_tap.bai1_xay_dung_lop_quadraticequation;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhâp a: ");
	    double a = scanner.nextDouble();
	    System.out.println("Nhâp b: ");
	    double b = scanner.nextDouble();
	    System.out.println("Nhâp c: ");
	    double c = scanner.nextDouble();
	    QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
	    
	    if(quadraticEquation.getDiscriminant() > 0) {
	    	System.out.println("Phương trình có 2 nghiệm phân biệt: x1= " + quadraticEquation.getRoot1() + " " +
                    "x2= " + quadraticEquation.getRoot2());
	    }
	    else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phương trình có nghiệm kép x= " + quadraticEquation.getRoot2());
        } 
	    else {
            System.out.println("phương trình vô nghiệm!");
        }
	}

}
