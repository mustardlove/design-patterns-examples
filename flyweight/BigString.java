package flyweight;

public class BigString {
    private BigChar[] bigchars;

    public BigString(String string) {
    }

    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
