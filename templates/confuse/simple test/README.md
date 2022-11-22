# 모의고사
## 설명 
- 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
- str에 나타나는 숫자 중 소수의 최대값과 소수가 아닌 수의 최소값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요. 
- 예를들어 s가 "2 3 4 5"라면 "4 5"를 리턴하고, "15 3 10 9 7 8"라면 "8 7"을 리턴하면 됩니다.
## 제한 조건
- s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
- 문자열에는 소수가 한개 이상 섞여 있습니다.
- 문자열에는 소수가 아닌 수가 한개 이상 섞여 있습니다.
- 음수는 없습니다.

``` java
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

```
## 문제점
지금까지 공부한 것을 바탕으로 주어진 시간안에 3문제중 1개의 문제를 해결합니다

3개의 문제중에 문제를 읽고 3번만 이해가 바로 되서 선택했다

코드는 간단히 설명하면<br>소수판별후 소수만 리스트1에 대입 비소수는 리스트2에 대입

리스트1에서 가장 큰수 추출, 리스트2에서 가장 작은수 추출

각각 배열에 대입후 String으로 형변환 → 리턴

# 후기
확실히 시험이라고 하니 살짝 긴장되는 부분도 있었지만 하나라도 해낼 수 있어서 정말 다행이었다

나머지 2개의 문제도 끝나고 다시보니 조금 알 것 같은 기분이 들기도 해서 바로 풀어보기로 했다