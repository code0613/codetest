import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
   public int[] solution(String[] keymap, String[] targets) {
         int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {

            String str = keymap[i];
            for (int j = 0; j < str.length(); j++) {

                char c = str.charAt(j);
                int index = str.indexOf(c) + 1;

                if (map.containsKey(c)) {
                    if (map.get(c) > index);
                    map.put(c, index);
                } else {
                    map.put(c, index);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {

            String str = targets[i];
            for (int j = 0; j < str.length(); j++) {

                char c = str.charAt(j);

                if (map.containsKey(c)) {
                    answer[i] += map.get(c);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}