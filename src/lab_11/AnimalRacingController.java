package lab_11;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AnimalRacingController {

    public static void getWinner(List<Animal> animalList) {
        List<Animal> nonFlyList = new ArrayList<>();
        for (Animal animal : animalList) {
            if(!animal.flyable())
                nonFlyList.add(animal);
        }

        // Get the winner
        int maxSpeed = 0;
        String winner = "";
        for (Animal animal : nonFlyList) {
            if (animal.getSpeed() > maxSpeed) {
                maxSpeed = animal.getSpeed();
                winner = animal.getName();
            }
        }
        System.out.println("The winner is " + winner);
    }

    public static void main(String[] args) {
        Animal horse = new Dog("Horse");
        Animal tiger = new Dog("Tiger");
        Animal dog = new Dog("Dog");
        Animal falcon = new Dog("Falcon");
        Animal eagle = new Dog("Eagle");

        List<Animal> animalList = Arrays.asList(horse, tiger, dog, falcon, eagle);
        System.out.println(animalList);
        getWinner(animalList);
    }
}
