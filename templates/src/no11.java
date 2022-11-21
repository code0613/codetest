class Nno11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i<n;i++){
            answer[i] = (long)x*(i+1);
            System.out.println(answer[i]);
        }
        return answer;
    }
}
public class no11 {
    public static void main(String[] args) {
        Nno11 no11 = new Nno11();
        no11.solution(2,5);
    }
}
