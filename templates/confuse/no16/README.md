# 코딩테스트 No.16
## 설명 
- 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
- s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
- 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
- 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

## 제한 조건
- 문자열 s의 길이 : 50 이하의 자연수
- 문자열 s는 알파벳으로만 이루어져 있습니다.
``` java
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcount = 0;
        int ycount = 0;

        String[] ss = new String[s.length()];

        for (int i = 0; i < s.length();i++){
            ss[i] = String.valueOf(s.charAt(i));
        }
        for (int j = 0; j < ss.length;j++){
             if (ss[j].equals("p") || ss[j].equals("P")){
                pcount++;
            } else if (ss[j].equals("y") || ss[j].equals("Y")) {
                ycount++;
            }
        }
        if (pcount == ycount){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}
    }
}
```
## 문제점
논리를 구성하고 코드를 작성하는데에 큰 문제는 없었다 다만 인텔리제이에서는 문제없이 작동하는 코드가 프로그래머스에서 제출을 하면 정상적으로 작동하지 않는 문제가 있었다  
문자열을 비교하는 단에서 equals() 를 사용하는게 맞지만 ==을 사용해도 인텔리제이에서 알아서 비교를 해주었지만 프로그래머스는 정확한 문법을 필요로 하기때문에 코드가 실행되지 않았다 

==을 equals() 바꾸는것 만으로 해결되었다


# 후기
인텔리제이는 원래 똑똑하다고는 생각했지만 생각보다 더 똑똑한것 같다

