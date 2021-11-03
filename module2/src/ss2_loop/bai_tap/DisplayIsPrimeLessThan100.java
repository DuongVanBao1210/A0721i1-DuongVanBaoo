package ss2_loop.bai_tap;

public class DisplayIsPrimeLessThan100 {
	public static void main(String[] args) {
		int i = 1;
		System.out.print("Cac so nguyen to nho hon 100 la: ");
		while(i <100) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
			i++;
		}
		
	}
	public static boolean isPrime(int a) {
		if (a < 2) {
			return false;
		}
		int i =2;
		boolean check = true;
		while (i <= Math.sqrt(a)) {
			if(a % i ==0) {
				check = false;
				break;
			}
			i++;
		}
		if(check) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

}

