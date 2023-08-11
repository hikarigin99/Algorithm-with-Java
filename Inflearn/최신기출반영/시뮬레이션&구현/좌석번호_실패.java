import java.util.Arrays;

public class 좌석번호 {
	public int[] solution(int c, int r, int k) {
		int[] answer = new int[2];

		// 좌석의 수보다 사람이 많은 경우 (k번째 자리가 없는 경우)
		if (k > c * r) {
			return new int[] {0, 0};
		}

		int[][] seat = new int[c][r];

		// 가로 c, 세로 r를 행 c, 열 r로 표현하기 위해
		// 먼저, 오른쪽으로 90도 회전시킨다.
		// 북, 동, 남, 서
		int[] dx = new int[] {-1, 0, 1, 0};
		int[] dy = new int[] {0, 1, 0, -1};

		int x = 0, y = 0;
		int cnt = 1;
		int dIdx = 1;

		while (cnt < k) {
			int nx = x + dx[dIdx];
			int ny = y + dy[dIdx];

			if (nx < 0 || nx >= c || ny < 0 || ny >= r || seat[nx][ny] > 0) {
				dIdx = (dIdx + 1) % 4;
				continue;
			}
			seat[x][y] = cnt;
			cnt++;
			x = nx;
			y = ny;
		}
		answer[0] = x + 1;
		answer[1] = y + 1;
		return answer;
	}

	public static void main(String[] args) {
		좌석번호 T = new 좌석번호();
		System.out.println(Arrays.toString(T.solution(6, 5, 12)));
		System.out.println(Arrays.toString(T.solution(6, 5, 20)));
		System.out.println(Arrays.toString(T.solution(6, 5, 30)));
		System.out.println(Arrays.toString(T.solution(6, 5, 31)));
	}
}

