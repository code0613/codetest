class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int right = 12;
        int left = 10;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==0)
                numbers[i]=11;
            switch (numbers[i]) {
                case 1, 4, 7 -> {
                    answer += "L";
                    left = numbers[i];
                }
                case 3, 6, 9 -> {
                    answer += "R";
                    right = numbers[i];
                }
                case 2, 5, 8, 11 -> {
                    int distL = Math.abs(numbers[i] - left);
                    int distR = Math.abs(numbers[i] - right);
                    if ((distL / 3 + distL % 3) > (distR / 3 + distR % 3)) {
                        answer += "R";
                        right = numbers[i];
                    } else if ((distL / 3 + distL % 3) == (distR / 3 + distR % 3)) {
                        if (hand.equals("left")) {
                            left = numbers[i];
                            answer += "L";
                        } else {
                            right = numbers[i];
                            answer += "R";
                        }
                    } else {
                        answer += "L";
                        left = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}