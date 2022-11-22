# 코딩테스트 No.24
## 설명 
- 함수 solution은 정수 n을 매개변수로 입력받습니다.
- n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

## 제한 조건
- n은 1이상 8000000000 이하인 자연수입니다.

``` java
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;
class Solution {
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
```
## 문제점
이전 22번 문제와 같이 여기서도 정수를 문자열로 변환하고 다시 stream을 통해 문자 단위로 나눈후 int[]로 넣는다

물론 다른 방법도 있겠지만 나는 내림차순을 위해 Collections.reverseOrder()를 사용했다

reverseOrder() 를 사용하기 위해서는 기본 int[]에서 Integer[]로 변환해주었다

Integer[]로 변환하는 과정에서 보면 처음에 int[]안에는 IntStream타입이 담겨있는데 이를 stream을 지원하는 클래스 타입으로 변환하기 위해 boxed()를 사용했다

이후 reverseOrder()를 통해 내림차순 정렬했다

내림차순 정렬이 된 데이터를 다시 arr[] 에 넣어줬는데 이때 람다식을 사용해 봤다
조금 사용법을 찾아보고 원래 있던 코드에서 내가 필요한 코드로 살짝 변형을 해 사용했다

배열의 요소들을 result에 다 더해주고 String to Long타입으로 변환 후 반환한다
# 후기
이 문제에는 진짜 시간을 많이 쏟았던거 같다

처음에 reverseOrder를 알게되어서 이걸 써먹어 볼려고 했더니 사용하려면 전제가 필요했다

기본타입은 사용할 수 없다고 하고 원시 stream타입은 지원을 하지 않는다고도 하고

그 와중에 람다식 말고도 사용할 수 있었지만 이번엔 이 부분에서는 이렇게 해볼까? 했던게 
이렇게 오래걸릴줄...