import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = input();
        String correctedWord = correct(input);
        System.out.println(correctedWord);
    }

    private static String correct(String input) {
        char[] letters = input.toCharArray();
        int numberOfLowerCaseLetters = 0;
        int numberOfUpperCaseLetters = 0;
        for (char letter : letters) {
            if (letter >= 'a' && letter <= 'z') {
                numberOfLowerCaseLetters++;
            } else {
                numberOfUpperCaseLetters++;
            }
        }

        String result;
        if (numberOfUpperCaseLetters > numberOfLowerCaseLetters) {
            result = input.toUpperCase();
        } else {
            result = input.toLowerCase();
        }

        return result;
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input = scanner.next();
        scanner.close();
        return input;
    }
}
