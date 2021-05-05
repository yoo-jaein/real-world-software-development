package com.iteratrlearning.shu_book.chapter_05;

/*
* 130p
* [예제 5-20 폴스루를 방지하는 switch문]
*
* Java 12에서 제공하는 새로운 switch문을 이용해 break문을 사용하지 않고도 폴스루를 방지할 수 있다.
* 가독성이 좋아질 뿐만 아니라 모든 가능성을 확인하는 소모 검사도 이루어진다.
* 만약 CLOSED를 처리하지 않으면 자바 컴파일러에서 오류가 발생한다.
* */

public class SwitchExpressions {

    public static void main(String[] args) {
        var dealStage = Stage.LEAD;
        var amount = 10;

        var forecastedAmount = amount * switch (dealStage) {
            case LEAD -> 0.2;
            case EVALUATING -> 0.5;
            case INTERESTED -> 0.8;
            case CLOSED -> 1;
        };

        System.out.println(forecastedAmount);
    }
}
