class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] strings = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            strings[i] = String.valueOf(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            String[] strarr;

            strarr = strings[i].split("");
            for (int j = 0; j < strarr.length; j++) {
                if (Integer.parseInt(strarr[j]) == 7) {
                    answer++;
                }
            }
        }

        return answer;
    }
}