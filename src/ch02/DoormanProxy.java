package ch02;

public class DoormanProxy {
    private Doorman doorman;

    public DoormanProxy(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫓아내(Animal animal) {
        System.out.println("안녕");
        doorman.쫓아내(animal);
    }
}