package ch01;

// SRP(Single Responsibility Principle, 단일 책임 원칙)
// (클래스 당 1개의 책임을 권장, 설계에 따라 아닐수도 있다.)
public class Doorman {

    // DIP(Dependency Inversion Principle, 의존성 역전 원칙)
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName()+" 쫓아내");
    }
}
