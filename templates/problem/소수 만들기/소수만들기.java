class Solution {
    static int count = 0;
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);

        int[] result = new int[3];
        combination(nums,result,0,0);
        answer = count;
        return answer;

    }

    public void combination(int[] target, int[] result, int cnt, int idx) {
        if (cnt == 3) {
            count += isPrime(result[0]+result[1]+result[2]);
            return;
        }
        for (int i = idx; i < target.length; i++) {
            result[cnt] = target[i];
            combination(target, result, cnt + 1, i + 1);
        }
    }
    public static int isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}