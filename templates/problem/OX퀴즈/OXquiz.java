class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

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
            answer[i] = "O";
            }else answer[i] = "X";
        }
    return answer;
    }   
}