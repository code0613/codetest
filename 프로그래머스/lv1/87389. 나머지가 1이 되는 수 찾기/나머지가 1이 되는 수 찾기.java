import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 2147000000;

        List<Integer> integerList = new ArrayList<>();

        for (int i = 2; i <= n-1; i++) {
            if (n % i == 1) {
                integerList.add(i);
            }
        }

        for (int i = 0; i < integerList.size(); i++) {
            answer = Math.min(answer, integerList.get(i));
        }

        System.out.println(answer);
        return answer;
    }
}