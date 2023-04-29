import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            answer += d[i];
            cnt++;
            if (answer > budget) {
                answer -= d[i];
                cnt--;
                break;
            }
        }
        return cnt;
    }
}