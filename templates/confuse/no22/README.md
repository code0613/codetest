# 코딩테스트 No.16
## 설명 
- 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
- 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

## 제한 조건
-  첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

``` java
//import java.util.*;
import java.util.stream.Stream;
public class Solution {
    public int solution(int n) {
        int answer = 0;
        String span;
        span = Integer.toString(n); //int나 Integer형을 String으로 변환
        int[] digits = Stream.of(span.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < digits.length;i++){
            answer += digits[i];
        }

        return answer;
    }
}
```
## 문제점
Java의 외부 라이브러리인 stream을 사용해서 문제를 풀었다

import하는 과정에서 의문이 내가 java.utll.* 을 하면 내부에 있는 클래스 인터페이스를 불문하고 모든 라이브러리 사용할 수 있게 되는줄 알았다

stream() 적음과 동시에 인텔리제이에서는 자동으로 import를 해주어서 stream.Stream을 사용하게 되었고 java.utll.*을 적더락도 라이브러리 내부 인터페이스 까지는 못불러 온다는 것을 알게 되었다

코드는 자연수를 입력받아 문자열로 변환하고 변환된 문자열을 Stream을 통해 문자단위로 나눈후 mapToInt()를 통해 IntStream을 반환하게 한다 그것을 toArray()를 통해 int[]에 담게 된다

이후 for문에서 int[] 길이만큼 반복하며 각 자릿수의 합을 구해낸다


# 후기
확실히 알고리즘 문제를 풀면서 처음 써보는 메소드, 클래스 들이 많다

멘토님께서는 stream을 공부한다고 했더니 여러 책을 추천해주셨다

확실히 stream 부분은 검색만으로 온전한 지식을 얻는데는 어려움이 있을거같다

~~지금은 책 살때가 아닌거 같아 고민중...~~
