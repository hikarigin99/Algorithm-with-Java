import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 퇴사 {
    public int solution(int n, int[][] arr) {
        int maxPrice = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int price = 0;
            int start = i;

            while (start <= n) {
                price += arr[start][1];
                if((start - 1) + arr[start][0] > n) {
                    break;
                }
                start += arr[start][0];
            }
            maxPrice = Math.max(maxPrice, price);
        }
        return maxPrice;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][2];
        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        퇴사 T = new 퇴사();
        System.out.println(T.solution(n, arr));
    }
}
