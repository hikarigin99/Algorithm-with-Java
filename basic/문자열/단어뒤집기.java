import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어뒤집기 {

	public String[] solution(String[] arr, int n) {
		String[] answer = new String[n];

		for (int i = 0; i < arr.length; i++) {
			String tmp = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				tmp += arr[i].charAt(j);
			}
			answer[i] = tmp;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		단어뒤집기 T = new 단어뒤집기();
		for (String x : T.solution(arr, n)) {
			System.out.println(x);
		}
	}
}
