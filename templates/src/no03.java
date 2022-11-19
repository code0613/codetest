import java.util.Scanner;

public class no03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        int len = s.length();
        if (len % 2 == 1){
            System.out.println(s.substring((len/2),(len/2)+1));
        }else {
            System.out.println(s.substring((len/2-1),(len/2)+1));
        }
    }
}