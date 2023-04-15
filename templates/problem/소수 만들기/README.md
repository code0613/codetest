
## 설명 
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

## 제한 조건
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

``` java
class Solution {
    static int count = 0;
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);

        int[] result = new int[3];
        combination(nums,result,0,0);
        answer = count;
        return answer;

    }

    public void combination(int[] target, int[] result, int cnt, int idx) {
        if (cnt == 3) {
            count += isPrime(result[0]+result[1]+result[2]);
            return;
        }
        for (int i = idx; i < target.length; i++) {
            result[cnt] = target[i];
            combination(target, result, cnt + 1, i + 1);
        }
    }
    public static int isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
```
## 문제점
