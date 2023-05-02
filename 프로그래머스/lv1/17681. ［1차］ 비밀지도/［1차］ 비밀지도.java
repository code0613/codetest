import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] copyArr1 = new String[n];
        String[] copyArr2 = new String[n];
        String[] mainArr = new String[n];


        for (int i = 0; i < arr1.length; i++) {
            copyArr1[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(" ", "0");
            copyArr2[i] = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(" ", "0");
        }
        System.out.println(Arrays.toString(copyArr1));
        System.out.println(Arrays.toString(copyArr2));

        for (int i = 0; i < copyArr1.length; i++) {
              mainArr[i] = String.format("%" + n + "s", Long.parseLong(copyArr1[i]) + Long.parseLong(copyArr2[i])).replace(" ", "0");
        }
        System.out.println(Arrays.toString(mainArr));

        for (int i = 0; i < mainArr.length; i++) {
            answer[i] = mainArr[i].replaceAll("[1-2]","#");
            answer[i] = answer[i].replaceAll("0", " ");
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}