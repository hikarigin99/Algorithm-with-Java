import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문장속단어 {

	public String solution(String s) {
		String answer = "";

		String[] arr = s.split(" ");
		int maxSize = 0;
		for (String str : arr) {
			if(str.length() > maxSize) {
				maxSize = str.length();
				answer = str;
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		문장속단어 T = new 문장속단어();
		System.out.println(T.solution(T.solution(s)));
	}
}
