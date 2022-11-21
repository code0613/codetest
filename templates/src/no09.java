class Nno09 {
    public String solution(String phone_number) {
        String answer = phone_number;

        String front = phone_number.substring(0,phone_number.length()-4);
        String back = phone_number.substring(phone_number.length()-4);
        front = front.replaceAll("[0-9]","*");
        answer = front.concat(back);
        return answer;
        
    }
}
public class no09 {
    public static void main(String[] args) {
        String num = "01033334444";
        Nno09 nno09 = new Nno09();
        System.out.println(nno09.solution(num));
    }
}
