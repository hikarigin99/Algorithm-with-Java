import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 큰수출력하기 {

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);

		for (int i = 1; i < n; i++) {
			if (arr[i - 1] < arr[i]) {
				answer.add(arr[i]);
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

		큰수출력하기 T = new 큰수출력하기();
		for (Integer x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
