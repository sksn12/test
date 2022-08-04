package day01;

public class recursive03 {
	static int[] arr = {1,3,5};
	// 배열의 값을 콘솔에 찍는 프로그램을 
	// 재귀로 작성하세요
	public static void main(String[] args) {
		int idx  = 0;
		recursive(idx);
	}

	private static void recursive(int idx) {
		// basis part
		if(idx==arr.length) {
			return;
		}
		
		// login part
		System.out.print(arr[idx]+" ");
		
		// inductive part
		recursive(idx+1);
	}

}
