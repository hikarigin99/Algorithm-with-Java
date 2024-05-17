# 꽃이 피는 최단시간

### 직접 푼 코드
- 너무 꼬아서 생각한 문제, 심플하게 해결할 수 있도록 고민할 것
```java
import java.util.Arrays;

public class 꽃이피는최단시간 {
    public int solution(int[] plantTime, int[] growTime) {

        int[][] result = new int[plantTime.length][2];

        for (int i = 0; i < plantTime.length; i++) {
            result[i][0] = plantTime[i];
            result[i][1] = growTime[i];
        }
        // result 오름차순 정렬
        Arrays.sort(result, (a, b) -> a[0] - b[0]);

        int start = result[0][0];
        int end = start + result[0][1];
        result[0][0] = 0;
        result[0][1] = 0;

        // result 2번째 인덱스 기준 내림차순 정렬
        Arrays.sort(result, (o1, o2) -> o2[1] - o1[1]);

        for (int i = 0; i < result.length - 1; i++) {
            start += result[i][0];
            end = Math.max(end, start + result[i][1]);
        }
        return end;
    }
}
```

### 참고 코드
```java
public class 꽃이피는최단시간_sol {
    public int solution(int[] plantTime, int[] growTime) {

        int size = plantTime.length;
        int[][] result = new int[size][2];

        for (int i = 0; i < size; i++) {
            result[i][0] = plantTime[i];
            result[i][1] = growTime[i];
        }

        // result 2번째 인덱스 기준 내림차순 정렬
        Arrays.sort(result, (o1, o2) -> o2[1] - o1[1]);

        int start = 0, end = 0;
        for (int i = 0; i < size; i++) {
            start += result[i][0];
            end = Math.max(end, start + result[i][1]);
        }
        return end;
    }
}
```
