
import java.util.stream.*;



class Nno26 {
    public int[] solution(int[] arr) {

        int count = 0;
            int index = 0;
        int[] answer;
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr.length;j++){
                if (arr[i] > arr[j]){
                    count++;
                }
            }
            if (count==0){
                index = i;
            }
            count= 0;
        }
        arr = remove(arr, index);
       if (arr.length == 0){
           answer = new int[1];
           answer[0] = -1;
       }else{
           answer = arr;
       }
        return answer;
    }

    public static int[] remove(int[] a, int index)
    {
        if (a == null || index < 0 || index >= a.length) {
            return a;
        }

        return IntStream.range(0, a.length)
                .filter(i -> i != index)
                .map(i -> a[i])
                .toArray();
    }
}
public class no26 {
    public static void main(String[] args) {
        Nno26 nno26 = new Nno26();
        int[] arr = {4,3,2,1};

        int[] arr1 = {10};

        nno26.solution(arr1);
    }
}
