class Nno25 {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        double spare = result - (int)result;
        if (spare >0){
            answer = -1;
        }else {
            answer = (long) Math.pow((result)+1,2);
        }
        return answer;
    }
}
public class no25 {
    public static void main(String[] args) {
        Nno25 nno25 = new Nno25();
        nno25.solution( 3);
    }
}
