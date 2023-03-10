package Interface_1;

import java.util.ArrayList;

public class Interface1 {
    public static void InterfaceExercise_1(){
        //Add some different Fastfood objects to an array.
        ArrayList<FastFood> fastFoodObjects = new ArrayList<FastFood>();
        FastFood sandwich = new Sandwich();
        FastFood pizza = new Pizza();
        FastFood burger = new Burger();
        fastFoodObjects.add(sandwich);
        fastFoodObjects.add(pizza);
        fastFoodObjects.add(burger);

        //Now iterate through that array and use some of the methods you have created above.
        for (int i = 0; i < fastFoodObjects.size(); i++) { //Man bruger size() metoden til at få alle elementerne i arraylisten printet ud
            fastFoodObjects.get(i).isFoodReady();
            System.out.println("Er maden udløbet?: " + fastFoodObjects.get(i).foodIsExpired());
            System.out.println("");
        }
    }
}
