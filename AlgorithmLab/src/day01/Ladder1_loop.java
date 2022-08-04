package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ladder1_loop {
	static int N;
	static int[] dr = { 0, 0, -1 }; // 왼오위
	static int[] dc = { -1, 1, 0 };

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("Ladder1.txt"));
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {

			N = sc.nextInt();
			int[][] map = new int[100][100];

			int Sr = 0, Sc = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = sc.nextInt();
					if (map[i][j] == 2) {
						Sr = i;
						Sc = j;
					}
				}
			}
			int d = 2;
			while (Sr != 0) { // 출발점에 도작할때까지 반복
				// 경계선안에 있고 왼쪽으로 갈수있고 오른쪽으로 가고 있는게 아니라면(되돌아가는거 방지)
				if (Sc - 1 >= 0 && map[Sr][Sc - 1] > 0 && d != 1) {
					d = 0;
				}
				// 경계선안에 있고 오른쪽으로 갈수있고 왼쪽으로 가고 있는게 아니라면(되돌아가는거 방지)
				if (Sc + 1 < 100 && map[Sr][Sc + 1] > 0 && d != 0) {
					d = 1;
				}

				int nr = Sr + dr[d];
				int nc = Sc + dc[d];
				// 경계선 밖이거나 갈수 없다면
				if (nr < 0 || nr >= 100 || nc < 0 || nc >= 100 || map[nr][nc] == 0) {
					nr -= dr[d];
					nc -= dc[d];
					// 위로 가자~~~~~~`
					d = 2;
					nr = Sr + dr[d];
					nc = Sc + dc[d];
				}
				Sr = nr;
				Sc = nc;
			}

			// 도착하면
			System.out.println("#"+tc+" "+Sc);
		}
	}

}
