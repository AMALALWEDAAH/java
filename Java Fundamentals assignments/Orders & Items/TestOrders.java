import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name="mocha";
        item1.price=10.0;

        Item item2 = new Item();
        item2.name="latte";
        item2.price=11.1;

        Item item3 = new Item();
        item3.name="drip coffee";
        item3.price=12.2;

        Item item4 = new Item();
        item4.name="capuccino";
        item4.price=13.3;

        ArrayList<Item> items =new ArrayList<Item>();
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name="Cindhuri";
        order1.total=0.0;
        order1.ready=true;
        
        
        Order order2 = new Order();
        order2.name="Jimmy";
        order2.total=item2.price;
        order2.ready=true;
        items.add(item1);

        Order order3 = new Order();
        order3.name="Noah";
        order3.total=item4.price;
        order3.ready=false;
        items.add(item4);


        Order order4 = new Order();
        order4.name="Sam";
        order4.total=item2.price*3;
        order4.ready=false;
        items.add(item2);


        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}