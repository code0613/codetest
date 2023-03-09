class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int mini = min(n,m);
        int maxy = n*m/mini;
        int[] one = Add(answer,mini);
        int[] two = Add(one,maxy);
        return two;
    }

    int min(int a,int b){
        if (b == 0) return a;
        return min(b, a%b);
    }
    int[] Add(int[] originArray, int Val) {
        int[] newArray = new int[originArray.length + 1];
        System.arraycopy(originArray, 0, newArray, 0, originArray.length);
        newArray[originArray.length] = Val;
        return newArray;
    }
}