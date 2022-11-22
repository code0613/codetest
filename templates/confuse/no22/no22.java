import java.util.*;
import java.util.stream.Stream;


class Nno22 {
    public int solution(int n) {
        int answer = 0;
        String span;
        span = Integer.toString(n);
        int[] digits = Stream.of(span.split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < digits.length;i++){
            answer += digits[i];
        }

        return answer;
    }
}

public class no22 {
    public static void main(String[] args) {
        Nno22 nno22 = new Nno22();
        System.out.println(nno22.solution(3873543));
    }
}
