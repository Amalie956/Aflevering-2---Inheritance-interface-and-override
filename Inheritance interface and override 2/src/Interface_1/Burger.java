package Interface_1;

public class Burger implements FastFood {


    @Override
    public void isFoodReady() {
        System.out.println("Burgen er færdig");
    }

    @Override
    public boolean foodIsExpired() {
        return false;
    }
}
