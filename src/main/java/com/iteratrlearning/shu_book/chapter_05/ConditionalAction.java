package com.iteratrlearning.shu_book.chapter_05;

/*
* 131p
* [예제 5-22 ConditionalAction 인터페이스]
*
* ISP를 위반한다. InspectorTest 참고.
* Condition, Action처럼 도메인과 가까운 이름을 사용하도록 작은 개념으로 쪼개야 한다.
* */

public interface ConditionalAction {
    void perform(Facts facts);
    boolean evaluate(Facts facts);
}
