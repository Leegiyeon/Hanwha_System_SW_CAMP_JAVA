package com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {

        A_for aClass = new A_for();

        /* 필기. 단독 for문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleForStatement();

        /* 필기. 반복문을 사용하는 예제(반복문 필요성) */
//        aClass.testForExample1();
//        aClass.testForExample2();


        B_nestedFor bClass = new B_nestedFor();
        /* 필기. 중첨반복문 사용 */
//        bClass.printGugudanFromTwoNine();
//        bClass.printUpgradeGugudanFromTwoNine();(

        /* 필기. 별찍기 */
//        bClass.printStars();

        /* 필기. while문 사용 */
        C_while cClass = new C_while();
//        cClass.testSimpleWhileStatement();
//        cClass.testWhileExample();

        /* 필기. do-while문 사용 */
        D_doWhile dClass = new D_doWhile();
//        dClass.testSimpleDoWhileStatement();
        dClass.testDoWhileExample();





    }
}
