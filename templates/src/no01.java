import java.util.Scanner;
public class no01 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int a = sca.nextInt();
        int b = sca.nextInt();
        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
