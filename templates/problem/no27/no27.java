class Nno27 {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        boolean run = true;
        if (num ==1){
            answer =0;
            return answer;
        }
        while (run){
            if (num % 2 == 0){
                num = num/2;
                count++;
                if (num == 1){
                    run = false;
                }
            } else if (num % 2 == 1) {
                num = (num*3)+1;
                count++;
                if (num == 1){
                    run = false;
                }
            }
        }
        if (count > 500){
            answer = -1;
        }else {
            answer = count;
        }
        return answer;
    }
}
public class no27 {
    public static void main(String[] args) {
        Nno27 nno27 = new Nno27();

        System.out.println(nno27.solution(1));
    }
}
