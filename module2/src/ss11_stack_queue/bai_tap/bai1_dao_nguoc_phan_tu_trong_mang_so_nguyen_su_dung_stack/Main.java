package ss11_stack_queue.bai_tap.bai1_dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> wordStack=new Stack<>();
        String string="Dương Văn Bảo";
        String[] arrayString = string.split("");
        ArrayList<String> reverseWord=new ArrayList<>();
       for (String word:arrayString){
           wordStack.push(word);
       }
       while (!wordStack.isEmpty()){
           reverseWord.add(wordStack.pop());
       }
        System.out.println(String.join("",reverseWord));
    
	}

}
