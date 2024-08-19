package src;

import java.util.Scanner;

public class Calculationpower {

	public static void main(String[] args) {

//		int base = 3, exponent =4;
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		
		long result = 1;
		
		while(exponent !=0) {
			result *= base;
			
			--exponent;
		}
		
		System.out.println(result);
		
	}

}
