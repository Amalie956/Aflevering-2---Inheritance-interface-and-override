package Inheritance_1;

public class SmartPhone extends Computer{
    //For a child class add at least 1 additional property
    private String ringTone;

    public SmartPhone(String brandName, int ScreenSize, boolean touchScreen) {
        super(brandName, ScreenSize, touchScreen);
    }

    //For a child class add 1 additional method
    public void ringSound(){

    }

}
