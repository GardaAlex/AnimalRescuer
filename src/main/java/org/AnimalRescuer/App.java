package org.AnimalRescuer;


import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args )
    {

        Adopter adopter = new Adopter();
        adopter.peopleName = "Mihai";
        adopter.moneyAmount = 100;

        Animal animal = new Animal();
        animal.petName = "Bichon";
        animal.age = 3.2;
        animal.health = 8;
        animal.hungryLevel = 10;
        animal.moodLevel = 7;
        animal.favoriteFood = "Pedigree";
        animal.favoriteActivity = "Playing fetch";

        AnimalFood food = new AnimalFood();
        food.foodName = "Pedigree";
        food.foodAmount = 30.5;
        food.foodPrice = 44;
        food.foodStock = true;
        food.expiryDate = LocalDateTime.of(2021,11,11,12,00);

        RecreationActivity activity = new RecreationActivity();
        activity.name = "Walking";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.vetName = "Alex";
        veterinarian.specialization = "Surgery";

        Game game = new Game();
        game.adopter = adopter;
        game.animal = animal;
        game.veterinarian = veterinarian;





    }
}
