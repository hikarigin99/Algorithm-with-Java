public class Main {

    public void dfs(int n) {

        if (n == 0) return;
        else {
            dfs(n - 1);
            System.out.print(n + " ");
        }
    }

    public void solution(int n) {
        dfs(n);
    }
    public static void main(String[] args) {
        Main T = new Main();
        T.solution(30);
    }
}
