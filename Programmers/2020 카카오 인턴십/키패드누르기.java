class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftIdx = 10, rightIdx = 12;
        for (int number : numbers) {
            if(number == 1 || number == 4 || number == 7)   {
                answer += "L";
                leftIdx = number;
            }
            else if(number == 3 || number == 6 || number == 9)  {
                answer += "R";
                rightIdx = number;
            }
            else {
                if(number == 0) number = 11;
                int leftDist = Math.abs(number - leftIdx) / 3 + Math.abs(number - leftIdx) % 3;
                int rightDist = Math.abs(number - rightIdx) / 3 + Math.abs(number - rightIdx) % 3;

                if(leftDist < rightDist) {
                    answer += "L";
                    leftIdx = number;
                } else if(leftDist > rightDist) {
                    answer += "R";
                    rightIdx = number;
                } else {
                    if(hand.equals("left")) {
                        answer += "L";
                        leftIdx = number;
                    } else {
                        answer += "R";
                        rightIdx = number;
                    }
                }
            }
        }
        return answer;
    }
}
