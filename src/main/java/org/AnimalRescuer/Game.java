package org.AnimalRescuer;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Adopter adopter;
    private Animal animal;
    private Veterinarian veterinarian;

    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationActivity[] availableActivities = new RecreationActivity[5];

    public List<AnimalFood> getAvailableFood() {
        return availableFood;
    }

    private void initAnimalFood(){
        AnimalFood dogFood = new AnimalFood("Dog Patrol");
        AnimalFood fishFood = new AnimalFood("Tetra");
        availableFood.add(dogFood);
        availableFood.add(fishFood);
    }

    private void initActivities() {
        RecreationActivity activity1 = new RecreationActivity("Running");
        RecreationActivity activity2 = new RecreationActivity("Cycling");
        availableActivities[0] = activity1;
        availableActivities[1] = activity2;
    }

    public void start() {
        initAnimalFood();
        initActivities();

        displayAvailableFood();
        displayAvailableActivities();
    }

    private void displayAvailableFood() {
        System.out.println("Available food:");
        for (AnimalFood food : availableFood) {
            if (food != null) {
                System.out.println(food.getName());
            }
        }
    }

    private void displayAvailableActivities() {
        System.out.println("Available activities:");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }
    }




    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }
}
