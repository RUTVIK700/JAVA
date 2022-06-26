
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static boolean check(int N, int[] arr) {

		int b = Arrays.binarySearch(arr, N);
		boolean r = b > 0 ? true : false;
		return r;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		int arr[] = { 2, 3, 4, 5 };
		int ar1[] = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		if (N % 2 != 0) {
			System.out.println("Weird");
		} else {
			boolean r = check(N, arr);
			boolean y = check(N, ar1);
			if (r & N < 20) {
				System.out.println("Not Weird");
			} if (y  & N <=20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		}
	}
}
