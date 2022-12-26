package lab_08;

import lab_0702.Animal;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalFlyController {

    public static void result(List<AnimalWithFly> animalList) {
        List<AnimalWithFly> animalFlyableList = new ArrayList<>();
        for (AnimalWithFly animal : animalList) {
            if (animal.isFlyable())
                animalFlyableList.add(animal);
        }
        System.out.println(animalFlyableList);

        String winner = "";
        int max = animalFlyableList.get(0).getSpeed();

        for (AnimalWithFly animal : animalFlyableList) {
            if (animal.getSpeed() >= max) {
                max = animal.getSpeed();
                winner = animal.getName();
            }
        }
        System.out.println("The winner is " + winner);
    }

    public static void main(String[] args) {
        AnimalWithFly.Builder animalBuilder = new AnimalWithFly.Builder();
        AnimalWithFly eagle = animalBuilder
                .setName("Eagle")
                .setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(true)
                .build();

        AnimalWithFly falcon = animalBuilder
                .setName("Falcon")
                .setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(true)
                .build();

        AnimalWithFly tiger = animalBuilder
                .setName("Tiger")
                .setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(false)
                .build();

        AnimalWithFly snake = animalBuilder
                .setName("Snake")
                .setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(false)
                .build();

        List<AnimalWithFly> animalList = Arrays.asList(eagle, falcon, tiger, snake);
        System.out.println(animalList);
        result(animalList);
    }
}
