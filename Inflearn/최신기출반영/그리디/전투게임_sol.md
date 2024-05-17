# 전투 게임

### 직접 푼 코드
- 실행 결과는 올바르게 나오지만 `효율성 테스트`에서 통과하지 못했다.
- 내가 푼 형식은 O(n^2) 방식으로 효율성 테스트에 통과하기 위해서는 **O(n)** 혹은 **O(nlogn)** 으로 풀어야한다.
- 즉, 이중 for문 방식을 사용하면 안되고 **for문 1번 반복** 혹은 **정렬** 방식을 사용해야한다.
```java
public class 전투게임 {

    public int[] solution(String[] students) {
        int size = students.length;
        int[] answer = new int[size];

        String[] team = new String[size];
        int[] power = new int[size];
        for(int i = 0; i < size; i++) {
            String[] s = students[i].split(" ");
            team[i] = s[0];
            power[i] = Integer.parseInt(s[1]);
        }

        for (int i = 0; i < size; i++) {
            int currentPower = 0;
            for (int j = 0; j < size; j++) {
                if (i == j) continue;
                if (!team[i].equals(team[j]) && power[i] > power[j]) {
                    currentPower += power[j];
                }
            }
            answer[i] = currentPower;
        }
        return answer;
    }
}
```

### 참고 코드
- answer를 현재 인덱스 순서대로 대입하기 위해서 Info 클래스를 생성하여 **인덱스 값**, 팀 이름, 공격력을 저장한다.
- 아래 코드는 이중 for문을 사용한 것으로 보이지만 1번만 반복한다.
- HashMap을 이용하여 같은 팀인 경우 total에서 같은 팀의 공격력을 뺀다.
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Info implements Comparable<Info> {
    public int idx;
    public Character team;
    public int power;

    Info(int idx, Character team, int power) {
        this.idx = idx;
        this.team = team;
        this.power = power;
    }

    @Override
    public int compareTo(Info o) {
        return this.power - o.power;
    }
}

public class Main {
    public int[] solution(String[] students) {
        int n = students.length;
        int[] answer = new int[n];
        ArrayList<Info> infos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Character a = students[i].split(" ")[0].charAt(0);
            int b = Integer.parseInt(students[i].split(" ")[1]);
            infos.add(new Info(i, a, b));
        }

        // power 오름차순으로 정렬
        Collections.sort(infos);
        HashMap<Character, Integer> Tp = new HashMap<>();

        int j = 0, total = 0;
       for(int i = 1; i < n; i++) { // 0번째 인덱스는 이길 수 있는 사람없으므로 1부터 반복
           for (; j < n; j++) {
               if(infos.get(j).power < infos.get(i).power) {
                   total += infos.get(j).power;
                   Character x = infos.get(j).team;
                   Tp.put(x, Tp.getOrDefault(x, 0) + infos.get(j).power);
               }
               else break;
           }
           answer[infos.get(i).idx] = total - Tp.getOrDefault(infos.get(i).team, 0);
       }
        return answer;
    }
}
```
