import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int[] result1 = {1,2,3,4,5};
        int[] result2 = {2,1,2,3,2,4,2,5};
        int[] result3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = {0,0,0};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;


        for (int i = 0; i < arr.length; i++) {

            // 카운터 부
            if (cnt1 > 4) {     // 첫번째 학생
                cnt1 = 0;
            }
            if (cnt2 > 7) {     // 두번째 학생
                cnt2 = 0;
            }
            if (cnt3 > 9) {     // 세번째 학생
                cnt3 = 0;
            }

            // 답안 채점부
            if (result1[cnt1] == (arr[i])) {
                score[0]++;
            }
            cnt1++;

            if (result2[cnt2] == (arr[i])) {
                score[1]++;
            }
            cnt2++;

            if (result3[cnt3] == (arr[i])) {
                score[2]++;
            }
            cnt3++;
        }
        int[] answer = new int[3];

        int count = 1;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == Math.max(Math.max(score[0],score[1]),score[2])) {
                answer[i] = count;
            }
            count++;
        }

        return removeElement(answer, 0);
    }
    public int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
}