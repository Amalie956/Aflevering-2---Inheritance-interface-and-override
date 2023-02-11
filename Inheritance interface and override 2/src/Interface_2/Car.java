package Interface_2;

public class Car implements Vehicle {
    private int gear;
    private int speed;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void changeGear(int a) {
        System.out.println("Bilen " + name +  " har sat sit gear på: " + (gear = a));
    }

    @Override
    public void speedUp(int a) {
        System.out.println("Farten på bilen " + name + " er på " + (speed = speed + a) + " km/t");
    }

    @Override
    public void applyBrakes(int a) {
        System.out.println("Farten kommer ned på " + (speed = speed - a) + " km/t efter " + name + " har bremset");
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
