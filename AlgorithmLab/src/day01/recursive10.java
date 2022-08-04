package day01;

import java.util.Arrays;

/*
 * 중복순열
 */
public class recursive10 {
	// 원본배열
	static int[] arr = { 1, 3, 5 };
	// 담을배열
	static int[] sel = new int[arr.length];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		recursive( 0);
		System.out.println(cnt);
	}

	static int cnt = 0;

	private static void recursive( int idx) {
		// basis part
		if (idx == sel.length) {
			cnt++;
			// 다뽑았어요
			System.out.println(Arrays.toString(sel));
			return;
		}

		// inductive part
		for (int i = 0; i < arr.length; i++) {
			sel[idx] = arr[i];
			recursive(idx + 1);
		}

//		sel[idx]=arr[0];
//		recursive(arr, sel, idx+1);
//		
//		sel[idx]=arr[1];
//		recursive(arr, sel, idx+1);
//		
//		sel[idx]=arr[2];
//		recursive(arr, sel, idx+1);

	}

}
