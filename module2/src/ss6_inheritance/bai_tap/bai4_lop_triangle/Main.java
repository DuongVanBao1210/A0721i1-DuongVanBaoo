package ss6_inheritance.bai_tap.bai4_lop_triangle;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
        System.out.println("Nhập vào độ dài 3 cạnh của tam giác");
        double side1=Double.parseDouble(scanner.nextLine());
        double side2=Double.parseDouble(scanner.nextLine());
        double side3=Double.parseDouble(scanner.nextLine());
        
        
        
        System.out.println("Nhập màu sắc của tam giác");
        String color=scanner.nextLine();
        
        System.out.println("Tam giác có phải filled?");
        boolean filled=scanner.hasNext();
        
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            Triangle triangle= new Triangle(color,filled,side1,side2,side3);
            System.out.println(triangle);
        }else{
            System.out.println("Bạn nhập vào không phải 1 tam giác!");
        }
        
        

	}

}
