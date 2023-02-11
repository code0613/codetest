class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0;


        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                if ((i % j) == 0){
                    cnt++;
                    if (i != 1 && i / j != j) {
                        cnt ++;
                    }
                }
            }
            answer += cnt > limit ? power : cnt;
            cnt=0;
        }
        System.out.println(answer);
        return answer;
    }
}