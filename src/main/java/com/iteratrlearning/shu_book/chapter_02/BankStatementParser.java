package com.iteratrlearning.shu_book.chapter_02;

import java.util.List;

/*
* 40p
* [예제 2-11 입출금 내역을 파싱하는 인터페이스 정의]
*
* 어떤 클래스가 다른 클래스에 의존할 때 인터페이스를 이용하여 결합도를 제거할 수 있다.
* 인터페이스를 이용하면 요구사항이 바뀌더라도 유연하게 대처할 수 있다.
* */
public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}
