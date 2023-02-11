package Interface_2;

public class Interface2 {
    public static void InterfaceExercise_2() {
        Car tesla = new Car("Tesla"); //Navn på bilen: Tesla
        tesla.changeGear(5); //Gear på 5
        tesla.speedUp(110); //Fart på 110 km/t
        tesla.applyBrakes(5); //Farten kommer ned på 105 km/t

        System.out.println("");

        Car volvo = new Car("Vovlo");
        volvo.changeGear(3);
        volvo.speedUp(130);
        volvo.applyBrakes(5);

        System.out.println("");
    }
}
