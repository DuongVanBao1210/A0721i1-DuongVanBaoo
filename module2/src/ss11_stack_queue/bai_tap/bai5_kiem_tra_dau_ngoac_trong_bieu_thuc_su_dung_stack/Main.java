package ss11_stack_queue.bai_tap.bai5_kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> bStack = new Stack<>();
        String expressionString = "s*(a+1)*()a-2)*(c-3)";
        String[] expressionArray = expressionString.split("");
        boolean check = true;
        for (int i = 0; i < expressionArray.length; i++) {
            if (expressionArray[i].equals("(")) {
                bStack.push(expressionArray[i]);
            } else if (expressionArray[i].equals(")")) {
                if (bStack.isEmpty()) {
                    check = false;
                    break;
                } else if (expressionArray[i - 1].equals("(")) {   //kiểm tra xem giữa 2 ngoặc có biểu thức hay không
                    check = false;
                    break;
                }
                bStack.pop();
            }
        }
        if (!bStack.isEmpty()) {
            check = false;
        }
        System.out.println(check);
	}

}
