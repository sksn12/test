package day01;

public class recursive02 {
	// 1 ~ 5 까지 콘솔에 찍는 반복문코드 작성
	// 재귀로 작성하세요
	public static void main(String[] args) {
		int n  = 1;
		recursive(n);
	}

	private static void recursive(int n) {
		// basis part
		if(n>5) {
			return;
		}
		
		// login part
		System.out.print(n+" ");
		
		// inductive part
		recursive(n+1);
	}

}
