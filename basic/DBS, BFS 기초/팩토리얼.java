import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼 {
	public int DFS(int n) {
		if(n == 1) return 1;
		else {
			return n * DFS(n - 1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		팩토리얼 T = new 팩토리얼();
		System.out.println(T.DFS(n));
	}
}
