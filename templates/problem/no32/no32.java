import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
class Nno32 {
    public Integer[] solution(int[] numbers) {
        Integer[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
//                list.add(numbers[i]+numbers[j]); //이것도...
                set.add(numbers[i]+numbers[j]);
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//            set.add(list.get(i)); //필요없음...
//        }
        answer = set.toArray(new Integer[0]);

        Arrays.sort(answer);

        return answer;
    }
}
public class no32 {
    public static void main(String[] args) {
        Nno32 nno32 = new Nno32();
        int[] arr1 = {2,1,3,4,1};
        int[] arr2 = {0,100,1000,10};
        nno32.solution(arr2);
    }
}
