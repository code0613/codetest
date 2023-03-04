class Solution {
    public int solution(int chicken) {
        int service = 0;
        while (chicken >= 10){
            int addCoupon = chicken / 10;
            service += addCoupon;
            chicken = chicken % 10 + addCoupon;
        }
        return service;
    }
} 

class Solution {
    public int solution(int chicken) {
        int service = 0;
        while (chicken > 9){
            service += chicken / 10;
            chicken = chicken % 10 + chicken / 10;
        }
        return service;
    }
} // 불필요한 재대입 제거