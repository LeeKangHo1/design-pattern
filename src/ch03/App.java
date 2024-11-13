package ch03;

// main
public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        OuterTiger outerTiger = new OuterTiger();
        TigerAdapter ta = new TigerAdapter(outerTiger);

        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
        doorman.쫓아내(ta);
    }
}
