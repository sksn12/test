package day01;

public class recursive07 {
	static int[] arr = {1,3,5};
	// 배열의 값을 더한값과 곱한값을 구하는 프로그램을 
	// 재귀로 작성하세요
	//static int sum = 0;
	
	public static void main(String[] args) {
		int idx  = 0;
		recursive(idx,0,1);
		
	}

	private static void recursive(int idx, int sum, int cross) {
		// basis part
		if(idx==arr.length) {
			System.out.println(sum+","+cross);
			return ;
		}
		sum += arr[idx];
		cross *= arr[idx];
		// inductive part
		recursive(idx+1 , sum, cross);
	}

}
