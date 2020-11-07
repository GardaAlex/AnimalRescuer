package org.AnimalRescuer;


import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args )
    {

        Adopter adopter = new Adopter();
        adopter.name = "Mihai";
        adopter.money = 100;

        Animal animal = new Animal();
        animal.name = "Bichon";
        animal.age = 3.2;
        animal.health = 8;
        animal.hungryLevel = 10;
        animal.moodLevel = 7;
        animal.favoriteFood = "Pedigree";
        animal.activity = "Playing fetch";

        AnimalFood food = new AnimalFood();
        food.name = "Pedigree";
        food.foodAmount = 30.5;
        food.price = 44;
        food.stock = true;
        food.expiryDate = LocalDateTime.of(2021,11,11,12,00);

        RecreationActivity activity = new RecreationActivity();
        activity.name = "Walking";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Alex";
        veterinarian.specialization = "Surgery";

        Game game = new Game();
        game.adopter = adopter;
        game.animal = animal;
        game.veterinarian = veterinarian;





    }
}
