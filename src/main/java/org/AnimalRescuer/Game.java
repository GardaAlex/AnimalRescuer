package org.AnimalRescuer;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Adopter adopter;
    private Animal animal;
    private Veterinarian veterinarian;

    private List<AnimalFood> availableFood = new ArrayList<AnimalFood>() {
    };

    public List<AnimalFood> getAvailableFood() {
        return availableFood;
    }

    private void initFood(){
        AnimalFood dogFood = new AnimalFood("Fiskars");
        availableFood.add(dogFood);

    }

    private RecreationActivity[] availableActivities = new RecreationActivity[5];

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
