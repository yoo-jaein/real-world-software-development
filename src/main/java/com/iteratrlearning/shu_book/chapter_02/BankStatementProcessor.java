package com.iteratrlearning.shu_book.chapter_02;

import java.time.Month;
import java.util.List;

/*
* 33p
* [예제 2-7 BankStatementProcessor 클래스의 계산 연산 그룹화]
*
* 기존에 다른 클래스에 정의된 계산 관련 작업들을 별도의 클래스로 추출했다.
* 모든 연산에서 BankTransactions를 공유하므로 이를 클래스의 필드로 만든다.
* 이 방법으로 메소드 시그니처는 훨씬 단순해지고 응집도도 높아졌다.
* */
public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (final BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }
        return total;
    }

    public double calculateTotalInMonth(final Month month) {
        double total = 0;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month) {

                total += bankTransaction.getAmount();
            }
        }
        return total;
    }

    public double calculateTotalForCategory(final String category) {
        double total = 0;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDescription().equals(category)) {
                total += bankTransaction.getAmount();
            }
        }
        return total;
    }
}
