
## 설명 
덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 
수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

## 제한 조건
연산 기호와 숫자 사이는 항상 하나의 공백이 존재합니다. 
단 음수를 표시하는 마이너스 기호와 숫자 사이에는 공백이 존재하지 않습니다.
1 ≤ quiz의 길이 ≤ 10
X, Y, Z는 각각 0부터 9까지 숫자로 이루어진 정수를 의미하며, 
각 숫자의 맨 앞에 마이너스 기호가 하나 있을 수 있고 이는 음수를 의미합니다.
X, Y, Z는 0을 제외하고는 0으로 시작하지 않습니다.
-10,000 ≤ X, Y ≤ 10,000
-20,000 ≤ Z ≤ 20,000
[연산자]는 + 와 - 중 하나입니다.


``` java
class Solution {
    public List<String> solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < quiz.length; i++) {
            int X = Integer.parseInt(quiz[i].split(" ")[0]);
            int Y = Integer.parseInt(quiz[i].split(" ")[2]);

            int num = 0;
            switch (quiz[i].split(" ")[1]) {
                case "+" -> num = X + Y;
                case "-" -> num = X - Y;
            }
            int result = Integer.parseInt(quiz[i].split(" ")[4]);

            if (num == result){
                answer.add("O");
            }else answer.add("X");
        }
        return answer;
    }
}
```
## 문제점

기존 자료구조로 복원 필요