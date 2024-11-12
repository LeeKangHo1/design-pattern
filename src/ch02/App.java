package ch02;

// main
public class App {
    public static void main(String[] args) {
        // 의존성이 없는 객체(생성 권한이 없는)들은 main에서 new로 생성 -> 스프링의 bean
        Doorman doorman = new Doorman();

        // 의존성 주입(매개변수로 Doorman을 받는다)
        DoormanProxy doormanProxy = new DoormanProxy(doorman);

        Animal cat = new Cat();
        Animal mouse = new Mouse();

        doormanProxy.쫓아내(cat);
        doormanProxy.쫓아내(mouse);
    }
}
