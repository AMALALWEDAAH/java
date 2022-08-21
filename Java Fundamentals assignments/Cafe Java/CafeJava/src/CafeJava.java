public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripcoffeePrice = 10.5;
        double lattePrice = 5.5;
        double cappuccinoPrice = 6.5;



        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        // boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder1){
            System.out.println(displayTotalMessage+mochaPrice);
            System.out.println( customer1+ readyMessage);
        }else{
            System.out.println(displayTotalMessage+mochaPrice);
            System.out.println( customer1+ pendingMessage);
        }
        System.out.println("--------");
        ///////////////
        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Sam"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(displayTotalMessage+(dripcoffeePrice+dripcoffeePrice));
        System.out.println(displayTotalMessage+(dripcoffeePrice-lattePrice));
        
        if (isReadyOrder2){
            System.out.println( customer2+ readyMessage);
        }else{
            System.out.println( customer2+ pendingMessage);
        }
        System.out.println("--------");
        //////////////
        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Jimmy"
    	// ** Your customer interaction print statements will go here ** //
        double amount=dripcoffeePrice-lattePrice;
        if (amount>0){
            System.out.println(displayTotalMessage+lattePrice+" ,what you owe is $"+amount);
        }else{
            amount=0;
            System.out.println(displayTotalMessage+lattePrice);
        }
        
        System.out.println("--------");
        /////////////////
        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Noah"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder4){
            System.out.println( customer4+ readyMessage);
            System.out.println(displayTotalMessage+cappuccinoPrice);
        }else{
            System.out.println(displayTotalMessage+cappuccinoPrice);
        }
    }
}