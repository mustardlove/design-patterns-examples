package decorator.headfirst;

public abstract class Beverage {
    public enum Size {
        TALL,
        GRANDE,
        VENTI
    }

    String description = "Unknown Beverage";
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract Size getSize();

    public abstract double cost();
}
