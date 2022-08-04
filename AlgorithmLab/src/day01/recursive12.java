package day01;

import java.util.Arrays;

/*
 * 조합
 */
public class recursive12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5};
		// 1,3 : 1,5 : 3,5
		// 담을배열
		int[] sel = new int[3];
		
		recursive(arr,sel,0,0);
	}

	private static void recursive(int[] arr, int[] sel, int idx, int k) {
		if(k==sel.length) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		
		for (int i = idx; i < arr.length; i++) {
			sel[k] =arr[i];
			recursive(arr, sel, i+1, k+1);
		}
	}

}
