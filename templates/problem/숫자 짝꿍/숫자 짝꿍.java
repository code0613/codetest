import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Sol {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        List<String> xArr = new ArrayList<>(List.of(X.split("")));
        List<String> yArr = new ArrayList<>(List.of(Y.split("")));

        List<String> main = new ArrayList<>();
        if (xArr.get(0).equals("0")) {
            return "0";
        }

        int[] xNum = new int[10];
        int[] yNum = new int[10];

        for (int i = 0; i < xArr.size(); i++) {
            int num = Integer.parseInt(xArr.get(i));
            if (num >= 0 && num <= 9) {
                xNum[num]++;
            }
        }
        for (int i = 0; i < yArr.size(); i++) {
            int num = Integer.parseInt(yArr.get(i));
            if (num >= 0 && num <= 9) {
                yNum[num]++;
            }
        }

        System.out.println(Arrays.toString(xNum));
        System.out.println(Arrays.toString(yNum));

//        for (int i = 0; i < xNum.length; i++) {
//            if (xNum[i] > 0 && yNum[i] > 0) {
//
//                xNum[i]--;
//                yNum[i]--;
//            }
//        }
        int cnt = 0;
        boolean run = true;
        while (run) {
            if (xNum[cnt] > 0 && yNum[cnt] > 0){
                if (xNum[cnt] == yNum[cnt]) {
                    if (xNum[cnt] == 1) {
                        main.add(String.valueOf(cnt));
                    }else {
                        for (int i = 0; i < xNum[cnt]; i++) {
                            main.add(String.valueOf(cnt));
                        }
                    }
                }
            }
            cnt++;

            if (cnt > 9) {
                run = false;
            }
        }

        main.sort(Collections.reverseOrder());

        if (main.size() < 1) {
            return "-1";
        }
        if (main.get(0).equals("0")) {
            return "0";
        }

        for (int i = 0; i < main.size(); i++) {
            answer.append(main.get(i));
        }
        return answer.toString();
    }

    
    
    
}
public class temp {
    public static void main(String[] args) {
        Sol sol = new Sol();

        sol.solution("5525", "1255");
//        System.out.println(sol.solution("100", "203045"));

    }
}
