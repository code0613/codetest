class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        int length = Math.max(my_string.length(), overwrite_string.length());

        for (int i = 0; i < length; i++) {
            if (i >= s && i - s < overwrite_string.length()) {
                sb.append(overwrite_string.charAt(i - s));
            } else {
                if (i < my_string.length()) {
                    sb.append(my_string.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}