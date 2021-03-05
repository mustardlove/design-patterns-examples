package memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("=====" + i);
            System.out.println("state: " + gamer);

            gamer.bet();

            System.out.println("money became " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("Increased a lot! Let's save current state");
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("Decreased a lot! Let's restore to previous state");
                gamer.restoreMemento(memento);
            } else {
                System.out.println("No action performed!");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
