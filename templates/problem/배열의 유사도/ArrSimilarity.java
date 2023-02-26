class Solution {
     public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String match : s1) {
            for (String dic : s2) {
                if (match.equals(dic)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}