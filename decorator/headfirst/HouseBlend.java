package decorator.headfirst;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public double cost() {
        return .89;
    }
}
