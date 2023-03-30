import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자찾기 {

	public int Solution(String str, char c) {
		int answer = 0;

		String line = str.toUpperCase();
		char x = Character.toUpperCase(c);

		for (char s : line.toCharArray()) {
			if(x == s) answer++;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = br.readLine().charAt(0);

		문자찾기 T = new 문자찾기();
		System.out.println(T.Solution(str, c));
	}
}
