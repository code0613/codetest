import java.util.Arrays;

class Nno10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];

       for (int i = 0; i < arr1.length;i++){
           for (int j = 0; j < arr1[0].length; j++){
               answer[i][j] = arr1[i][j] + arr2[i][j];
           }
       }
        return answer;
    }
}
public class no10 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,3},{2}};
        int[][] arr2 = {{3},{5}};
        Nno10 nno10 = new Nno10();
        nno10.solution(arr1,arr2);
    }
}
