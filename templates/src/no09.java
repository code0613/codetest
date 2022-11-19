class Nno09 {
    public String solution(String phone_number) {
        String answer = phone_number;

        String front = phone_number.substring(0,phone_number.length()-4);
        String back = phone_number.substring(phone_number.length()-4);
        front = front.replace("0","*");
        front = front.replace("1","*");
        front = front.replace("2","*");
        front = front.replace("3","*");
        front = front.replace("4","*");
        front = front.replace("5","*");
        front = front.replace("6","*");
        front = front.replace("7","*");
        front = front.replace("8","*");
        front = front.replace("9","*");

        answer = front.concat(back);

        return answer;
    }
}
public class no09 {
    public static void main(String[] args) {
        String num = "01033334444";
        Nno09 nno09 = new Nno09();
        nno09.solution(num);
    }
}
