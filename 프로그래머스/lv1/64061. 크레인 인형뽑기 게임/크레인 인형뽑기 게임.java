import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
   public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Stack<Integer>> stackList = new ArrayList<>();
        Stack<Integer> basket = new Stack<>();

        for (int i = 0; i < board.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = board.length - 1; j >= 0; j--) {
                if (board[j][i] != 0) {
                    stack.push(board[j][i]);
                }
            }
            stackList.add(stack);
        }

        for (int i = 0; i < moves.length; i++) {
            int num = moves[i]-1;
            Integer before = 0;

            if (!stackList.get(num).empty()) {
                if (!basket.empty()){
                    before = basket.peek();
                }

                if (before == stackList.get(num).peek()) {
                    basket.pop();
                    answer += 2;
                    stackList.get(num).pop();
                }else {
                    basket.push(stackList.get(num).peek());
                    stackList.get(num).pop();
                }
            }
        }
        return answer;
    }
}