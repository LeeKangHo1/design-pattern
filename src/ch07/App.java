package ch07;

import ch07.pub.Pub;
import ch07.pub.PubListener;
import ch07.sub.Sub1;
import ch07.sub.Sub2;
import ch07.sub.SubListener;

// 옵저버 패턴 -> 콜백(구독자가 구독(콜)을 하면 나중에 영상이 올라올 경우 백(알림))
public class App {
    public static void main(String[] args) {
        // 1. 객체 생성 init (필요한 객체를 모두 메모리에 로드)
        PubListener pub = new Pub();
        SubListener sub1 = new Sub1();
        SubListener sub2 = new Sub2();

        // 2. 구독하기
        pub.add(sub1);
        pub.add(sub2);

        // 3. 상품 들어옴 (가정)

        // 4. nitifyChange 호출(영상이 올라왔을 때)
        pub.notifyChange("상품 들어왔어!!");
    }
}
