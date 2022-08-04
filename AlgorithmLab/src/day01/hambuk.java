package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class hambuk {
	static int T,N, max = 0;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("햄버거다이어트.txt"));
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			max=0;
			N=sc.nextInt();
			int limit = sc.nextInt();
			int[] jumsu = new int[N];
			int[] calorie = new int[N];
			for (int i = 0; i < N; i++) {
				jumsu[i]=sc.nextInt();
				calorie[i]=sc.nextInt();
			}
//			System.out.println(Arrays.toString(jumsu));
//			System.out.println(Arrays.toString(calorie));
			
			recursive(jumsu,calorie,0,0,0,limit);
			System.out.printf("#%d %d\n",tc,max);
		}

	}
	private static void recursive(int[] jumsu, int[] calorie, int idx, int jSum, int cSum, int limit) {
		// basis part
		if(cSum > limit) {
			return;
		}
		if(idx > N) {
			return;
		}
		// 모든 재료의 탐색이 끝났으면
		if(idx == N) {
			//System.out.println(cSum +","+jSum);
			max = Math.max(max, jSum);
			return;
		}
		
		
		// inductive part + login part
		// 재료를 담는 경우
		recursive(jumsu, calorie, idx+1, jSum+jumsu[idx], cSum+calorie[idx], limit);
		
		// 재료를 안담는 경우
		recursive(jumsu, calorie, idx+1, jSum, cSum, limit);
	}

}
