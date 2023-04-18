class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        String[] arr = s.split("");
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            if ((int) ch != 32) {
                if ((int) ch >= 65 && (int) ch <= 90){
                    if (((int) ch + n) > 90) {
                        arrCopy[i] = ((int) ch + n) - 26;
                    } else {
                        arrCopy[i] = (int) ch + n;
                    }
                } else if ((int) ch >= 97 && (int) ch <= 122) {
                    if (((int) ch + n) > 122) {
                        arrCopy[i] = ((int) ch + n) - 26;
                    } else {
                        arrCopy[i] = (int) ch + n;
                    }
                }
            } else {
                arrCopy[i] = 32;
            }
        }
        for (int num : arrCopy) {
            char ch = (char) num;
            answer.append(ch);
        }
        return answer.toString();
    }
    
}