import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가위바위보 {

	public char[] solution(int n, int[] a, int[] b) {
		char[] answer = new char[n];

		for (int i = 0; i < n; i++) {
			if (a[i] == 1) {
				if (b[i] == 1)	answer[i] = 'D';
				else if (b[i] == 2) answer[i] = 'B';
				else if (b[i] == 3) answer[i] = 'A';
			} else if (a[i] == 2) {
				if (b[i] == 1) answer[i] = 'A';
				else if (b[i] == 2) answer[i] = 'D';
				else if (b[i] == 3) answer[i] = 'B';
			} else if (a[i] == 3) {
				if (b[i] == 1) answer[i] = 'B';
				else if (b[i] == 2) answer[i] = 'A';
				else if (b[i] == 3) answer[i] = 'D';
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s1 = br.readLine().split(" ");
		String[] s2 = br.readLine().split(" ");

		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s1[i]);
			b[i] = Integer.parseInt(s2[i]);
		}

		가위바위보 T = new 가위바위보();
		for (char x : T.solution(n, a, b)) {
			System.out.println(x);
		}
	}
}
