import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            out.print("\nEnter text to convert to ASCII banner, type [exit] to quit: ");
            String text = scanner.nextLine().trim();
            if (text.equalsIgnoreCase("exit")) {
                out.print("Are you sure you want to exit? [y/n]: ");
                String answer = scanner.nextLine().trim();
                if (answer.equalsIgnoreCase("y")) {
                    out.println("Bye");
                    break;
                }
            }

            if (text.isEmpty()) out.println("Error: Input text cannot be empty.");
            String banner = generateBanner(text);
            out.println("\nHere is your ASCII banner:\n");
            out.println(banner);
        }
    }

    private static String generateBanner(String text) {
        text = text.toUpperCase();
        int height = LettersDictionary.BLOCK_LETTERS.get('A').length;

        int totalWidth = text.chars()
                .mapToObj(c -> (char) c)
                .mapToInt(c -> LettersDictionary.BLOCK_LETTERS.getOrDefault(c,
                        LettersDictionary.BLOCK_LETTERS.get(' '))[0].length()).sum();

        int borderWidth = totalWidth + 2;
        String borderLine = "╔" + "═".repeat(borderWidth) + "╗";
        String emptyLine = "║" + " ".repeat(borderWidth) + "║";

        StringBuilder banner = new StringBuilder();

        banner.append(borderLine).append("\n");
        banner.append(emptyLine).append("\n");

        for (int line = 0; line < height; line++) {
            banner.append("║ ");
            for (char c : text.toCharArray()) {
                String[] letterLines = LettersDictionary.BLOCK_LETTERS
                        .getOrDefault(c, LettersDictionary.BLOCK_LETTERS.get(' '));
                banner.append(letterLines[line]);
            }
            banner.append(" ║\n");
        }

        banner.append(emptyLine).append("\n");
        banner.append("╚").append("═".repeat(borderWidth)).append("╝");

        return banner.toString();
    }
}
