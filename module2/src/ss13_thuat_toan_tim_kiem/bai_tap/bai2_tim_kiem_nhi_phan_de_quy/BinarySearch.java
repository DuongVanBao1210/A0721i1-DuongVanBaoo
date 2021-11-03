package ss13_thuat_toan_tim_kiem.bai_tap.bai2_tim_kiem_nhi_phan_de_quy;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
	static int BinarySearch(int[] array, int left, int right, int key) {
		if ( right >= left) {
			int mid = (left + right)/2;
			if (key == array[mid]) {
				return mid;
			}
			else if (key > array[mid]) {
				return BinarySearch(array, mid + 1, right, key);
			}
			else {
				return BinarySearch(array, left, mid - 1, key);
			}
		}
		return -1;
		
		
		
	}
	static int[] SapXep(int[] array) {
		for (int i = 0; i< array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

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
		System.out.println("Mảng ban đầu: ");
		System.out.print(Arrays.toString(array));
		System.out.println();
		
		
		
		System.out.println("Mảng sau khi sắp xếp tăng dần: ");
		System.out.println(Arrays.toString(SapXep(array)));
		
		System.out.print("Nhập số bạn muốn tìm kiếm: ");
		int key = scanner.nextInt();
		
		int result = BinarySearch(array, 0, size - 1, key);
		if (result == -1) {
			System.out.println("Số "+key+" Không có trong mảng!!!");
		}
		else {
			System.out.println("Số "+key+" nằm ở phần tử thứ "+result+"");
		}
		

	}

}
