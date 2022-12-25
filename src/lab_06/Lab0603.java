package lab_06;

public class Lab0603 {

    public static void main(String[] args) {
        String myStr = "100 minutes";
        String digits = "";

        for (int index = 0; index < myStr.length(); index++) {
            char character = myStr.charAt(index);
            if (Character.isDigit(character))
                digits += character;
        }

        System.out.println(digits);
    }
}
