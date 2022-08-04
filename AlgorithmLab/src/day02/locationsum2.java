package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class locationsum2 {
	static int T, N, M, max = 0;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("구간합구하기5.txt"));
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		
		int[][] arr = new int[N+1][N+1];
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				int num = sc.nextInt();
				arr[i][j]= arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1] + num;
			}
		}
		
		//print(arr);
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			System.out.println(arr[c][d]-arr[a-1][d]-arr[c][b-1]+arr[a-1][b-1]);
		}
	}

	private static void print(int[][] arr) {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
