class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        String str = Arrays.toString(ingredient);
        str = str.replaceAll(", ", "");

        while(str.indexOf("1231") > 0) {
            answer++;
            str = str.replaceFirst("1231", "");
        }
        return answer;
    }
}