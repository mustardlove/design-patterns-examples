package factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Hong");
        Product card2 = factory.create("Lee");
        Product card3 = factory.create("Kang");
        card1.use();
        card2.use();
        card3.use();
    }
}
