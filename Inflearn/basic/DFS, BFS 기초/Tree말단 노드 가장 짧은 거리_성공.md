# Tree 말단 노드 가장 짧은 거리구하기
### 직접 푼 코드
```
public class Tree말단노드가장짧은거리 {

    Node root;

    public int bfs(Node root) {
        int answer = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node x = q.poll();
                if (x.lt == null && x.rt == null) {
                    return L;
                } else {
                    if (x.lt != null) q.offer(x.lt);
                    if (x.rt != null) q.offer(x.rt);
                }
            }
            L++;
        }
        return answer;
    }
}
```
