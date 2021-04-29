package com.iteratrlearning.shu_book.chapter_03;

/*
* 53p
* [예제 3-4 BankTransactionFilter 인터페이스]
*
* Java 8 한 개 이상의 추상 메소드를 포함하는 인터페이스를 함수형 인터페이스라 부른다.
* @FunctionalInterface 어노테이션을 이용하면 의도를 명확하게 표현할 수 있다.
* */

@FunctionalInterface
public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
}