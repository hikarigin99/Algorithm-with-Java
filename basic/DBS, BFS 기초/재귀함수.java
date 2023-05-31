import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀함수 {
	public void solution(int x) {
		if (x > 1) {
			solution(x - 1);
		}
		System.out.print(x + " ");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		재귀함수 T = new 재귀함수();
		T.solution(x);
	}
}
