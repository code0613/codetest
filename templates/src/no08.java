class Nno08 {
    public double solution(int[] arr) {
        double answer = 0;

        for (int i =0;i<arr.length;i++){
            answer += arr[i];
        }
        answer = answer/ arr.length;
        return answer;
    }
}
public class no08 {
    public static void main(String[] args) {
        Nno08 nno08 = new Nno08();
        int[] arr = { 1,2,3,4};

        System.out.println(nno08.solution(arr));

    }
}
