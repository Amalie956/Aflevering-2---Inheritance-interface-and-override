package Interface_2;

public class Interface2 {
    public static void InterfaceExercise_2() {
        Car tesla = new Car("Tesla");
        tesla.changeGear(5);
        tesla.speedUp(10);
        tesla.applyBrakes(2);

        System.out.println("");

        Car volvo = new Car("Vovlo");
        volvo.changeGear(3);
        volvo.speedUp(5);
        volvo.applyBrakes(1);

        System.out.println("");
    }
}
