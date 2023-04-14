
## 설명 
머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 
7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

## 제한 조건
1 ≤ array의 길이 ≤ 100
0 ≤ array의 원소 ≤ 100,000

``` java
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] strings = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            strings[i] = String.valueOf(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            String[] strarr;

            strarr = strings[i].split("");
            for (int j = 0; j < strarr.length; j++) {
                if (Integer.parseInt(strarr[j]) == 7) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
```
## 문제점
