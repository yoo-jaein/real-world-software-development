package com.iteratrlearning.shu_book.chapter_05;

/*
* 137p
* [예제 5-29 규칙을 만드는 빌더 패턴]
*
* 빌더 패턴은 생성자의 파라미터를 분해해서 각각의 파라미터를 받는 여러 메소드로 분리한다.
* 각 메소드들은 연쇄적으로 연결되고 마지막 메소드인 then()에서 객체를 생성하게 된다.
* 사용자가 명시적으로 생성자를 호출하지 못하도록 생성자를 private으로 선언한다.
* 또한, when() 메소드를 정적 메소드로 만들어 사용자가 이 메소드를 호출하면 예전 생성자를 호출하도록 한다.
* */

public class RuleBuilder {
    private Condition condition;

    private RuleBuilder(Condition condition) {
        this.condition = condition;
    }

    public static RuleBuilder when(Condition condition) {
        return new RuleBuilder(condition);
    }

    public Rule then(Action action) {
        return new Rule(condition, action);
    }
}