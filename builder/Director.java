package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("In the morning and at noon");
        builder.makeItems(new String[] {
                "Good morning",
                "Hi",
        });
        builder.makeString("At night");
        builder.makeItems(new String[] {
                "Hello",
                "Good night",
                "Bye"
        });
        builder.close();
    }
}
