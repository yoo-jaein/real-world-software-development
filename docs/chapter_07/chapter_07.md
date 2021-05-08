# chapter 07

## 저장소 패턴
- 도메인 로직과 저장소 백엔드 간의 인터페이스를 정의한다.  
- 각 클래스가 하나의 책임을 가지므로 유지보수성과 가독성이 좋아진다.  

## YAGNI
- You aren't gonna need it
- 미래에 사용할 것 같은 기능은 구현하지 말고 정말로 사용해야 할 때 그 기능을 구현해야 한다.  

## 함수형 프로그래밍  
- 메소드를 수학 함수처럼 취급하는 프로그래밍 형식
- Java 8 람다 표현식, 스트림 API, 컬렉터 API, Optional 클래스 등  

## 람다 표현식
- 익명 함수를 람다 표현식으로 줄여서 정의한다.  
- 인터페이스를 구현하는 객체 대신 코드 블록을 전달한다.  
```java
/**
 * 익명 클래스로 구현
 */
final ReceiverEndPoint anonymousClass = new ReceiverEndPoint() {
    @Override
    public void onTwoot(final Twoot twoot) {
        System.out.println(twoot.getSenderId() + ": " + twoot.getContent());
    }
};

/**
 * 람다 표현식으로 구현
 */
final ReceiverEndPoint lambda =
    twoot -> System.out.println(twoot.getSenderId() + ": " + twoot.getContent());
```

## 메소드 레퍼런스
- 클래스 이름::메소드 이름  
- 람다 표현식으로 메소드 선언을 대체했듯이 람다 표현식을 메소드 레퍼런스로 대체할 수 있다.  
```java
/**
 * 람다로 SenderEndPoint 생성
 */
(user, twootr) -> new SenderEndPoint(user, twootr)

/**
 * 메소드 레퍼런스로 SenderEndPoint 생성
 */
SenderEndPoint::new
```

## 실행 어라운드
- 함수형 디자인 패턴에서 자주 사용된다.  
- 공통 메소드를 추출해 중복되는 코드를 제거한다.  
