class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder ans = new StringBuilder();
        Stack<String> strstack = new Stack<>();
        String[] strarr = s.split("");

        for (int i = 0; i < s.length(); i++) {
            strstack.push(strarr[i]);
            String cnt = "";
            cnt = cnt + strstack;
            cnt = cnt.replaceAll(" ","");                           // 공백 제거
            cnt = cnt.replaceAll(",","");                           // 반점 제거
            cnt = cnt.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", ""); // 특수문자 제거
            
            switch (cnt) {
                case "zero","0" -> {
                    strstack.clear();
                    ans.append("0");
                }
                case "one", "1" -> {
                    strstack.clear();
                    ans.append("1");
                }
                case "two","2" -> {
                    strstack.clear();
                    ans.append("2");
                }
                case "three","3" -> {
                    strstack.clear();
                    ans.append("3");
                }
                case "four","4" -> {
                    strstack.clear();
                    ans.append("4");
                }
                case "five","5" -> {
                    strstack.clear();
                    ans.append("5");
                }
                case "six","6" -> {
                    strstack.clear();
                    ans.append("6");
                }
                case "seven","7" -> {
                    strstack.clear();
                    ans.append("7");
                }
                case "eight","8" -> {
                    strstack.clear();
                    ans.append("8");
                }
                case "nine","9" -> {
                    strstack.clear();
                    ans.append("9");
                }
            }
        }
        answer = Integer.parseInt(String.valueOf(ans));
        return answer;
    }
}