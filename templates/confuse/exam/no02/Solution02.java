public class Solution02 {
    public void solution(int star) {

        for (int i = 0; i < star; i++) { //몇줄 출력할거냐 코드

            for(int j=0; j<star-i; j++){ //공백 출력 코드 공백은 0부터 입력된 star-i까지 반복합니다
                System.out.print(" ");      //star 만큼 반복하면 안되냐? 하면 모든 행의 공백이 균등해져 버립니다
                                            //각 행마다 별을 처음 찍을 위치가 점점 앞으로 전진해야하는데 이에따라
                                            //공백을 줄여줘야 합니다
            }
            for(int j=0; j<(i*2)+1; j++) { //별 출력 코드. i=0일때 (i*2)+1을 해서 1만큼 출력
                System.out.print("*");      //i=1 (i*2)+1 해서 3출력
                                            //i=2  (i*2)+1 해서 5출력  이런식으로 홀수순서로 출력 1 3 5 7 9....
            }

            System.out.println(); // 줄띄워주기 필수임 줄 띄워줘야 다음 줄로가서 별을 찍을수 있습니다
        }
    }

    public static void main(String[] args) {
        Solution02 method = new Solution02();
        int star = 9;
        method.solution(star);




        }

    }


