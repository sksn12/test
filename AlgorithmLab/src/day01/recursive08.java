package day01;

public class recursive08 {
	static int[] arr = {1,3,5};
	// 배열의 값을 더한값과 곱한값을 구하는 프로그램을 
	// 재귀로 작성하세요
	//static int sum = 0;
	
	public static void main(String[] args) {
		int idx  = 0;
		recursive(idx,1);
		
	}

	private static void recursive(int idx, int val) {
		// basis part
		if(idx==arr.length) {
			System.out.println(val);
			return ;
		}
		
		// inductive part
		recursive(idx+1 , val+arr[idx]);
		
		recursive(idx+1 , val*arr[idx]);
	}

}
