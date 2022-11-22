import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

class Nno28 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int[] arr = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseUnsignedInt).toArray();

        for (int i =0; i < arr.length;i++){
            sum += arr[i];
        }
        if(x % sum == 1 || x % sum > 1){
            answer = false;
        }else{
            answer = true;
        }
        return answer;
    }
}
public class no28 {
    public static void main(String[] args) {
        Nno28 nno28 = new Nno28();
        nno28.solution(6548);
    }
}
