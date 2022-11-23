class Nno29 {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        str = Integer.toString(n,3);

        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        //String reversedStr = sb.reverse().toString();

        answer = Integer.parseInt(reversedStr,3);

        return answer;
    }
}
public class no29 {
    public static void main(String[] args) {
        Nno29 nno29 = new Nno29();
        nno29.solution(45);
    }
}
