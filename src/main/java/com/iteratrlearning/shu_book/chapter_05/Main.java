package com.iteratrlearning.shu_book.chapter_05;

/*
* 127p
* [예제 5-15 지역 변수 형식 추론]
*
* var를 사용해도 가독성에 문제가 없다면 var를 사용하자.
*
* 138p
* [예제 5-30 RuleBuilder 사용]
*
* 복잡한 객체를 사용자 친화적인 API로 인스턴스화할 수 있게 돕는다.
* */

public class Main {

    public static void main(final String...args) {

        var env = new Facts();
        env.setFact("name", "Bob");
        env.setFact("jobTitle", "CEO");

        final var businessRuleEngine = new BusinessRuleEngine(env);

        final Rule ruleSendEmailToSalesWhenCEO =
                RuleBuilder
                  .when(facts -> "CEO".equals(facts.getFact("jobTitle")))
                  .then(facts -> {
            var name = facts.getFact("name");
            System.out.println("Relevant customer!!!: " + name);
        });

        businessRuleEngine.addRule(ruleSendEmailToSalesWhenCEO);
        businessRuleEngine.run();

    }
}
