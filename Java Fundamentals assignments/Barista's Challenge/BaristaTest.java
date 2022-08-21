import java.util.ArrayList;
public class  BaristaTest {
    public static void main(String[] args) {
    Item Item1 = new Item("drip coffee", 3.5);
    Item Item2 = new Item("cappuccino", 1.5);
    Item Item3 = new Item("latte", 4.0);
    Item Item4 = new Item("mocha", 4.5);

    
    Order Order1 = new Order();
    Order Order2 = new Order();
    
    Order Order3 = new Order("Cindhuri");
    Order Order4 = new Order("Jimmy");
    Order Order5 = new Order("Noah");
    
    Order2.addItem(Item2);
    Order2.addItem(Item2);

    System.out.println(Order3.getStatusMessage());

    Order2.setReady(true);
    System.out.println(Order2.getOrderTotal());


    Order3.addItem(Item1);
    Order4.addItem(Item2);
    Order5.addItem(Item3);

    Order2.display();
}
}