package lesson_08;

public class TestHouseWithBuilder {

    public static void main(String[] args) {
        /* Remove HouseWithBuilder in HouseWithBuilder.Builder :
         *  import static lesson_08.HouseWithBuilder.Builder;
         *  it becomes : Builder builder = new Builder();
         */
        HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();
        builder.setDoorNum(2);
        builder.setTopRoofColor("Yellow");
        builder.setHouseColor("Blue");
        HouseWithBuilder house = builder.build();

        System.out.println(house);
    }
}
