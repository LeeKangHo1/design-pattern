package ch04;

// main
public class App {
    public static void main(String[] args) {

        Doorman doorman = new Doorman();
        Animal cat = new Cat();
        Animal mouse = new Mouse();

        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
    }
}
