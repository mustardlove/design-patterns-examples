package proxy;

public class Printer implements Printable {
    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob("Creating Printer's instance " + name);
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return null;
    }

    @Override
    public void print(String msg) {
        System.out.println("=== " + name + " ===");
        System.out.println(msg);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(".");
        }
        System.out.println("Complete.");
    }
}
