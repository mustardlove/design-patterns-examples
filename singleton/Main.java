package singleton;

public class Main {
    public static void main(String[] args) {
        TicketMaker t1 = TicketMaker.getInstance();
        TicketMaker t2 = TicketMaker.getInstance();
        int n1 = t1.getNextTicketNumber();
        int n2 = t2.getNextTicketNumber();
        int n3 = t1.getNextTicketNumber();
        int n4 = t2.getNextTicketNumber();
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }
}
