package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dal {
	static int T, N;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("달팽이숫자.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();

			int[][] map = new int[N][N];
			int r = 0, c = 0;
			map[r][c] = 1;
			int cnt = 2;
			while (cnt <= N * N) {
				for (int d = 0; d < 4; d++) {
					while (true) {
						r = r + dr[d];
						c = c + dc[d];
						// 갈수없다면
						if (r < 0 || r >= N || c < 0 || c >= N || map[r][c] != 0) {
							r = r - dr[d];
							c = c - dc[d];
							break;
						}
						map[r][c] = cnt++;
					}
				}
			}
			print(map);
		}
	}

	private static void print(int[][] map) {
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map.length; c++) {
				System.out.print(map[r][c] + " ");
			}
			System.out.println();
		}
	}
}
