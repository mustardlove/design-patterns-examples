package observer;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int startNumber;
    private int endNumber;
    private int increment;

    public IncrementalNumberGenerator(int startNumber, int endNumber, int increment) {
        this.number = startNumber;
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.increment = increment;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        number = startNumber;
        while (number < endNumber) {
            notifyObservers();
            number += increment;
        }
    }
}
