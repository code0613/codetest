class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pNum = Long.valueOf(p);

        for (int i = 0; i < t.length()-p.length()+1; i++) {
            Long tNum = Long.valueOf(t.substring(i,i+p.length()));
            if (pNum >= tNum) {
                answer++;
            }
        }

        return answer;
    }
}