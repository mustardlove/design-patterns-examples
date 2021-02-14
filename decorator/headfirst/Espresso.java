package decorator.headfirst;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
