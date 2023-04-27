import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        
        int answer = 0;
        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            integerSet.add(nums[i]);
        }
        
        return (integerSet.size() > nums.length/2) ? nums.length/2 : integerSet.size();
    }
}