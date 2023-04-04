package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가장짧은문자거리_실패 {

	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];

		int pos = 1000;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				pos = 0;
				answer[i] = 0;
			} else {
				pos++;
				answer[i] = pos;
			}
		}

		pos = 1000;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == t) {
				pos = 0;
			} else {
				pos++;
				answer[i] = Math.min(answer[i], pos);
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		가장짧은문자거리_실패 T = new 가장짧은문자거리_실패();
		for (Integer x : T.solution(input[0], input[1].charAt(0))) {
			System.out.print(x + " ");
		}
	}
}
