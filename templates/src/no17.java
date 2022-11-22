import java.util.regex.Pattern;

class Nno17 {
    public boolean solution(String s) {
        boolean answer = false;

        if (s.length() == 4 || s.length() ==6){

            if(s.matches(".*[a-zA-Z].*")){
                answer = false;
            } else{
                answer = true;
            }
        }
        return answer;
    }
}

public class no17 {
    public static void main(String[] args) {
        Nno17 nno17 = new Nno17();
        String s1 = "a234";
        String s2 = "1234";
        System.out.println(nno17.solution(s2));
//        nno17.solution(s1);

    }
}
