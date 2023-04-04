package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한팰린드롬 {
	public String solution(String s) {
		String answer = "NO";
		StringBuilder sb = new StringBuilder();

		for (char x : s.toCharArray()) {
			if (Character.isAlphabetic(x))
				sb.append(x);
		}

		String str1 = sb.toString();
		String str2 = sb.reverse().toString();

		if (str1.equalsIgnoreCase(str2)) {
			return "YES";
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		String s = sb.readLine();

		유효한팰린드롬 T = new 유효한팰린드롬();
		System.out.println(T.solution(s));
	}
}
