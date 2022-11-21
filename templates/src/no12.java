class Nno12 {
    public long solution(int price, long money, int count) {
        long answer =0;
        long totalprice = 0;
        for (int i = 0; i < count+1;i++){
            totalprice = totalprice+(price*i);
        }
        if (totalprice <= money){
            answer = 0;
        }else {
            answer = totalprice-money;
        }
        return answer;
    }
}
public class no12 {
    public static void main(String[] args) {
        int price = 2500;
        long money = 1000000000;
        int count = 2500;
        Nno12 nno12 = new Nno12();
        System.out.println(nno12.solution(price,money,count));
    }
}
