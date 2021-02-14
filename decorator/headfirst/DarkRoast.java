package decorator.headfirst;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public double cost() {
        return .99;
    }
}
