import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        // Menu items

        //
        //TODO Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc.
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        // TODO Set the price and the name for each -- "mocha", "latte", "drip coffee" and "cappuccino" (price is up to you!)

        item1.name = "mocha";
        item1.price = 3.5;
        item2.name = "latte";
        item2.price = 4.25;
        item3.name = "drip coffee";
        item3.price = 1.25;
        item4.name = "cappuccino";
        item4.price = 2.5;

        // TODO Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.\

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        // TODO Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".\
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        // TODO Print the order1 variable to the console to see what happens.
        System.out.println(order1);

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        // TODO Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;

        // TODO order3 ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // TODO order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        // TODO Cindhuri’s order is now ready. Update her status.
        order1.ready = true;

        // TODO Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        // TODO Jimmy’s order is now ready. Update his status.
        order2.ready = true
    }
}
