package memento;

import java.util.*;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();

    private static String[] friutsname = {
            "사과", "포도", "바나나", "귤",
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("money increased.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("money became half.");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("got fruit(" + f + ").");
            fruits.add(f);
        } else {
            System.out.println("nothing changed");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String) it.next();
            if (f.startsWith("delicious")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money =" + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "delicious ";
        }
        return prefix + friutsname[random.nextInt(friutsname.length)];
    }
}
