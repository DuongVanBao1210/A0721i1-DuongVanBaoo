package ss11_stack_queue.bai_tap.bai4_kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();
        String string = "asdffdsa";
        String[] arrayString = string.split("");
        for (String word : arrayString) {
            stringQueue.add(word.toLowerCase());
            stringStack.push(word.toLowerCase());
        }
        boolean check = true;
        while (!stringStack.isEmpty()) {
            if (!stringQueue.remove().equals(stringStack.pop())) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(string + " : Is the palindrome");
        } else {
            System.out.println(string + " : Is not the palindrome");
        }
	}

}
