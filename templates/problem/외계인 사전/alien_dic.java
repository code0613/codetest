class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i = 0; i < dic.length; i++) {
            int cnt = 0;
            for (int j = 0; j < spell.length; j++) {
                int num = 0;
                for (int k = 0; k < dic[i].length(); k++) {
                    if (spell[j].charAt(0) == dic[i].charAt(k)) {
                        num++;
                    }
                }
                if (num == 1){
                    cnt++;
                }
                if (cnt == spell.length) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
 }
}