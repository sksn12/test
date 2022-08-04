package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class locationsum1 {
	static int T, N, M,  max = 0;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("구간합구하기4.txt"));
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		int[] arr = new int[N+1];
		
		
		for (int i = 1; i <= N; i++) {
			arr[i]=arr[i-1]+sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(arr[b]-arr[a-1]);
		}
		
		//System.out.println(Arrays.toString(arr));
		// 시간초과
//		for (int i = 0; i < M; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int sum = 0;
//			for (int j = a; j <= b; j++) {
//				sum += arr[j];
//			}
//			System.out.println(sum);
//		}
		
	}

}



