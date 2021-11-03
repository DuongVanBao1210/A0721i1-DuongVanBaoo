package ss3_array_and_method.bai_tap;
import java.util.Scanner;
import java.util.Arrays;

public class DeletElement {

	public static void main(String[] args) {
		int size;
		int[] array;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Enter a size: ");
			size = scanner.nextInt();
			if(size > 20)
			{
				System.out.println("Size should not exceed 20");
			}
		}while(size > 20);
		array = new int[size];
		for(int i = 0; i< array.length;i++) {
			System.out.print("Enter element "+(i+1)+" : ");
			array[i]=scanner.nextInt();
		}
		boolean check;
        int index = 0;
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        System.out.println("Nhập phần tử bạn muốn xóa!");
        do {
            int deleteElement = scanner.nextInt();
            check = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == deleteElement) {
                    index = i;
                    check = true;
                    deleteArray(array, index);
                    i--;
                }
            }
            if (!check) {
                System.out.println("không tìm thấy phần tử trong mảng, xin mời nhập lại!");
            }

        } while (!check);
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(array));
	}
	public static int[] deleteArray(int[] array, int index) {
        int temp;
        for (int i = index; i < array.length - 1; i++) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        array[array.length - 1] = 0;
        return array;
    }

}
