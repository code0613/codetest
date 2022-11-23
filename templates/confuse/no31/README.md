# 코딩테스트 No.31
## 설명 
- 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
- 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
- 예를 들면,
   - arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
   - arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
  
## 제한 조건
- 배열 arr의 크기 : 1,000,000 이하의 자연수
-  배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

``` java
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int temp = -1;
        List<Integer> list = new ArrayList<>(0);

        for (int i = 0; i < arr.length; i++) {
            if (temp == arr[i]){
            }else {
                temp = arr[i];
                list.add(arr[i]);
            }
        }
       answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
```
## 문제점
temp가 -1인 이유는 제한사항에 arr의 원소의 크기가 0보다 크고 9보다 작거나 같은 정수라고 명시 되어있기때문에 temp가 0일경우에 테스트케이스 중에서 0번지에 0이 들어갈 경우 같기 때문에 스킵되버리는것을 방지함에 있다 
# 후기
사람마다 코드다 다르고 같은 기능을 하더라도 스타일이 다르고 익숙한 코드로 기능을 구현하게 된다

확실히 stream과 mapToInt를 쓰는것이 나쁘다고는 생각하지 않지만 다른방법으로도 풀어봐야겠다