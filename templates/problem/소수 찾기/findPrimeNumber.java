class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arrint = new int[n + 1];
        arrint[0] = 0;
        arrint[1] = 0;

        for(int i = 2; i <=n; i++) {
            arrint[i] = i;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 2 * i; j <= n; j += i) {
                arrint[j] = 0;
            }
        }
        for(int i = 0; i < arrint.length; i++)
            if (arrint[i] != 0) {
                answer++;
            }
        return answer;
    }
}