class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cnt = 0;

        while (n != 0){
            cnt = n % a;
            n = n / a;
            answer += n*b;
            n = n*b + cnt;
            if (n < a){
                break;
            }
        }
        return answer;
    }
}