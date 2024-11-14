package ch08;

import ch08.pub.Pub;
import ch08.sub.Sub1;
import ch08.sub.Sub2;
import ch08.sub.SubListener;

// 옵저버 패턴 -> 콜백
public class App {
    public static void main(String[] args) {
        // 1. 객체 생성 init
        Pub pub = new Pub();
        SubListener sub1 = new Sub1();
        SubListener sub2 = new Sub2();

        // 구독하기
        pub.add(sub1);
        pub.add(sub2);

        // 2. 마트에 상품 입고하는 스레드
        new Thread(() -> {
            try {
                // 10초 뒤 상품 입고
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            pub.income();
        }).start(); // start: os에 스레드 하나 대여

        // 3. 마트 스레드
        new Thread(() -> {

            while (true) {
                if(pub.value == null) {
                    System.out.println("상품 미입고..");
                } else {
                    pub.notifyChange(pub.value+ " 입고됨");
                    break; // 입고되면 멈춤
                }
                try {
                    // 1초마다 상품이 있는지 체크
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        // 총 스레드는 main까지 해서 3개

    } // main이 종료되도 프로그램 종료 x -> 스레드 1개라도 살아있으면 유지
}
