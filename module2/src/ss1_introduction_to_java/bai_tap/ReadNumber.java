package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter a number: ");
		number = scanner.nextInt();
		int donvi,chuc,tram;
		tram = number/100;
		chuc = (number - tram*100)/10;
		donvi = number%10;
		String hangTram = null,hangChuc = null,hangDonVi = null;
		switch (tram) {
		case 0:
			hangTram = "";
			break;
		case 1:
			hangTram = "one hundred";
			break;
		case 2:
			hangTram = "two hundred";
			break;
		case 3:
			hangTram = "three hundred";
			break;
		case 4:
			hangTram = "four hundred";
			break;
		case 5:
			hangTram = "five hundred";
			break;
		case 6:
			hangTram = "six hundred";
			break;
		case 7:
			hangTram = "seven hundred";
			break;
		case 8:
			hangTram = "eight hundred";
			break;
		case 9:
			hangTram = "nine hundred";
			break;
		}
		switch (chuc) {
		case 0:
			hangChuc = "";
			break;
		case 1:
			switch (donvi) {
			case 0:
				hangChuc = "ten";
				break;
			case 1:
				hangChuc = "eleven";
				break;
			case 2:
				hangChuc = "twelve";
				break;
			case 3:
				hangChuc = "thirteen";
				break;
			case 4:
				hangChuc = "fourteen";
				break;	
			}
			break;
		case 2:
			hangChuc = "twenty";
			break;
		case 3:
			hangChuc = "thirty";
			break;
		case 4:
			hangChuc = "fourty";
			break;
		case 5:
			hangChuc = "fifty";
			break;
		case 6:
			hangChuc = "sixty";
			break;
		case 7:
			hangChuc = "seventy";
			break;
		case 8:
			hangChuc = "eighty";
			break;
		case 9:
			hangChuc = "ninety";
			break;
		}
		switch (donvi) {
		case 0:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "zero";
			}
			break;
		case 1:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "one";
			}
			break;
		case 2:
			hangDonVi = "two";
			break;
		case 3:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "three";
			}
			break;
		case 4:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "four";
			}
			break;
		case 5:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "five";
			}
			break;
		case 6:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "six";
			}
			break;
		case 7:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "seven";
			}
			break;
		case 8:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "eight";
			}
			break;
		case 9:
			if(chuc == 1) {
				hangDonVi = "";
			}
			else {
			hangDonVi = "nine";
			}
			break;
		}
		System.out.printf("%d duoc doc la: %s %s %s",number,hangTram,hangChuc,hangDonVi);
	}

}
