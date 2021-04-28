package com.iteratrlearning.shu_book.chapter_02;

import java.time.LocalDate;

/*
* 36p
* [예제 2-9 정보 응집 예제]
*
* 동일한 데이터나 도메인 객체를 처리하는 메소드들이 그룹화되었다.
* BankTransaction 객체를 CRUD하는 기능을 제공하는 클래스다.
* 이 유형은 특정 도메인 객체를 저장하는 데이터베이스와 상호작용할 때 흔히 볼 수 있다.
* 이 패턴을 보통 데이터 접근 객체(DAO)라 부른다.
* */
public class BankStatementDAO {

    public BankTransaction create(final LocalDate date, final double amount, final String description) {
        // ...
        throw new UnsupportedOperationException();
    }

    public BankTransaction read(final long id) {
        // ...
        throw new UnsupportedOperationException();
    }

    public BankTransaction update(final long id) {
        // ...
        throw new UnsupportedOperationException();
    }

    public void delete(final BankTransaction bankTransaction) {
        // ...
        throw new UnsupportedOperationException();
    }
}
