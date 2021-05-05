package com.iteratrlearning.shu_book.chapter_05;

/*
* 118p
* [예제 5-2 Action 인터페이스]
*
* 도메인을 반영해 Action 인터페이스를 만들어 BusinessRuleEngine과의 구체적인 결합을 제거한다.
* Action 인터페이스는 한 개의 추상 메소드만 선언하므로 @FunctionalInterface 어노테이션을 추가할 수 있다.
* */

@FunctionalInterface
interface Action{
    void execute(Facts facts);
}
