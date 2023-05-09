class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        int[] answer = new int[str.length];

        answer[0] = -1;

        for (int i = 1; i < str.length; i++) {
            boolean match = false;
            for (int j = i; j >= 0; j--) {
                if (i != j) {
                    if (str[i].equals(str[j])) {
                        answer[i] = i-j;
                        match = true;
                        break;
                    }
                }
            }
            if (!match) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}