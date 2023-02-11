import Inheritance_1.Inheritance1;
import Interface_1.Interface1;
import Interface_2.Interface2;
import Override.Override1;

public class Main {
    public static void main(String[] args) {
        //Inheritance 1 - In the main method create a Laptop and a SmartPhone
        Inheritance1.inheritance1Exercise();

        //Interface 1 - Add some different Fastfood objects to an array. Now iterate through that array and use some of the methods you have created above.
        Interface1.InterfaceExercise_1();

        //Interface 2 - Create a class that implements the following interface. Now create two objects using the class created
        Interface2.InterfaceExercise_2();

        //Override - In the Main class, create an instance of each class and call the play method on each
        Override1.OverrideExercise();
    }
}