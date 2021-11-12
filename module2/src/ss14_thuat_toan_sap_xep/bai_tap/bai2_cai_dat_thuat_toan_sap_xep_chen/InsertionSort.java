package ss14_thuat_toan_sap_xep.bai_tap.bai2_cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
	
    static int[] list = {3,31,5,19,4,6,12,15,51,2};
    public static void insertionSort(int []list){
        for (int i=1;i<list.length;i++){
            int x=list[i];
            int pos=i;
            while (pos>0&&x<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;

            }
            list[pos]=x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int element: list){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
