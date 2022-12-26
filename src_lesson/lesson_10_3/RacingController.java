package lesson_10_3;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    public void flyableRacing(List<IFlyable> flyableAnimals) {
        flyableAnimals.get(0).flyable();
    }

    public void nonFlyableRacing(List<IMovable> nonFlyableAnimals) {

    }

    public static void main(String[] args) {
        Cat cat = new Cat("Meo", 25);
        Eagle eagle = new Eagle("Dieu Hau", 50);

        new RacingController().flyableRacing(Arrays.asList(eagle));
        new RacingController().flyableRacing(Arrays.asList(cat));
    }
}
