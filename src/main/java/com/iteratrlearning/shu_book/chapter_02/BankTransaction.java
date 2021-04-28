package com.iteratrlearning.shu_book.chapter_02;

import java.time.LocalDate;
import java.util.Objects;

/*
* 29p
* [예제 2-4 입출금 내역 도메인 클래스]
*
* 입출금 내역을 표현하는 도메인 클래스이다.
* 도메인은 비즈니스 문제와 동일한 단어와 용어를 사용한다는 의미다.
* */
public class BankTransaction {
    private final LocalDate date;
    private final double amount;
    private final String description;


    public BankTransaction(final LocalDate date, final double amount, final String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(that.amount, amount) == 0 &&
                date.equals(that.date) &&
                description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, description);
    }


}