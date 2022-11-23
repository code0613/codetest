import java.time.LocalDate;
import java.util.*;
class Nno31 {
    public int[] solution(int []arr) {

        int[] answer = {};
        int temp = 0;
        List<Integer> list = new ArrayList<>(); //리스트 선언

        for (int i = 0; i < arr.length; i++) { 
            if (temp == arr[i]){
            }else {
                temp = arr[i];
                list.add(arr[i]);
            }
        }
       answer = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
public class no31 {
    public static void main(String[] args) {
    Nno31 nno31 = new Nno31();
    int[] arr1 = {1,1,3,3,0,1,1};
    nno31.solution(arr1);
    }
}
