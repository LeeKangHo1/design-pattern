package ch02;

// SRP(Single Responsibility Principle, 단일 책임 원칙)
public class Doorman {

    // DIP(Dependency Inversion Principle, 의존성 역전 원칙)
    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName()+" 쫓아내");
    }
}
