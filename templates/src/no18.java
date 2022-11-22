import java.util.Arrays;

class Nno18 {
    public String solution(String[] seoul) {
        String answer = "";
        String mrkim = "Kim";
        if (Arrays.asList(seoul).contains(mrkim)){
            answer = String.format("김서방은 %d에 있다", Arrays.asList(seoul).indexOf("Kim"));
        }
        return answer;
    }
}
public class no18 {
    public static void main(String[] args) {
        Nno18 nno18 = new Nno18();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(nno18.solution(seoul));
    }
}
