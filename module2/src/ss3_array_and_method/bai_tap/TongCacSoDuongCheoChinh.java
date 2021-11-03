package ss3_array_and_method.bai_tap;
import java.util.Scanner;
public class TongCacSoDuongCheoChinh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số hàng: ");
		int row = scanner.nextInt();
		int col;
		do {
			System.out.println("Nhập vào số cột: ");
			 col = scanner.nextInt();
			if(col != row) {
				System.out.println("Số cột phải bằng số hàng: ");
			}
		}while(col != row);
		int[][] array = new int[row][col];
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.println("Nhập phần tử Array["+i+"]["+j+"]");
				array[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Mảng đã nhập là: ");
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println("Tổng các số nằm trên đường chéo của ma trận là: "+sumDuongCheo(array, row, col));
		

	}
	public static int sumDuongCheo(int[][] array, int row, int col) {
		int sum=0;
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(i == j) {
					sum += array[i][j];
				}
			}
		}
		return sum;
	}

}
