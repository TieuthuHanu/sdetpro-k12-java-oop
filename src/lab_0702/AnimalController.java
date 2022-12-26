package lab_0702;

import java.util.Arrays;
import java.util.List;

public class AnimalController {

    public static String resultRacing(List<Animal> animalList) {
        String winner = "";
        int max = animalList.get(0).getSpeed();

        for (Animal animal : animalList) {
            if (animal.getSpeed() > max) {
                max = animal.getSpeed();
                winner = animal.getName();
            }
        }
        return "The winner is " + winner;
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        Animal horse = new Horse("Horse");
        Animal tiger = new Tiger("Tiger");
        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        System.out.println(resultRacing(animalList));
    }
}
