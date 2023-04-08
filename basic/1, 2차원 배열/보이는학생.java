import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 보이는학생 {

	public int solution(int n, int[] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] s = br.readLine().split(" ");

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		보이는학생 T = new 보이는학생();
		System.out.println(T.solution(n, arr));
	}
}
