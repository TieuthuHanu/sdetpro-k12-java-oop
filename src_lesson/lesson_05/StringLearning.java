package lesson_05;

import java.util.Arrays;

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
        String badWord = "   bad, very bad, sth else, bad   ";
        String filteredStr = badWord.replace("bad", "b**");
        System.out.println(badWord); //    bad, very bad, sth else, bad
        System.out.println(filteredStr); //    b**, very b**, sth else, b**

        // Trim
        System.out.println(badWord.trim()); // bad, very bad, sth else, bad

        // indexOf
        String url = "https://google.com";
        System.out.println(url.length()); // 18
        System.out.println(url.indexOf("http")); // 0
        System.out.println(url.indexOf("http_")); // -1

        // substring
        System.out.println(url.substring(0, 3)); // htt
        System.out.println(url.substring(2, url.length())); // tps://google.com
        System.out.println(url.substring(2)); // tps://google.com

        // split
        String[] splits = url.split("://");
        System.out.println(Arrays.toString(splits)); // [https, google.com]

        // Regex | Regular Expression
        String myCookingTimes = "   185 mins   ";
        String numberTimesStr = myCookingTimes.replaceAll("[^0-9]", "");
        System.out.println(numberTimesStr); // 185 : String

        int numberTimes = Integer.parseInt(numberTimesStr); // 185: int

        System.out.println(numberTimes + 1); // 186
        System.out.println("" + numberTimes + 1); // 1851

        // Concatenation
        String s1 = "Hello, ";
        String s2 = "Nhu";
        System.out.println(s1 + s2 + "!!!"); // Hello, Nhu!!!
        System.out.println(s1.concat(s2).concat("!") + "!!"); // Hello, Nhu!!!

        // StringBuilder

    }
}
