package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문문자열 {

	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase();

		StringBuilder sb = new StringBuilder();
		String reverse = sb.append(s).reverse().toString();

		if (reverse.equals(s)) {
			answer = "YES";
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		회문문자열 T = new 회문문자열();
		System.out.println(T.solution(s));
	}
}
