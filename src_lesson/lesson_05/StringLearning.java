package lesson_05;

public class StringLearning {

    public static void main(String[] args) {

        // Check digit, lower case, upper case
        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();
        int totalDigits = 0;
        int totalLowerCases = 0;
        int totalUpperCases = 0;

        for (char character : myCharacters) {
            if (Character.isDigit(character)) totalDigits++;
            else if (Character.isLowerCase(character)) totalLowerCases++;
            else if (Character.isUpperCase(character)) totalUpperCases++;
        }

        if (totalDigits > 0 && totalLowerCases > 0 && totalUpperCases > 0)
            System.out.println("You are all set!");
        else
            System.out.println("Invalid!");

        // Replacement | Immutable
        String badWord = "bad, very bad, sth else, bad";
        String filteredStr = badWord.replace("bad", "b**");
        System.out.println(badWord);
        System.out.println(filteredStr);
    }
}
