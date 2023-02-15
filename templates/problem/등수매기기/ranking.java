class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        int[] transwer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            double num = 0;
            for (int j = 0; j < score[i].length; j++) {
                num += score[i][j];
            }
            answer[i] =num/2;
        }

        for(int i=0; i<score.length; i++){
            int count =1;
            for(int j=0; j<score.length; j++){
                if (answer[i] == 0){
                    transwer[i] = score.length+1;
                }
                if(answer[i] < answer[j]){
                    count++;
                }
            }
            transwer[i] = count;
        }
        return transwer;
    }
}