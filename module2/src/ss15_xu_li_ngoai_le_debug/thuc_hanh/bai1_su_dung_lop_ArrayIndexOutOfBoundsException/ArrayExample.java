package ss15_xu_li_ngoai_le_debug.thuc_hanh.bai1_su_dung_lop_ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        Integer[] array = createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của 1 phần tử bất kì");
        int n = scanner.nextInt();
        try {
            System.out.println("Giá trị phần tử có chỉ số " + n + " là " + array[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.err.println("Chỉ số vượt quá giới hạn cảu mảng");
        }
    }
}
