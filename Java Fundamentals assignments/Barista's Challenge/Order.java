import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items;// defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    
    public Order(){
        this.name="Guest";
        this.items = new ArrayList();
        this.ready = false;
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    public Order(String name){
        this.name=name;
        this.items = new ArrayList();//or use method getItems()
        this.ready = false;
        // System.out.println("Customer Name: "+name);
    }
    
    // public ArrayList<Item> getItems(){
    //     return items;
    //   }

    // ORDER METHODS
    

    public void addItem(Item Item){
        items.add(Item);
    }

    public String getStatusMessage(){
        if (this.ready == true){
            return"Thank you for waiting. Your order will be ready soon.";
        }else{
            return"Your order is ready.";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("Customer Name: %s", this.name);
        for(Item i: this.items) {
            System.out.println(" "+i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS
     // getter
    public String getOrder() {
        return name;
    }
    // setter
    public void setOrder(String name) {
        this.name=name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

}

