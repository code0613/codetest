class Nno15 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int[] arr = {0};

        for (int i = 0;i<a.length;i++){
            arr[0] += a[i]*b[i];
        }
        answer = arr[0];
        System.out.println(answer);
        return answer;
    }
}
public class no15 {
    public static void main(String[] args) {
        Nno15 nno15 = new Nno15();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        nno15.solution(a,b);
    }
}
