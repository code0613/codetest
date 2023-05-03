import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        Pattern pattern = Pattern.compile("[0-9]+[SDT]\\W?");
        Matcher m = pattern.matcher(dartResult);
        String[] arr = new String[3];

        int cnt = 0;
        while(m.find()){
            arr[cnt] = m.group();
            cnt++;
        }
        String first = arr[0];
        String second = arr[1];
        String third = arr[2];

        int firstResult = calculate(first);
        int secondResult = calculate(second);
        int thirdResult = calculate(third);

        if (third.contains("*")) {
            thirdResult = thirdResult * 2;
            secondResult = secondResult * 2;
        }
        if (second.contains("*")) {
            secondResult = secondResult * 2;
            firstResult = firstResult * 2;
        }
        if (first.contains("*")) {
            firstResult = firstResult * 2;
        }


        return firstResult+secondResult+thirdResult;
    }
    public int calculate(String text) {

        int result = 0;

        String num = text.replaceAll("[^\\d]", "");
        String ward = text.replaceAll("[\\d]", "");

        if (ward.contains("S")) {
            if (ward.contains("#")) {
                result = Integer.parseInt(num) * (-1);
            }else{
                result = Integer.parseInt(num);
            }
        } else if (ward.contains("D")) {
            if (ward.contains("#")) {
                result = (int) Math.pow(Integer.parseInt(num), 2) * (-1);
            }else{
                result = (int) Math.pow(Integer.parseInt(num), 2);
            }

        } else if (ward.contains("T")) {
            if (ward.contains("#")) {
                result = (int) Math.pow(Integer.parseInt(num), 3) * (-1);
            }else{
                result = (int) Math.pow(Integer.parseInt(num), 3);
            }
        }

        return result;
    }
}