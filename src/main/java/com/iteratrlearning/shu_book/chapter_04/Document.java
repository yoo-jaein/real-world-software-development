package com.iteratrlearning.shu_book.chapter_04;

import java.util.Map;

/*
* 90p
* [예제 4-3 Document]
*
* 응용프로그램에 직접 Map<String, String>을 사용하지 않는 이유는 무엇일까?
* 개발자와 사용자 모두가 이해하는 공통된 언어를 사용하는 것이 유지보수하기에 좋기 때문이다.
* 그리고 Document와 같은 도메인 클래스를 이용하면 개념에 이름을 붙이고 동작과 값을 제한하므로 버그 발생 범위를 줄일 수 있다.
* */

// tag::document[]
public class Document {
    private final Map<String, String> attributes;

    Document(final Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getAttribute(final String attributeName) {
        return attributes.get(attributeName);
    }
}
// end::document[]
