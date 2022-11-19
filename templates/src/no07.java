class Nn07 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length;i++){
            if (signs[i] == false){
                absolutes[i] = -absolutes[i];
            }
            answer += absolutes[i];
        }
        return answer;
    }
}
public class no07 {
    public static void main(String[] args) {

        int[] array = {
                4,7,12
        };
        boolean[] signarray = {
                true,false,true
        };
        Nn07 nn07 = new Nn07();
        System.out.println(nn07.solution(array,signarray));
    }
}
