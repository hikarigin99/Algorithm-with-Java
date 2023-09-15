package 시뮬레이션_구현;

/* 선형 탐색 문제 */

class 비밀번호 {
	public int solution(int[] keypad, String password) {
		int answer = 0;

		// 12시를 기준으로 시계방향으로 회전
		int[] dx = new int[] {-1, -1, 0, 1, 1, 1, 0, -1}; // 행
		int[] dy = new int[] {0, 1, 1, 1, 0, -1, -1, -1}; // 열

		int[][] board = new int[3][3];

		int index = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = keypad[index++];
			}
		}

		int[][] dist = new int[10][10];
		for (int i = 0; i < dist.length; i++) {
			for (int j = 0; j < dist.length; j++) {
				if (i == j) dist[i][j] = 0;
				else dist[i][j] = 2;
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				int from = board[i][j];
				for (int k = 0; k < dx.length; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];

					if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length) {
						int to = board[nx][ny];
						dist[from][to] = 1;
					}
				}
			}
		}

		for (int i = 0; i < password.length() - 1; i++) {
			int from = Character.getNumericValue(password.charAt(i));
			int to = Character.getNumericValue(password.charAt(i + 1));

			answer += dist[from][to];
		}
		return answer;
	}

	public static void main(String[] args) {
		비밀번호 T = new 비밀번호();
		System.out.println(T.solution(new int[] {2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));
		System.out.println(T.solution(new int[] {1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(T.solution(new int[] {2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(T.solution(new int[] {1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}
}
