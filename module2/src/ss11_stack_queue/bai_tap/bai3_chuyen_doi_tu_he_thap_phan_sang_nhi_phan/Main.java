package ss11_stack_queue.bai_tap.bai3_chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> binaryStack = new Stack<Integer>();
        ArrayList<String> binaryArrayList = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the decimal: ");
        int decimal = scanner.nextInt();
        while (decimal != 0) {
            int temp = decimal % 2;
            binaryStack.push(temp);
            decimal /= 2;
        }
        while (!binaryStack.isEmpty()) {
            binaryArrayList.add(String.valueOf(binaryStack.pop()));
        }
        System.out.println("Binary: " + String.join("", binaryArrayList));
    }

}
