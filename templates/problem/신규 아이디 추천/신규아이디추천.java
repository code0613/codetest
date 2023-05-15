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