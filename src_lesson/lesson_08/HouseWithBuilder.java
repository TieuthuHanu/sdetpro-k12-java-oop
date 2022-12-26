package lesson_08;

public class HouseWithBuilder {

    private int doorNum;
    private String topRoofColor;
    private String houseColor;

    public HouseWithBuilder() {
    }

    protected HouseWithBuilder(Builder builder) {
        doorNum = builder.doorNum;
        topRoofColor = builder.topRoofColor;
        houseColor = builder.houseColor;
    }

    // READ ONLY
    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    public String getHouseColor() {
        return houseColor;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "doorNum=" + doorNum +
                ", topRoofColor='" + topRoofColor + '\'' +
                ", houseColor='" + houseColor + '\'' +
                '}';
    }

    // Customer Service | Inner Class
    public static class Builder {
        private int doorNum;
        private String topRoofColor;
        private String houseColor;

        // WRITE ONLY
        public void setDoorNum(int doorNum) {
            this.doorNum = doorNum;
        }

        public void setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
        }

        public void setHouseColor(String houseColor) {
            this.houseColor = houseColor;
        }

        public HouseWithBuilder build() {
            return new HouseWithBuilder(this);
        }
    }
}
