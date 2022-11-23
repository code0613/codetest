# 코딩테스트 No.30
## 설명 
- 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
- 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.


## 제한 조건
- sizes의 길이는 1 이상 10,000 이하입니다.
-  sizes의 원소는 [w, h] 형식입니다.
-  w는 명함의 가로 길이를 나타냅니다.
-  h는 명함의 세로 길이를 나타냅니다.
-  w와 h는 1 이상 1,000 이하인 자연수입니다.
- 
``` java
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
       int answer = 0;
        int temp = 0;
        int Max1    = 0;
        int Max2    = 0;

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]){
            }else {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(sizes));
        for (int i = 0; i < sizes.length; i++) {
            list1.add(i, sizes[i][0]);
        }
        for (int i = 0; i < sizes.length; i++) {
            list2.add(i, sizes[i][1]);
        }
        for(int i : list1 )  Max1 = Math.max( i, Max1 );
        for(int i : list2 )  Max2 = Math.max( i, Max2 );
        answer = Max1*Max2;

        return answer;
    }
}
```
## 문제점

# 후기
이전부터 느끼고 있었지만 확실히 배열의 길이를 설정하는데 머리로는 이해를 하지만 코드로 작성하는데 어려움을 느낀다


다른 메소드도 잘 몰라서 쓰지 않는데 그와중에 없어도 for문과 if문으로 풀어지니깐 찾아보지도 않는다.

그래서 그런지 코드의 가독성이 많이 별로고 효율도 좋지 않은거같다