package org.AnimalRescuer;

public class Dog extends Animal {

    private double height;

    @Override
    public void joy() {
        System.out.println(getName() + " wagging tail.");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
