package ch03;

// SRP(Single Responsibility Principle, 단일 책임 원칙)
public class Doorman {

    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName()+" 쫓아내");
    }
}
