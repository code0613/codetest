# 코딩테스트 No.16
## 설명 
- 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
- n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

## 제한 조건
- n은 1이상, 50000000000000 이하인 양의 정수입니다.

``` java
class Solution {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        double spare = result - (int)result;
        if (spare >0){
            answer = -1;
        }else {
            answer = (long) Math.pow((result)+1,2);
        }
        return answer;
    }
}
```
## 문제점
제곱근을 구하는데 Math.sqrt()메소드를 사용했다

제곱근이 딱 떨어지지 않으면 소수부분이 생기니 spare변수에 result의 정수부분을 제거한 후 대입했다

제곱근이 딱 떨어진다면 spare에는 0이 들어갈 것이고 그게 아니라면 0보다 항상 크니 answer에 -1를 대입

아니면 제곱하여 +1한후 Long타입 변환후 반환입니다

# 후기
나누어 떨어지냐 아니냐를 판별하는데 로직을 어떻게 구성해야하지 고민을 하게 했다

나는 이렇게 했지만 다른 분의 방법을 보면 Math.sqrt를 사용하지 않고 거듭제곱함수인 Math.pow를 사용해서 해결하셨다고 한다

Math.pow(변수,0.5)를 한다면 제곱근이 구해지니 if문 돌려 떨어지는것을 판별한다

사람마다 당연히 코드 스타일도 다르고 사용한 함수도 다르다

내가 한 방법이 아닌 타인의 방법을 보면서 배우는것도 엄청 좋은거 같다 