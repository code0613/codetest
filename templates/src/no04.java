class Nno04 {
    public long solution(int a, int b) {
        long num=0;
        if (a < b){
            for (num = 0; a <= b; a++){
                num += a;
            }
            return  num;
        }
        else if (b < a) {
            for (num = 0; b <= a; b++){
                num += b;
            }
            return  num;
        }
        else {
            num = a;
            return  num;
        }

    }
}

public class no04 {
    public static void main(String[] args) {
        Nno04 nno04 = new Nno04();
        System.out.println(nno04.solution(5,3));
    }
}

