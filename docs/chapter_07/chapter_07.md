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

## 스트림
### map()
- 어떤 형식의 값을 포함하는 스트림을 다른 형식의 값 스트림으로 변환할 때 활용  

### forEach()
- 스트림의 값에 부작용을 일으키는 작업을 수행할 때 활용  

### filter()
- 어떤 데이터를 반복하면서 각 요소에 if문을 적용하는 상황에 활용  

### reduce()
- 전체 리스트를 한 개의 값으로 줄이는 상황에 활용  

## Optional
- null을 대신하도록 Java 8에서 추가된 코어 자바 라이브러리 데이터 형식  
- 버그를 피하기 위해 변수의 값이 있는지 개발자가 확인하도록 장려한다.  
- 클래스의 API에서 값이 없을 수 있다는 사실을 Optional 자체로 문서화한다.  

## 의존관계 역전  
- 높은 수준의 모듈은 낮은 수준의 모듈에 의존하지 않아야 한다. 두 모듈 모두 추상화에 의존해야 한다.  
- 추상화는 세부 사항에 의존하지 않아야 한다. 세부 사항은 추상화에 의존해야 한다.