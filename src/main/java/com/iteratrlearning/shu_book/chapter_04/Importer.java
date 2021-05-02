package com.iteratrlearning.shu_book.chapter_04;

import java.io.File;
import java.io.IOException;

/*
* 89p
* [예제 4-2 Importer]
*
* 문서 임포트 기능을 하나의 메소드로 구현한다면 switch문을 사용하게 된다.
* switch문으로 문제를 해결할 수 있지만 확장성이 부족하다.
* 다른 종류의 파일을 추가할 때마다 switch문에 다른 항목을 추가해 구현해야 하기 때문이다.
* 따라서 다양한 종류의 문서 임포트를 지원하도록 Importer 인터페이스를 정의하고,
* Importer 인터페이스를 구현하는 각 클래스가 다양한 종류의 파일을 임포트하도록 만드는 것이 좋다.
* */

// tag::importer[]
interface Importer {
    Document importFile(File file) throws IOException;
}
// end::importer[]
