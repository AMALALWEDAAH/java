import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    public ArrayList<Item> getMenu() {
        return menu;
    }
    
        public CoffeeKiosk() {
            this.menu=new ArrayList<>();
            this.orders= new ArrayList<>();
        }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addMenuItem (Item Item){
        menu.add(Item);
    }

    public void displayMenu(ArrayList<String> menu){
        System.out.println(menu);
        for(int i = 0;i<menu.size();i++){
            System.out.println(i+" "+menu.get(i));
        }

        
    }
}
