import java.time.LocalDate;

public class test01 {
    public String sol(int month, int day){
        String answer = "";
        LocalDate date = LocalDate.of(2022,month,day);
        LocalDate date1 = date.plusDays(98);

        answer = date1.getMonthValue() + "월" + " "+ date1.getDayOfMonth() + "일";

        return answer;
    }
    public static void main(String[] args) {
        test01 test01 = new test01();
        System.out.println(test01.sol(11,27));
    }
}