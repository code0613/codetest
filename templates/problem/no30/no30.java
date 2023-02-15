import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Nno30 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int Max1 = 0;
        int Max2 = 0;

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]){
            }else {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for (int i = 0; i < sizes.length; i++) {
            list1.add(i, sizes[i][0]);
        }
        for (int i = 0; i < sizes.length; i++) {
            list2.add(i, sizes[i][1]);
        }
        for(int i : list1 )  Max1 = Math.max( i, Max1 );
        for(int i : list2 )  Max2 = Math.max( i, Max2 );
        answer = Max1*Max2;

        return answer;
    }
}

public class no30 {
    public static void main(String[] args) {
        Nno30 nno30 = new Nno30();
        int[][] size = {{60,50},{30,70},{60,30},{80,40}};
        nno30.solution(size);
    }
}
