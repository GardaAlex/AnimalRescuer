package org.AnimalRescuer;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Adopter adopter;
    private Animal animal;
    private Veterinarian veterinarian;

    private AnimalFood[] foodtype = new AnimalFood[5];

    public AnimalFood[] getFood() {
        return foodtype;
    }
    public void insertFood(int index, AnimalFood food){
        foodtype[index] = food;
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
