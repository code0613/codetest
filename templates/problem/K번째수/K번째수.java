class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] copy = Arrays.stream(array, commands[i][0]-1,commands[i][1]).toArray();
            Arrays.sort(copy);
            answer[i] = copy[commands[i][2]-1];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}