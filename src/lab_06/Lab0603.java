package lab_06;

public class Lab0603 {

    public static void main(String[] args) {
        String myStr = "100 minutes";
        String digitsOutput = "";

        for (char character: myStr.toCharArray()) {
            if (Character.isDigit(character))
                digitsOutput += character;
        }

        System.out.println(digitsOutput);
    }
}
