package Interface_1;

public class Pizza implements FastFood {
    @Override
    public void isFoodReady() {
        System.out.println("Pizzaen er færdig");
    }

    @Override
    public boolean foodIsExpired() {
        return true;
    }
}
