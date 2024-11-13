package ch04;

// SRP(Single Responsibility Principle, 단일 책임 원칙)
public class Doorman {

    // main 실행 전에 실행 -> static에 저장하면서 바로 heap에도 저장
    // static에 있는 내용은 단 1번만 실행 가능 -> 싱글톤
    static Doorman instance = new Doorman();

    // 기본 생성자 변경
    private Doorman() {}

    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName()+" 쫓아내");
    }
}
