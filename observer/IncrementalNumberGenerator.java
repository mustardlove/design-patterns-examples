package observer;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int endNumber;
    private int increment;

    public IncrementalNumberGenerator(int startNumber, int endNumber, int increment) {
        this.number = startNumber;
        this.endNumber = endNumber;
        this.increment = increment;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (number < endNumber) {
            notifyObservers();
            number += increment;
        }
    }
}
