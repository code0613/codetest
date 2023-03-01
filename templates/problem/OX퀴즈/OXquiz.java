import java.util.ArrayList;
import java.util.List;
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