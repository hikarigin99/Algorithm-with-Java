package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백트래킹
public class 경로탐색 {

	static int[][] graph;
	static int[] ch;
	static int n, v, count = 0;

	public void DFS(int L) {

		if (L == n) count++;
		else {
			for(int i = 1; i <= n; i++) {
				if(graph[L][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		경로탐색 T = new 경로탐색();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] splitLine = line.split(" ");
		n = Integer.parseInt(splitLine[0]);
		v = Integer.parseInt(splitLine[1]);

		graph = new int[n + 1][n + 1];
		ch = new int[n + 1];
		for (int i = 0; i < v; i++) {
			String input = br.readLine();

			String[] tmp = input.split(" ");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			graph[a][b] = 1;
		}

		ch[1] = 1;
		T.DFS(1);
		System.out.println(count);
	}
}
