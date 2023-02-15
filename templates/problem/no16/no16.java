import java.util.Arrays;

class Nno16 {
    boolean solution(String s) {
        boolean answer = true;
        int pcount = 0;
        int ycount = 0;

        String[] strarr = new String[s.length()];

        for (int i = 0; i < s.length();i++){
            strarr[i] = String.valueOf(s.charAt(i));
        }
        for (int j = 0; j < strarr.length;j++){
            if (strarr[j].equals("p") || strarr[j].equals("P")){
                pcount++;
            } else if (strarr[j].equals("y") || strarr[j].equals("Y")) {
                ycount++;
            }
        }
        if (pcount == ycount){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}
public class no16 {
    public static void main(String[] args) {
        Nno16 nno16 = new Nno16();
        String str1 = "pPoooyY";
        String str2 = "Pyy";

        System.out.println(nno16.solution(str2));
    }
}
