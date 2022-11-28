# 코딩테스트 exam no.01
## 설명 
- 정수형 배열을 입력받습니다 배열의 길이는 5 이며 배열의 요소는 0 또는 1 입니다
- 윷을 던져 배(0) 등(1)의 갯수를 확인하여 도개걸윷모 중 하나를 출력하세요

``` java
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
```
## 문제점

# 후기

모의고사보다 난이도가 많이많이 긴장하고 걱정했지만 1번문제는 어려움 없이 풀었다
다행이다! 다행인가?