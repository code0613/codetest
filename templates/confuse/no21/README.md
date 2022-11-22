# 코딩테스트 No.21
## 설명 
- 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
- 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

## 제한 조건
- 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
- 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
``` java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> arraylist = new ArrayList<>(
                Arrays.asList(s.split(""))
        );
        int count = 0;
        for (int i = 0; i < arraylist.size();i++){
            if (count % 2 == 0){
                arraylist.set(i, arraylist.get(i).toUpperCase());
                count++;
            } else if (count % 2 == 1) {
                arraylist.set(i, arraylist.get(i).toLowerCase());
                count++;
            }
            if (arraylist.get(i).equals(" ")){
                count = 0;
            }
        }
        for (int j = 0; j < arraylist.size();j++){
            answer += arraylist.get(j);
        }
        System.out.println(answer);
        return answer;
    }
}
```
## 문제점
항상 기본 배열만 사용하다가 Arraylist로 하면 좀 더 쉽게 풀 수 있다는 조언을 듣고 사용해봤다

처음엔 split(" ")으로 단어단위로 나누어서 어떻게 해야하나 했지만 split("")으로 한 문자단위로 나누면 더 편할 것 같아서 변경했다

for문을 돌려야 하는데 길이를 정하는데 length가 먹히지 않아 찾아봤더니 arraylist의 길이를 찾을때는 size()를 사용한다고 한다

list의 i번 배열에 대입을 할려고 했더니 또 문법이 달라서 오류가 떳고 list에서는 set,get을 사용한다는 것을 알게 되었다


# 후기

처음 사용해본 arraylist 아직 사실 잘 모르겠다
문제 자체가 어렵지는 않았지만 내가 익숙한 방식이 아닌 새로운 방식으로 풀어보니 뭔가 낯선 느낌이 났다

이것도 문제를 계속 풀다보면 적응되겠지
