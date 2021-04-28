package com.iteratrlearning.shu_book.chapter_02;

/*
* 37p
* [예제 2-10 논리 응집 예제]
*
* '파싱'이라는 논리로 그룹화되었다.
* 이 클래스는 여러 개의 책임을 갖게 되므로 SRP를 위배한다.
* 이 방법은 권장하지 않는다.
* */
public class BankStatementFullParser {

    BankTransaction parseFromCSV(final String line) {
        // ...
        throw new UnsupportedOperationException();
    }

    BankTransaction parseFromJSON(final String line) {
        // ...
        throw new UnsupportedOperationException();
    }

    BankTransaction parseFromXML(final String line) {
        // ...
        throw new UnsupportedOperationException();
    }
}
