
## 설명 
카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어, 카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다. 
"네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 
입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.
다음은 카카오 아이디의 규칙입니다.

아이디의 길이는 3자 이상 15자 이하여야 합니다.
아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
"네오"는 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가 카카오 아이디 규칙에 맞는 지 검사하고 규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천해 주려고 합니다.
신규 유저가 입력한 아이디가 new_id 라고 한다면,

## 규칙
1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

## 제한 조건
new_id는 길이 1 이상 1,000 이하인 문자열입니다.
new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.

``` java
class Solution {
    public String solution(String new_id) {
        String answer = "";

        // 1단계 모든 대문자를 대응되는 소문자로 치환합니다.
        answer = upperToLower(new_id);

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        answer = notAllowText(answer);

        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        answer = removeDoublePeriod(answer);

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        answer = removeFirstFinalPeriod(answer);

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        answer = isBlank(answer);

        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        answer = characterLimit(answer);

        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        answer = repeatThreeTime(answer);

        return answer;
    }
    public String upperToLower(String text) {
        return text.toLowerCase();
    }

    public String notAllowText(String text) {
        return text.replaceAll("[^a-z0-9-_.]","");
    }

    public String removeDoublePeriod(String text) {
        Stack<String> stack = new Stack<>();
        String[] textArr = text.split("");

        for (int i = 0; i < textArr.length; i++) {

            if (!stack.empty()) {
                // 스택의 최후미가 "."이 아니면 push
                if (!stack.peek().equals(textArr[i])) {
                    stack.push(textArr[i]);
                }
           } else {
               // 최조 1회 시행
               stack.push(textArr[i]);
           }
        }

        Stack<String> answerStack = new Stack<>();
        int num = stack.size();
        for (int i = 0; i < num; i++) {
            answerStack.push(stack.peek());
            stack.pop();
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < num; i++) {
            answer.append(answerStack.peek());
            answerStack.pop();
        }
        return answer.toString();
    }

    public String removeFirstFinalPeriod(String text) {
        String answer = "";
        if (String.valueOf(text.charAt(0)).equals(".")) {
            answer = text.substring(1);
        }
        if (String.valueOf(answer.charAt(answer.length() - 1)).equals(".")){
            answer = text.substring(0,answer.length() - 2);
        }
        return answer;
    }

    public String isBlank(String text) {
        if (text.length() == 0) {
            return "a";
        } else return text;
    }

    public String characterLimit(String text) {
        String answer = "";
        int limit = 15;

        String[] textArr = text.split("");
        if (textArr.length > limit) {
            answer = text.substring(0,limit);
        }

        if (String.valueOf(answer.charAt(answer.length() - 1)).equals(".")) {
            answer = answer.substring(0,limit-1);
        }
        return answer;
    }

    public String repeatThreeTime(String text) {
        String answer = "";
        String str = String.valueOf(text.charAt(text.length() - 1));

        if (text.length() == 1) {
            answer = text + str;
        } else if (text.length() == 2) {
            answer = text + str + str;
        } else return text;

        return answer;
    }
}
```
## 문제점
