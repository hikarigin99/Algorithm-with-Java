public class 경주로건설 {

    int[] x = new int[]{1, 0, -1, 0};
    int[] y = new int[]{0, -1, 0, 1};
    int[][] visited;

    public int solution(int[][] board) {
        int answer = 0;

        visited = new int[board.length][board[0].length];
        int[] pos = new int[]{0, 0};
        

        int nx = 0, ny = 0, i = 0;

        while (true) {
            nx = pos[0] + x[i];
            ny = pos[1] + y[i];

            // 벽이 아니고, 방문하지 않은 경우
            if (board[nx][ny] == 0 && visited[nx][ny] != 1) {
                pos[0] = nx;
                pos[1] = ny;
                visited[nx][ny] = 1;
            } else {
                i++;
            }
        }
        return answer;
    }
}
