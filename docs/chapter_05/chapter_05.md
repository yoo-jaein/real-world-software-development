# chapter 05

## MVP 최소 기능 제품
- Minimum Viable Product  
- 고객의 피드백을 받아 최소한의 기능을 구현한 제품  

## TDD  
- Test-Driven Development  
- 테스트 코드를 먼저 만든 후, 이에 맞춰 코드를 구현하는 것이다.  

## TDD를 사용하는 이유  
- 필요하지 않은 테스트를 구현하는 일(오버엔지니어링)을 줄일 수 있다.  
- 테스트를 먼저 구현하면서 코드에 어떤 공개 인터페이스를 만들어야 하는지 신중히 검토하게 된다.  

## TDD 주기
1. 실패하는 테스트 구현  
2. 모든 테스트 실행  
3. 기능이 동작하도록 코드 구현  
4. 모든 테스트 실행  

## moking 모킹
- 메소드가 실행되었을 때 이를 확인하는 기법
- Java 모킹 라이브러리 mockito  

## mockito
1. 라이브러리 임포트  
    ```   
    import static org.mockito.Mockito.*;
    ```
2. 정적 메소드 mock()으로 필요한 목 객체를 만든다.  
    ```   
    final Action mockAction = mock(Action.class);
    ```  
3. verify() 메소드로 특정 메소드가 호출하는지 확인하는 어서션을 만든다.  
    ```   
    verify(mockAction).perform();
    ```  

## 다이아몬드 연산자  
- Java 7에서 추가된 기능이다.  
    ```
      Map<String, String> facts = new HashMap<>();
    ```

## 지역 변수 형식 추론
- Java 10은 지역 변수 형식 추론을 지원한다.  
- 형식 추론(type inference)이란 컴파일러가 정적 형식을 자동으로 추론해 결정하는 기능이다.  
- 형식 추론이 지역 변수까지 확장되어 적용된다.  
    ```  
    var env = new Facts();  
    var BusinessRuleEngine = new BusinessRuleEngine(env);
    ```  
- var를 사용해도 가독성에 문제가 없다면 var를 사용하고, 그렇지 않다면 사용하지 않는 것이 좋다.  

## 새로운 switch문  
- Java 12에서 새로운 switch문을 이용해 여러 개의 break문을 사용하지 않고도 폴스루를 방지할 수 있다.  
    ```
    var forecastedAmount = amount * switch (dealStage) {  
        case LEAD -> 0.2;  
        case EVALUATING -> 0.5;  
        case INTERESTED -> 0.8;  
        case CLOSED -> 1;  
    }  
    ```
- 새로운 switch를 이용하면 가독성이 좋아질 뿐만 아니라 모든 가능성을 확인하는 소모 검사도 이루어진다.  
- enum에 switch를 사용하면 자바 컴파일러가 모든 enum 값을 switch에서 소모했는지 확인해준다.  

## ISP 인터페이스 분리 원칙
- 큰 인터페이스를 응집력 있는 작은 인터페이스로 분리하면 사용자는 필요한 기능만 사용할 수 있다.
- SRP는 클래스가 한 개의 기능만 의무로 가져야 하며 클래스를 바꾸는 이유 역시 한 가지여야 한다는 설계 가이드라인이다. ISP와 비슷하지만 관점이 다르다. ISP는 설계가 아닌 사용자 인터페이스에 초점을 둔다.  
- ISP를 따르려면 현재의 개념을 독자적인 작은 개념으로 쪼개야 한다.  

## 플루언트 API
- 특정 문제를 더 직관적으로 해결할 수 있도록 특정 도메인에 맞춰진 API  
- Java Stream API, Spring Integration, jooq

## 빌더 패턴
- 단순하게 객체를 만드는 방법을 제공한다.  
- 생성자의 파라미터를 분해해서 각각의 파라미터를 받는 여러 메소드로 분리한다.  