package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Up to what number do you want primes for?");
		int n = in.nextInt();
		
		int[] array = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			array[i] = i + 1;
			array[0] = 0;
		}
		
		int q;
		for(i=2; i < 30; i++) {
			for (q= i*2-1; q < n; q += i) {
				array[q] = 0;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
}
