import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] main = new double[N+1];
//        double[] reach = new double[N];
        int[] answer = new int[N];
        List<double[]> doubleList = new ArrayList<>();


        // 각 스테이지에 도착한 인원 산출
        for (int i = 0; i < stages.length; i++) {
            for (int j = 1; j <= N+1; j++) {
                if (stages[i] == j) {
                    main[j-1]++;
                }
            }
        }
        System.out.println(Arrays.toString(main));

        // 실패율 계산
        for (int i = 0; i < answer.length; i++) {
            int num = 0;
            if (main[i] != 0.0) {
                for (int j = i; j < main.length; j++) {
                    num += main[j];
                }

                doubleList.add(new double[]{i + 1, main[i] / num});
            } else doubleList.add(new double[]{i + 1, 0});
        }

        for (double[] doubles : doubleList) {
            System.out.println(Arrays.deepToString(new double[][]{doubles}));
        }
        doubleList.sort((i,j) -> Double.compare(j[1],i[1]));

//        System.out.println("===================================================");
//        for (double[] doubles : doubleList) {
//            System.out.println(Arrays.deepToString(new double[][]{doubles}));
//        }
        for (int i=0; i<doubleList.size(); i++) {
            answer[i] = (int)doubleList.get(i)[0];
        }
//        System.out.println("===================================================");

//        System.out.println(Arrays.toString(answer));
        return answer;
    }
}