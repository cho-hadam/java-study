# 예외처리

예외란 프로그램에 문제가 있는 것을 말하며,
예외로 인해 시스템 동작이 멈추는 것을 예외처리라고 한다.

## Exception vs Error

`Exception`은 개발자가 대처할 수 있음   
`Error`는 개발자가 대처할 수 없음

## Exception

- Checked Exception   
예외처리를 반드시 해야하는 경우   
(네트워크, 파일 시스템 등)
  
- Unchecked Exception   
예외처리를 개발자의 판단에 맡기는 경우   
(데이터 오류 등)
  
하위 클래스
- NullPointerException
- ArrayIndexOutOfBoundException
- NumberFormatException 등

## try ~ catch

```java
try {
  // 예외가 발생할 수 있는 코드
} catch (Exception e) {
  // 예외가 발생했을 때 처리할 코드
} finally {
  // 예외 발생 여부와 상관없이 무조건 실행
}
```

## throws

예외 발생 시 예외 처리를 직접 하지 않고 호출한 곳으로 넘긴다.
