package Interface_1;

public class Sandwich implements FastFood {

    @Override
    public void isFoodReady() {
        System.out.println("Sandwichen er færdig");
    }

    @Override
    public boolean foodIsExpired() {
        return false;
    }
}
