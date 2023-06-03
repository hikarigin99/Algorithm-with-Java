import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_재귀 {
	public int DFS(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return DFS(n - 2) + DFS(n - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		피보나치_재귀 T = new 피보나치_재귀();
		System.out.println(T.DFS(n));
	}
}
