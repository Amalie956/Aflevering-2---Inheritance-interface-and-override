package Interface_2;

public class Car implements Vehicle {
    private int gear;
    private int speed;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Bilen " + name +  " har sat sit gear på: " + gear);
    }

    @Override
    public void speedUp(int acceleration) {
        speed = speed + acceleration;
        System.out.println("Farten på bilen " + name + " er på " + speed + " km/t");
    }

    @Override
    public void applyBrakes(int deceleration) {
        speed = speed - deceleration;
        System.out.println("Farten kommer ned på " + speed + " km/t efter " + name + " har bremset");
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
