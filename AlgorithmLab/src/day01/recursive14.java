package day01;

import java.util.Arrays;
/*
 * 파워셋
 */
public class recursive14 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5 };
		recursive(arr, new boolean[arr.length], 0, 0);
	}
	private static void recursive(int[] arr, boolean[] sel, int idx, int k) {
		if (idx == arr.length) {
			// 다골랐어요
			//if (k == 3) {
				for (int i = 0; i < sel.length; i++) {
					if (sel[i]) {
						System.out.print(arr[i] + " ");
					}
				}
				System.out.println();
			//}
			return;
		}
		// 담았어요
		sel[idx] = true;
		recursive(arr, sel, idx + 1, k + 1);
		// 안담았어요
		sel[idx] = false;
		recursive(arr, sel, idx + 1, k);
	}

}
