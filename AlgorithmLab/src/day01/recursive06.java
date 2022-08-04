package day01;

public class recursive06 {
	static int[] arr = {1,3,5};
	// 배열의 값을 더하는 프로그램을 
	// 재귀로 작성하세요
	//static int sum = 0;
	
	public static void main(String[] args) {
		int idx  = 0;
		System.out.println(recursive(idx));
		//System.out.print(sum+" ");
	}

	private static int recursive(int idx) {
		// basis part
		if(idx==arr.length) {
			return 0;
		}
		
		// inductive part
		return recursive(idx+1) + arr[idx];
	}

}
