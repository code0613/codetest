
## 설명 
두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). 
X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 
다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.

## 제한 조건
3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
X, Y는 0으로 시작하지 않습니다.
X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.

``` java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Sol {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        List<String> xArr = new ArrayList<>(List.of(X.split("")));
        List<String> yArr = new ArrayList<>(List.of(Y.split("")));

        List<String> main = new ArrayList<>();
        if (xArr.get(0).equals("0")) {
            return "0";
        }

        int[] xNum = new int[10];
        int[] yNum = new int[10];

        for (int i = 0; i < xArr.size(); i++) {
            int num = Integer.parseInt(xArr.get(i));
            if (num >= 0 && num <= 9) {
                xNum[num]++;
            }
        }
        for (int i = 0; i < yArr.size(); i++) {
            int num = Integer.parseInt(yArr.get(i));
            if (num >= 0 && num <= 9) {
                yNum[num]++;
            }
        }

        System.out.println(Arrays.toString(xNum));
        System.out.println(Arrays.toString(yNum));

//        for (int i = 0; i < xNum.length; i++) {
//            if (xNum[i] > 0 && yNum[i] > 0) {
//
//                xNum[i]--;
//                yNum[i]--;
//            }
//        }
        int cnt = 0;
        boolean run = true;
        while (run) {
            if (xNum[cnt] > 0 && yNum[cnt] > 0){
                if (xNum[cnt] == yNum[cnt]) {
                    if (xNum[cnt] == 1) {
                        main.add(String.valueOf(cnt));
                    }else {
                        for (int i = 0; i < xNum[cnt]; i++) {
                            main.add(String.valueOf(cnt));
                        }
                    }
                }
            }
            cnt++;

            if (cnt > 9) {
                run = false;
            }
        }

        main.sort(Collections.reverseOrder());

        if (main.size() < 1) {
            return "-1";
        }
        if (main.get(0).equals("0")) {
            return "0";
        }

        for (int i = 0; i < main.size(); i++) {
            answer.append(main.get(i));
        }
        return answer.toString();
    }

    
    
    
}
public class temp {
    public static void main(String[] args) {
        Sol sol = new Sol();

        sol.solution("5525", "1255");
//        System.out.println(sol.solution("100", "203045"));

    }
}

```
## 문제점