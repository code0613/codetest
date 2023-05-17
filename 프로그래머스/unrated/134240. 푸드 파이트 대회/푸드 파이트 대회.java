class Solution {
   public String solution(int[] food) {

        StringBuilder left = new StringBuilder();
        StringBuilder reverseLeft = new StringBuilder();

        int num = 0;
        for (int i = 1; i < food.length; i++) {
            num = food[i]/2;

            for (int j = 0; j < num; j++) {
                left.append(i);
                reverseLeft.append(i);
            }
        }

        StringBuilder right = reverseLeft.reverse();

        return left + "0" + right;
    }
}