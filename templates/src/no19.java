class Nno19 {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"수","박"};

        for (int i = 1; i<n+1;i++){
            if (i % 2 == 1){
                answer = answer + arr[0];
            }else {
                answer = answer + arr[1];
            }
        }
        return answer;
    }
}
public class no19 {
    public static void main(String[] args) {
        Nno19 nno19 = new Nno19();
        System.out.println(nno19.solution(10));
    }
}
