package proxy;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("Name: " + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("Name: " + p.getPrinterName());
        p.print("Hello, world");
    }
}
