package ch03;

// main
public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        Animal cat = new Cat();
        Animal mouse = new Mouse();

        OuterTiger outerTiger = new OuterTiger();
        Animal ta = new TigerAdapter(outerTiger);

        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
        doorman.쫓아내(ta);
    }
}
