interface RestaurantEmployee {
    // Interface segmented principle example.
    void washDishes();
    void serveCustomers();
    void cookFood();
}
class waiter implements RestaurantEmployee{
    public void washDishes(){
        // no use!
    }
    public void serveCustomers(){
        // only must implement
    }
    public void cookFood(){
        // no use! here
    }
}
/// ////////////////////////////
// instead make other interface
interface WaiterInterface{
    void serveCustomers();
    void takeOrders();
}
interface ChefInterface{
    void cookFood();
    void decideMenu();
}
class Waiter1 implements WaiterInterface{
    @Override
    public void serveCustomers() {

    }
    @Override
    public void takeOrders() {

    }
}
