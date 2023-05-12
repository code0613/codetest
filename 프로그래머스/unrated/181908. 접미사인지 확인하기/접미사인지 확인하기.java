import java.util.Arrays;
import java.util.Objects;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        String[] strings = new String[100];
        int cnt = 0;

        for (int i = my_string.length(); i > 0; i--) {

                strings[cnt] = my_string.substring(i, my_string.length());
                cnt++;

        }
        strings = Arrays.stream(strings)
                .distinct()
                .filter(Objects::nonNull)
                .toArray(String[]::new);

        strings[0] = my_string;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(is_suffix)) {
                answer = 1;
                break;
            }
        }


        return answer;
    }
}