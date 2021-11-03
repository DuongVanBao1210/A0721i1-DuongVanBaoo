package ss4_class_and_oop_in_java.bai_tap.bai2_xay_dung_lop_stopwatch;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        
        System.out.println("Thời gian bắt đầu (miliseconds): " + stopWatch.start());
        
        double[] array = new double[100000];
        int min;
        for (int i = 0; i < 100000; i++) {
            array[i] = Math.floor(Math.random() * 99);
        }
        
        for (int j = 0; j < 99999; j++) {
            min = j;
            for (int k = j + 1; k < 100000; k++) {
                if (array[k] < array[min]) {
                    min = k;
                }
                if (k == 99999) {
                    double temp = array[min];
                    array[min] = array[j];
                    array[j] = temp;
                }
            }

        }
     
        System.out.println("Thời gian kết thúc (miliseconds): " + stopWatch.stop());
        System.out.println("Thời gian thực thi chương trình (miliseconds): " + stopWatch.getElapsedTime());
    }

}


