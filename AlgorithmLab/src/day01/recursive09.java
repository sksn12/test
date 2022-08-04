package day01;

import java.util.Arrays;
/*
 * 조합
 */
public class recursive09 {
	static int[] arr = {1,3,5};
	// 1,3 : 1,5 : 3,5
	// 담을배열
	static int[] sel = new int[3];
	
	public static void main(String[] args) {
		int idx  = 0;
		recursive(0,0);
	}

	private static void recursive(int idx, int k) {
		// basis part
		// 담을배열이 다차면
		if(k==2) {
			System.out.println(Arrays.toString(sel));
			return ;
		}
		// 원본배열의 인덱스 끝이면 
		if(idx==arr.length) {
			
			return;
		}
		
		
		// inductive part
		// 담는경우
		sel[k]=arr[idx];
		recursive(idx+1 , k+1);
		// 안담는 경우
		recursive(idx+1 , k);
	}

}
