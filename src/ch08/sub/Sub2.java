package ch08.sub;

public class Sub2 implements SubListener {

    @Override
    public void update(String msg) {
        System.out.println("sub2이 받은 알림 : " + msg);
    }
}
