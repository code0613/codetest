
## 설명 
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

## 제한 조건
두 수는 1이상 1000000이하의 자연수입니다.

``` java
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int mini = min(n,m);
        int maxy = n*m/mini;
        int[] one = Add(answer,mini);
        int[] two = Add(one,maxy);
        return two;
    }

    int min(int a,int b){
        if (b == 0) return a;
        return min(b, a%b);
    }
    int[] Add(int[] originArray, int Val) {
        int[] newArray = new int[originArray.length + 1];
        System.arraycopy(originArray, 0, newArray, 0, originArray.length);
        newArray[originArray.length] = Val;
        return newArray;
    }
}
```
## 문제점
