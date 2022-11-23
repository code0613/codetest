import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public String solution(String s) {
        String answer = "";
        int[] arr = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("arr : "+Arrays.toString(arr));
        List<Integer> nPrarr = new ArrayList<>(); //비소수를 저장할 리스트
        List<Integer> Prarr = new ArrayList<>(); //소수를 저장할 리스트
        int[] result = new int[2]; //결과값 2개를 저장할 배열

        int count =0; //소수판별용 카운터
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2;j < arr[i];j++){
                if(arr[i]%j ==0){
                    count++;
                }
            }
            if (count == 0){
                Prarr.add(arr[i]);
            }else {
                nPrarr.add(arr[i]);
            }
            count = 0;
        }
        System.out.println("소수를 저장한 리스트 : "+Prarr);
        System.out.println("비소수를 저장한 리스트 : "+nPrarr);
        int max = Prarr.get(0);
        int min = nPrarr.get(0);

        for (int num : Prarr) { //소수리스트 Prarr의 최대값 판별 for문
            if (num > max ) {
                max = num;
            }
        }
        for (int num : nPrarr) { //비소수리스트 nPrarr의 최소값 판별 for문
            if (num < min) {
                min = num;
            }
        }

        for (int t = 0; t < result.length; t++) {
            if (t == 0){
                result[t] = min;
            }else {
                result[t] = max;
            }
        }
        answer = Arrays.toString(result); //int배열 result를 String으로 변환하여 결과값에 대입
        System.out.println("결과값 : "+answer); //결과값 출력문
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s ="1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25";

        method.solution(s);
    }
}