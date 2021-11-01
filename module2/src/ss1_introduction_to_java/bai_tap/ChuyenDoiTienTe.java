package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class ChuyenDoiTienTe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double usd;
		System.out.println("Nhập vào usd: ");
		usd = scanner.nextDouble();
		double vnd = 23000*usd;
		System.out.print(usd+" USD = "+vnd+"VND");

	}

}
