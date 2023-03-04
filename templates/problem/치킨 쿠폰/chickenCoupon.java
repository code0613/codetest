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