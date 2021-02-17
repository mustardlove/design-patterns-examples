package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.ListFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("JoongAng", "http://www.joins.com/");
        Link chosun = factory.createLink("Chosun", "http://www.chosum.com/");

        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("Newspaper");
        traynews.add(joins);
        traynews.add(chosun);

        Tray traysearch = factory.createTray("Search Engine");
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "Dot");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
