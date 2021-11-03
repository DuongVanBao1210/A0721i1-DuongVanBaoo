package ss3_array_and_method.bai_tap;
import java.util.Scanner;
public class SumOfColumn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số hàng của ma trận: "); 
		int row = scanner.nextInt();
		System.out.println("Nhập vào số cột của ma trận: ");
		int col = scanner.nextInt();
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
		findMaxColumn(array,row,col);
		

	}
	public static void findMaxColumn( int[][]array,int row,int col){
        Scanner scanner=new Scanner(System.in);
        int column;
        do {
            System.out.println("Nhập cột bạn muốn tính tổng:");
            column=scanner.nextInt();
            if (column<1 || column>col){
                System.out.println("Nhập sai!!");
            }
        }while (column<1 || column>col);
        int sum=0;
        for (int i=0;i<row;i++){
                sum+=array[i][column-1];
        }
        System.out.println("Tổng các số ở cột thứ "+column+" là: "+sum);
    }

}
