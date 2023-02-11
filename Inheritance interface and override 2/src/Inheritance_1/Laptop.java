package Inheritance_1;

import javax.swing.plaf.synth.ColorType;

public class Laptop extends Computer {
    //For a child class add at least 1 additional property
    private String laptopColor;

    public Laptop(String brandName, int ScreenSize, boolean touchScreen) {
        super(brandName, ScreenSize, touchScreen);
    }

    //For a child class add 1 additional method
    public void soundWhenTurnOn() {

    }

}
