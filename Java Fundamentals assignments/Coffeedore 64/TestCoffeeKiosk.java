import java.util.ArrayList;
public class TestCoffeeKiosk {
    public static void main(String[] args) {
    CoffeeKiosk CoffeeKiosk=new CoffeeKiosk();
    Item Item1 = new Item("drip coffee", 3.5);
    Item Item2 = new Item("cappuccino", 1.5);
    Item Item3 = new Item("latte", 4.0);
    Item Item4 = new Item("mocha", 4.5);

    ArrayList<String> menu = new ArrayList<String>();
    CoffeeKiosk.displayMenu(menu);
    System.out.println(Item1.getName());
    }
}
