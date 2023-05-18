import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cardQueue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardQueue2 = new LinkedList<>(Arrays.asList(cards2));

        int cnt = 0;
        for (int i = 0; i < goal.length; i++) {
            String str1 = cardQueue1.peek();
            String str2 = cardQueue2.peek();

            if (goal[i].equals(str1)) {
                cnt++;
                cardQueue1.poll();
            }else if(goal[i].equals(str2)) {
                cnt++;
                cardQueue2.poll();
            } else {
                return "No";
            }
        }
        if (cnt == goal.length) {
            return "Yes";
        }else return "No";
    }
}