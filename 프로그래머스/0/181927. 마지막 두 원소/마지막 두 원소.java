import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list) {
        int[] copy = Arrays.copyOf(num_list, num_list.length + 1);
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
            copy[copy.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {
            copy[copy.length-1] = num_list[num_list.length-1] * 2;
        }
        return copy;
    }
}