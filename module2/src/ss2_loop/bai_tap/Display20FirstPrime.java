package ss2_loop.bai_tap;

public class Display20FirstPrime {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		System.out.print("20 so nguyen to dau tien la: ");
		while(count <20) {
			if(isPrime(i)) {
				count++;
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
