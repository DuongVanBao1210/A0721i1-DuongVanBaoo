package ss15_xu_li_ngoai_le_debug.bai_tap.bai1_su_dung_lop_IllegalTriangleException;
import java.util.Scanner;
public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh a,b,c của 1 tam giác");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        try {
            triangle(a, b, c);
            System.out.println(a + ", " + b + ", " + c + ", " + "là 3 cạnh của 1 tam giác");
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

	
    public static void triangle (double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Canh tam giac phai lon hon 0");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Không phải 3 cạnh của 1 tam giác");
        }
    }

}
