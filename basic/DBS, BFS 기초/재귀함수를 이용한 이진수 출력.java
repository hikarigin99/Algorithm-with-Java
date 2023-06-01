import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀함수를이용한이진수출력 {
	public void DFS(int n) {
		if (n >= 2) {
			DFS(n / 2);
		}
		System.out.print(n % 2 + " ");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		재귀함수를이용한이진수출력 T = new 재귀함수를이용한이진수출력();
		T.DFS(n);
	}
}
