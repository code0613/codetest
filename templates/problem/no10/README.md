# 코딩테스트 No.10
## 설명 
- 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.<br>
- 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

## 제한 조건
 - 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

## 실행
- main 함수는 확인을 위해 입력값을 추가했다

``` java
public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

       for (int i = 0; i < arr1.length;i++){
           for (int j = 0; j < arr1[0].length; j++){
               answer[i][j] = arr1[i][j] + arr2[i][j];
           }
       }
        return answer;
```
solution함수는 2차원배열 arr1,arr2를 매개변수로 받는다<br>
이중for문에서 arr1과 arr2를 더한 값을 answer변수에 넣는다<br>

## 문제점
2차원 배열 answer을 정의하는 과정에서 배열의 크기를 알맞게 잡지못해 계속 오류가 났었다<br>
예를들어 입력값으로 int[][] arr = {{1},{2}} 이 들어간다면
answer[i][j]의 i에는 arr1 자체의 길이인 2 가 들어간다
answer[i][j]의 j에는 arr1의 0번 인덱스의 길이 인 1이 들어가야 한다

배열의 범위지정을 계속 잘못해서 ArrayIndexOutOfBoundsException 이 나왔다



# 후기
배열의 길이를 착각했던 문제 알고보니 왜 이렇게 하는지 이해가 되었던 문제였다 
 

