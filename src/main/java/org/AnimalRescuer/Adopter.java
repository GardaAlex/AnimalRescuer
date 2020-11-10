package org.AnimalRescuer;

public class Adopter {

    private String name;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void feed(Animal animal, AnimalFood animalFood){
        System.out.println(this.name + " just gave some " + animalFood.getName() + " food to " + animal.getName());

        double hungryLevel = animal.getHungryLevel();
        hungryLevel--;
        animal.setHungryLevel(hungryLevel);

        System.out.println(animal.getName() + "'s hunger level is now: " + animal.getHungryLevel());
    }

    public void activity(RecreationActivity activity, Animal animal){

        System.out.println(this.name + " will play some " + activity.getName() + " with " + animal.getName());

        animal.setMoodLevel(animal.getMoodLevel() + 1);

        System.out.println(animal.getName() + "'s happiness level is now: " + animal.getMoodLevel());
    }

}
