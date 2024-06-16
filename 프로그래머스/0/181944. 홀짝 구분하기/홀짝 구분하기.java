import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String even = " is even";
        String odd = " is odd";
        
        if(n % 2 == 0) {
            System.out.println(n+even);
        } else System.out.println(n+odd);
     
    }
}