package strategy;

public class Main {
    public static void main(String[] args) {
//        String[] data = { "Hello", "World", "I", "Am", "Hungry" };
        Integer[] data = { 10, 8, 5, 7, 11, 2, 3, 9, 12 };
        SortAndPrint sap = new SortAndPrint(data, new InsertSorter());
        sap.execute();
    }
}
