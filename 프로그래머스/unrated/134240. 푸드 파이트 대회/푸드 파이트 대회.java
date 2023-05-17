class Solution {
   public String solution(int[] food) {

        StringBuilder left = new StringBuilder();
        int num = 0;
        for (int i = 1; i < food.length; i++) {
            num = food[i]/2;

            for (int j = 0; j < num; j++) {
                left.append(i);
            }
        }

        String answer = left + "0";
        StringBuilder right = left.reverse();

        return answer + right;
    }
}