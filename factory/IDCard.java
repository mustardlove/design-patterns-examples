package factory;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("Make card for " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use card of " + owner);
    }

    public String getOwner() {
        return owner;
    }
}
