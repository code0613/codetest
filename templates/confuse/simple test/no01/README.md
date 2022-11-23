# 모의고사 01
## 설명 
- 항해 1일 차 부터 언제 수료를 하게될 지 궁금하다.
- 항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자
- 
## 제한 조건
- 1 <= month <= 12
- 1 <= day <= 31 (2월은 28로 고정합니다, 즉 윤일은 고려하지 않습니다)

``` java
import java.time.LocalDate;

public class test01 {
    public String sol(int month, int day){
        String answer = "";
        LocalDate date = LocalDate.of(2022,month,day);
        LocalDate date1 = date.plusDays(98);

        answer = date1.getMonthValue() + "월" + " "+ date1.getDayOfMonth() + "일";

        return answer;
    }
```
## 문제점
LocalDate를 import해서 사용했다

LocalDate는 년월일을 입력해주면 알아서 다 해준다

내장 메소드 plusDays만 입력해주면 알아서 다 해준다

~~그냥 다 해준다~~

# 후기
for문과 if문, list를 사용해서 풀려고 했지만 손에 잡히지 않아서 바로 방향을 틀었다

확실히 가능 하겠지만 코드도 길어지고 복잡하고 여러가지...

물론 LocalDate를 사용하지 않고 푼다면 더 좋을 것 같긴 하다