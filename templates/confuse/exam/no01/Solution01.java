public class Solution01 {
    public String solution(int[] arr) {
        String answer = "";
        int count = 0; //카운터 int 타입 변수 선언
        for (int i = 0; i < arr.length; i++) { //for문을 돌건데 i는 arr의 길이만큼 돌거다
            if (arr[i] == 0){  // for문을 돌면서 arr를 탐색합니다
                                // 만약에 arr[i] 의 값이 0이라면 카운터를 올립니다
                                // 카운터 만큼 세서 현재 입력된 arr가 배(0)가 몇개인지 파악합니다
                count++;
            }
        }
        switch (count){ //switch case문으로 카운터의 입력값마다 다른 value를 부여해줍니다
            case 1:
                answer = "도";
                break;
            case 2:
                answer = "개";
                break;
            case 3:
                answer = "걸";
                break;
            case 4:
                answer = "윷";
                break;
            default:
                answer = "모";
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution01 method = new Solution01();
        int[] arr1 = {0,1,0,1};
        int[] arr2 = {1,1,1,0};
        int[] arr3 = {0,0,1,1};
        int[] arr4 = {0,1,0,0};
        System.out.println(method.solution(arr1));
        System.out.println(method.solution(arr2));
        System.out.println(method.solution(arr3));
        System.out.println(method.solution(arr4));
    }
}