import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character,Integer> map = new HashMap<>();

        for(String key : keymap){

            for(int i = 0; i < key.length(); i++){

                char c = key.charAt(i);

                int index = map.getOrDefault(c,i+1);

                map.put(c,Math.min(index, i+1));
            }
        }

        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                char c = targets[i].charAt(j);

                if(map.containsKey(c)){
                    answer[i] += map.get(c);
                }else{
                    answer[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}