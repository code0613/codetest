import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 내림차순 정렬
        Integer[] integerArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArr, Collections.reverseOrder());

        List<Integer> integerList = new ArrayList<>();

        // m개씩 포장
        for (int i = 0; i < integerArr.length; i++) {

            integerList.add(integerArr[i]);
            
            if (integerList.size() == m) {
                int min = integerList.get(0);

                // 최솟값 산출
                for (int j = 0; j < integerList.size(); j++) {
                        if (min > integerList.get(j)) {
                            min = integerList.get(j);
                        }

                }
                answer += min * m;
                integerList.clear();
            }
        }

        return answer;
    }
}