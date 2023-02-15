import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

class Nno24 {
    public long solution(long n) {
        long answer = 0;
        String result = "";
        int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

        Integer[] Intarr = Arrays.stream(arr).boxed().toArray(Integer[]::new); //int[] 를 integer[]를 변환

        Arrays.sort(Intarr, Collections.reverseOrder());

        arr = Arrays.stream(Intarr).mapToInt(i -> i).toArray(); //Integer를 int로 변환

        for (int i = 0; i < arr.length;i++){
            result += arr[i];
        }
        answer = Long.parseLong(result);
        return answer;
    }
}
public class no24 {
    public static void main(String[] args) {
        Nno24 nno24 = new Nno24();
        nno24.solution(7987654321L );
    }
}
