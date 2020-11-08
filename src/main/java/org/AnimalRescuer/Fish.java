package org.AnimalRescuer;

public class Fish extends Animal {

    private int fins;

    @Override
    public void joy() {
        System.out.println(getName() + " is swiming.  ");
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }


}
