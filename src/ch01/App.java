package ch01;

// main을 가지는 파일
public class App {
    public static void main(String[] args) {
        // 의존성이 없는 객체(생성 권한이 없는)들은 main에서 new로 생성 -> 스프링의 bean
        Doorman doorman = new Doorman();
        Animal cat = new Cat();
        Animal mouse = new Mouse();

        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
    }
}
