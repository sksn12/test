package day01;

import java.util.Arrays;

/*
 * 순열
 */
public class recursive11 {
	static boolean[] visited = new boolean[3];
	public static void main(String[] args) {
		// 원본배열
		int[] arr = { 1, 3, 5 };
		// 담을배열
		int[] sel = new int[2];
		// 뽑음여부 판단 배열
		
		recursive(arr, sel, 0);
	}

	private static void recursive(int[] arr, int[] sel, int idx) {
		if (idx == sel.length) {
			System.out.println(Arrays.toString(sel));
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				sel[idx] = arr[i];
				recursive(arr, sel, idx + 1);
				visited[i] = false;
			}
		}
	}

}
