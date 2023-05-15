import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String new_id) {
        String answer = "";

        // 1단계 모든 대문자를 대응되는 소문자로 치환합니다.
        answer = new_id.toLowerCase();

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        answer = answer.replaceAll("[^a-z0-9\\-_.]", "");

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


    public String removeDoublePeriod(String text) {
        String answer = "";
        String[] textArr = text.split("");

        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i].equals(".")) {
                if (i > 0) {
                    if (!textArr[i-1].equals(".")) {
                        answer += textArr[i];
                    }
                } else {
                    answer += textArr[i];
                }
            } else {
                answer += textArr[i];
            }
        }


        return answer;
    }


    public String removeFirstFinalPeriod(String text) {
        String[] strings = text.split("");
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));
        String answer = "";

        if (stringList.get(0).equals(".")) {
            stringList.remove(0);
        }

        if (stringList.size() == 0) {
            return "";
        }

        if (stringList.get(stringList.size()-1).equals(".")) {
            stringList.remove(stringList.size()-1);
        }

        for (int i = 0; i < stringList.size(); i++) {
            answer += stringList.get(i);
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
        } else answer = text;

        if (String.valueOf(answer.charAt(answer.length() - 1)).equals(".")) {
            answer = answer.substring(0,limit-1);
        }
        return answer;
    }

    public String repeatThreeTime(String text) {
        String answer = "";
        String str = String.valueOf(text.charAt(text.length() - 1));

        if (text.length() == 2) {
            answer = text + str;
        } else if (text.length() == 1) {
            answer = text + str + str;
        } else return text;

        return answer;
    }
}