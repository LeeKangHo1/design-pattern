package ch04;

// SRP(Single Responsibility Principle, 단일 책임 원칙)
public class Doorman {

    Doorman instance = new Doorman();

    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName()+" 쫓아내");
    }
}
