# 코딩테스트 No.32
## 설명 
- 정수 배열 numbers가 주어집니다.
-  numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
  
## 제한 조건
- numbers의 길이는 2 이상 100 이하입니다.
- numbers의 모든 수는 0 이상 100 이하입니다.

``` java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
class Solution {
     public Integer[] solution(int[] numbers) {
        Integer[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length-1){
                break;
            }
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        answer = set.toArray(new Integer[0]);
        Arrays.sort(answer);

        return answer;
    }
}
```
## 문제점
중복을 제거하기 위해서 내부 리스트를 for문을 통해 탐색을 해서 제거를 했는데 너무 비효율 적이고 머리속에서 이렇게 이렇게 해야지는 알겠는데 코드로 구현하기 어려웠다


hashset을 사용했고 hashset은 Set 인터페이스에서 지원하는 구현 클래스이다

큰 특징은hashset 은 넣으면 중복을 허용하지 않고 담긴다

# 후기

확실히 많은 문제를 풀면서 여러 메소드들을 알아가는게 중요하다고 느낀다

for문과 if문을 암만 굴려서 풀어볼려고 해도 손에 잡히지도 않던 문제가

기능을 하는 메소드 하나로 해결되어버리는...
