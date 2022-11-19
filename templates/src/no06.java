class Nno06 {
    public int solution(int[] numbers) {
        int answer=0;
        int sum = 45;
        for (int i=0; i < numbers.length;i++){
            answer += numbers[i];
        }
        answer = sum-answer;

        return answer;
    }
}

public class no06 {
    public static void main(String[] args) {
        Nno06 nno06 = new Nno06();
        int[] a = {
                0,1,2,3,4,5,6,7,8,9
        };
        System.out.println(nno06.solution(a));
    }
}
