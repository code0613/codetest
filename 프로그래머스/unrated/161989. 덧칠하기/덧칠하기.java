class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = section[0] - 1;
        for (int i = 0; i < section.length; i++) {
            if (paint < section[i]) {
                paint = section[i] + m - 1;
                answer += 1;
            }
        }
        return answer;
    }
}