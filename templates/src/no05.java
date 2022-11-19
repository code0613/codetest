class Nno5 {
    public int solution(String s) {
        int answer = Integer.parseInt(s);


        System.out.println( ((Object) answer).getClass().getName());
        return answer;
    }
}

public class no05 {
    public static void main(String[] args) {
        Nno5 nn05 = new Nno5();
        System.out.println(nn05.solution("1234"));

    }
}
