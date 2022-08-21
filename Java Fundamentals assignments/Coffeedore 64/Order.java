import java.util.ArrayList;
public class Order {
    public String name;
    public double total;
    public boolean ready;
    
    public Order(String name,double total,boolean ready){
        this.name=name;
        this.total=total;
        this.ready=ready;
    }
    public void displayMenu(ArrayList<Item> items){
        for(int i = 0;i<items.size();i++){
            System.out.println(i+" "+items.get(i));
        }
    }
}