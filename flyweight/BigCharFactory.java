package flyweight;

public class BigCharFactory {
    private static BigCharFactory singleton = new BigCharFactory();

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charAt) {
        return null;
    }
}
