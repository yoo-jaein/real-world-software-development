# chapter 06

## 클라이언트 서버 모델
- 다양한 환경의 사용자가 서로 통신하는 방법  
- 클라이언트 그룹은 서비스를 사용하는 그룹이고 서버는 관련 서비스를 제공하는 그룹이다.  

## 풀 기반
- pull-based  
- 점대점(point-to-point) 또는 요청 응답(request-response) 통신 형식  
- 클라이언트가 서버로 정보를 요청한다.  
- 대부분의 웹

## 푸시 기반
- push-based
- 리액티브(reactive) 또는 이벤트 주도(event-driven) 통신  
- 작성자(publisher)가 방출한 이벤트 스트림을 여러 구독자가 수신한다.  
- 일대일 통신뿐만 아니라 일대다 통신도 지원한다.  
- 여러 컴포넌트 간에 다양한 이벤트의 의사소통이 발생하는 상황에서 특히 유용하다.  

## 웹 소켓
- TCP 스트림으로 양방향 이벤트 통신을 지원하는 가벼운 통신 프로토콜  
- 웹 서버와 웹 브라우저 사이의 이벤트 주도 통신에 주로 사용된다.  

## 메시지 큐
- 그룹 내의 프로세스 중 한 프로세스가 전송된 메시지를 받아 처리하는 상호 프로세스 통신 방식이다.  

## 육각형 아키텍처
- 포트와 어댑터
- 포트와 어댑터의 목표는 응용프로그램의 코어와 특정 어댑터 구현의 결합을 제거하는 것이다.    
- 응용프로그램의 코어는 우리가 구현하는 비즈니스 로직이고, 다양한 구현은 코어 로직으로부터 분리되어 있다.  
- 코어와 분리하려는 특정 기술이 있다면 포트를 이용한다.  
- 외부 이벤트는 포트를 통해 코어로 전달된다.  
- 어댑터는 포트로 연결하는 특정 기술을 이용한 구현 코드다.  
- 정해진 규칙은 없으므로 개인적인 판단과 환경에 따라 분리하면 된다.  

## 암호화 해시 함수
- 임의의 길이의 문자열을 입력받아 다이제스트(digest)라는 출력으로 변환하는 기능이다.  
- Java 라이브러리 Bouncy Castle
- 사용자가 입력하지 않은 임의의 값인 솔트(salt)를 추가해 누군가 해싱을 되돌리는 기능을 만들지 못하게 막는다.  

## 상향식 소프트웨어 설계
- bottom-up  
- 응용프로그램의 코어(데이터 저장 모델이나 코어 도메인 객체 간의 관계) 설계에서 시작해 시스템 전체를 만드는 방법  

## 하향식 소프트웨어 설계
- top-down  
- 사용자 요구 사항이나 스토리에서 출발해 구현하는 데 필요한 동작이나 기능을 먼저 개발하고, 점차 저장소나 데이터 모델을 추가하는 방법  

## enum 형식
- 유효한 형식으로 구성된 미리 정의된 상숫값들의 목록  
- 안전한 형식과 좋은 문서화를 제공할 수 있다.  
- int 기반의 상태 코드와 비슷한 기능을 제공하지만 여러모로 더 낫다.  

## 목 만들기
- 모든 UI 어댑터는 메시지를 전송해 트웃이 발생했음을 알려야 한다. onTwoot 메소드가 호출되었는지 확인하는 테스트는 어떻게 구현할까?  
- 목 객체 개념을 이용해 문제를 해결할 수 있다.  
- 목 객체는 원래 객체가 제공하는 메소드와 공개 API를 모두 제공한다. 그리고 이를 이용해 특정 메소드가 실제 호출되었는지 확인(verify)한다.  
    ```java
    private final List<Twoot> receivedTwoots = new ArrayList<>();
    ...
    @Override
    public void onTwoot(final Twoot twoot) {
       receivedTwoots.add(twoot);
    }
    ...
    public void verifyOnTwoot(final Twoot twoot) {
       assertThat(receivedTwoots, contains(twoot));
    }
    ```

## Mockito
- Mockito 클래스에서 제공하는 정적 메소드를 임포트해서 사용한다.  
  ```java
  private final ReceiverEndPoint receiverEndPoint = mock(ReceiverEndPoint.class);
  ...
  verify(receiverEndPoint).onTwoot(aTwootObject);
  ```
- 다른 프레임워크에는 PowerMock, EasyMock  