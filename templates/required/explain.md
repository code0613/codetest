# Java 과제

#### 1. 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?

 ``` java
int var1=5;
int var2=2;
double var3=var1/var2;
int var4=(int)(var3*var2);
System.out.println(var4);
```
var3에 var1/var2를 하는 과정에서 var1/var2를 double로 형변환 해주어야 한다

``` java
int var1=5;
int var2=2;
double va3=(double) var1/var2; // double 타입으로 형변환
int var4=(int)(var3*var2);
System.out.println(var4);
```
<br>

#### 2. 다음 코드를 실행했을 때 출력 결과는 무엇입니까? (증감연산자에 대해 알아보세요!)

``` java
int x=10;
int y=20;
int z = (++x) + (y--);
System.out.println(z);
```
++x는 y--와의 연산이 되기전에 x = x + 1 연산을 하고<br>
y--는 x++와의 연산이 된 후에 y = y - 1 연산을 한다<br>
z = (11) + (20) 이 되며 31이 출력된다.

#### while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
- 출력 예시
``` java
시작!
(3,6)
(2,6)
(1,4)
끝!
```


- 제출 코드
``` java
System.out.println("시작!");
boolean run = true;
while (run){
    int num1 = (int) (Math.random()*6+1);
    int num2 = (int) (Math.random()*6+1);
    if (num1+num2 ==5){
        run = false;
    }
    System.out.printf("(%d,%d)",num1,num2);
    System.out.println();
}
System.out.println("끝!");
```
java의 Math의 random()메소드는 0.0 이상의 1.0미만의 난수를 반환한다
Math.random()*n+a > n까지의 정수 중 a부터 시작하는 임의의 정수하나를 얻는다

- 출력
``` java
시작!
(1,3)
(4,2)
(4,5)
(4,3)
(3,6)
(4,6)
(1,4)
끝!
```