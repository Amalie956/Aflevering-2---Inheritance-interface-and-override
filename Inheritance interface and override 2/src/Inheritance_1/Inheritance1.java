package Inheritance_1;

public class Inheritance1 {
    private String name;
    public static void inheritance1Exercise() {
        Laptop laptop = new Laptop("Dell", 16, false);
        SmartPhone smartPhone = new SmartPhone("Samsung", 6, true);
        System.out.println(laptop);
        System.out.println(smartPhone);

        System.out.println("");
    }

}
