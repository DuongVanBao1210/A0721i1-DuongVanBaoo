package ss6_inheritance.thuc_hanh;

public class Main {

	public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.7, 6.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.7, 6.8, "red", true);
        System.out.println(rectangle);
        
        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);

        square = new Square(5.8, "green", true);
        System.out.println(square);
	}

}
