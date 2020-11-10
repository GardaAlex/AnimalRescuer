package org.AnimalRescuer;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private double age;
    private double health;
    private double hungryLevel;
    private double moodLevel;
    private String favoriteFood;
    private String activity;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(double hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public double getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(double moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void joy(){
        System.out.println(name + " is feeling positive");
    }

}
