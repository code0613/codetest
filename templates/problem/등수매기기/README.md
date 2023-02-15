
## 설명 
영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

## 제한 조건
0 ≤ score[0], score[1] ≤ 100
1 ≤ score의 길이 ≤ 10
score의 원소 길이는 2입니다.
score는 중복된 원소를 갖지 않습니다.

``` java
class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        int[] transwer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            double num = 0;
            for (int j = 0; j < score[i].length; j++) {
                num += score[i][j];
            }
            answer[i] =num/2;
        }

        for(int i=0; i<score.length; i++){
            int count =1;
            for(int j=0; j<score.length; j++){
                if (answer[i] == 0){
                    transwer[i] = score.length+1;
                }
                if(answer[i] < answer[j]){
                    count++;
                }
            }
            transwer[i] = count;
        }
        return transwer;
    }
}
```
## 문제점

코드 리팩토링 필요