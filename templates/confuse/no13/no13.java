
// 1,3,5,7,8,10,12월달은 31일
// 2월달은 29일
// 4,6,9,11월달은 30일

class Nno13 {
    public String solution(int a, int b) {
        String answer = "";
        String week[] = {
                "FRI","SAT","SUN","MON","TUE","WED","THU"
        };
        int payday = 0;

        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < a-1; i++){
            payday += month[i]; //a == 1 일 경우 실행하지 않음
        }
        payday += b-1;
        payday = payday%7;
        answer = week[payday];
        return answer;
    }
}
public class no13 {
    public static void main(String[] args) {
        Nno13 nno13 = new Nno13();

        System.out.println(nno13.solution(1,24));
    }
}

