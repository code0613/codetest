import java.util.Arrays;
import java.util.stream.Stream;

class Nno23 {
    public int[] solution(long n) {
        int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseUnsignedInt).toArray();
        int[] answer=new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            answer[i] = arr[arr.length-(i+1)];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

public class no23 {
    public static void main(String[] args) {
        Nno23 nno23 = new Nno23();
        nno23.solution(100000123L);
//        System.out.println(nno23.solution(10000000000L));
    }
}

