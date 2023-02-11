class Nno33 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (i > height) {
                answer++;
            }
        }
        return answer;
    }
}

public class no33 {
    public static void main(String[] args) {
        int[] arr = {149, 180, 192, 170};
        int hei = 167;
        Nno33 sol = new Nno33();
        sol.solution(arr, hei);
    }
}
