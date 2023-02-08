import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i*i <= (int) Math.sqrt(number); i++) {
            int cnt = 0;
            for (int j = 1; j <= number; j++) {
                if ((i % j) == 0){
                    cnt++;
                }
            }
            if (cnt > limit){
                numList.add(power);
            }else {
                numList.add(cnt);
            }
        }

        for (int i = 0; i < numList.size(); i++) {
            answer += numList.get(i);
        }

        System.out.println(numList);
        System.out.println(answer);
        return answer;
    }
}