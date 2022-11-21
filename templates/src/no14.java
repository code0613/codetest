//import java.util.Arrays;
import java.util.*;

class Nno14 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer ={0};
        int count = 0;

        for (int i = 0; i < arr.length;i++){
            if (arr[i] % divisor == 0){
                count++;
            }
        }
        if (count == 0){
            answer[0] = -1;
            return answer;
        }

        answer = new int[count];

        for (int j=0;j<arr.length;j++){
            if (arr[j] % divisor ==0){
                answer[count-1] = arr[j];
                count--;
            }
            if (count == 0){
                break;
            }
        }



        Arrays.sort(answer); //배열을 정렬
        System.out.println(Arrays.toString(answer)); //배열 형식으로 출력


        return answer;
    }
}
public class no14 {
    public static void main(String[] args) {

        int[] arr1={5,9,7,10};
        int[] arr2={2,36,1,3};
        int[] arr3={3,2,6};


        Nno14 nno14 = new Nno14();
        nno14.solution(arr1,5);
    }

}
