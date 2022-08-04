package day01;

public class recursive04 {
	static int[] arr = {1,3,5};
	// 배열의 값을 더하는 프로그램을 
	// 재귀로 작성하세요
	//static int sum = 0;
	
	public static void main(String[] args) {
		int idx  = 0;
		recursive(idx, 0);
		//System.out.print(sum+" ");
	}

	private static void recursive(int idx, int sum) {
		// basis part
		if(idx==arr.length) {
			System.out.println(sum);
			return;
		}
		
		// login part
		sum+=arr[idx];
		
		
		// inductive part
		recursive(idx+1, sum);
	}

}
