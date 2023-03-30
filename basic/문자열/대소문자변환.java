import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자변환 {

	public String solution(String s) {
		String answer = "";

		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				answer += Character.toUpperCase(c);
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		대소문자변환 T = new 대소문자변환();
		System.out.println(T.solution(s));
	}
}
