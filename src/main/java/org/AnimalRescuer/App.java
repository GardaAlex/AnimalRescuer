package org.AnimalRescuer;


import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args )
    {

        Adopter adopter = new Adopter();
        adopter.setName("Mihai");
        adopter.setMoney(100);

        Animal animal = new Animal();
        animal.setName("Bichon");
        animal.setAge(2.3);
        animal.setHealth(8);
        animal.setHungryLevel(8);
        animal.setMoodLevel(9);
        animal.setFavoriteFood("Ciocolata");
        animal.setActivity("Playing fetch");

        RecreationActivity activity = new RecreationActivity("ball throwing");

        AnimalFood food = new AnimalFood("Purr");
        food.setFoodAmount(25.3);
        food.setPrice(44);
        food.setStock(true);
        food.setExpiryDate(LocalDateTime.of(2021,11,11,12,00));


        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Alex");
        veterinarian.setSpecialization("Surgery");

        Game game = new Game();
        game.setAdopter(adopter);
        game.setAnimal(animal);
        game.setVeterinarian(veterinarian);

        game.start();

        adopter.feed(animal, food);
        adopter.activity(activity, animal);

        Animal dog = new Dog();
        dog.setName("Cookie");
        dog.joy();

        Animal fish = new Fish();
        fish.setName("Pluto");
        fish.joy();



    }
}
