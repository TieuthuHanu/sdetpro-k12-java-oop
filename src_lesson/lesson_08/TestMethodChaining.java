package lesson_08;

public class TestMethodChaining {

    public static void main(String[] args) {
        MethodChaining.Builder builder = new MethodChaining.Builder();
        MethodChaining house = builder
                .setDoorNum(3)
                .setTopRoofColor("Red")
                .setHouseColor("Purple")
                .build();

        System.out.println(house);
    }
}
