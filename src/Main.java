import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // Mapping for ASCII block letters
    private static final Map<Character, String[]> BLOCK_LETTERS = new HashMap<>();

    // Initialize the block letters patterns
    static {
        // Letter A
        BLOCK_LETTERS.put('A', new String[]{
                " █████╗ ",
                "██╔══██╗",
                "███████║",
                "██╔══██║",
                "██║  ██║",
                "╚═╝  ╚═╝"
        });

        // Letter B
        BLOCK_LETTERS.put('B', new String[]{
                "██████╗ ",
                "██╔══██╗",
                "██████╔╝",
                "██╔══██╗",
                "██████╔╝",
                "╚═════╝ "
        });

        // Letter C
        BLOCK_LETTERS.put('C', new String[]{
                " ██████╗",
                "██╔════╝",
                "██║     ",
                "██║     ",
                "╚██████╗",
                " ╚═════╝"
        });

        // Letter D
        BLOCK_LETTERS.put('D', new String[]{
                "██████╗ ",
                "██╔══██╗",
                "██║  ██║",
                "██║  ██║",
                "██████╔╝",
                "╚═════╝ "
        });

        // Letter E
        BLOCK_LETTERS.put('E', new String[]{
                "███████╗",
                "██╔════╝",
                "█████╗  ",
                "██╔══╝  ",
                "███████╗",
                "╚══════╝"
        });

        // Letter F
        BLOCK_LETTERS.put('F', new String[]{
                "███████╗",
                "██╔════╝",
                "█████╗  ",
                "██╔══╝  ",
                "██║     ",
                "╚═╝     "
        });

        // Letter G
        BLOCK_LETTERS.put('G', new String[]{
                " ██████╗ ",
                "██╔════╝ ",
                "██║  ███╗",
                "██║   ██║",
                "╚██████╔╝",
                " ╚═════╝ "
        });

        // Letter H
        BLOCK_LETTERS.put('H', new String[]{
                "██╗  ██╗",
                "██║  ██║",
                "███████║",
                "██╔══██║",
                "██║  ██║",
                "╚═╝  ╚═╝"
        });

        // Letter I
        BLOCK_LETTERS.put('I', new String[]{
                "██╗",
                "██║",
                "██║",
                "██║",
                "██║",
                "╚═╝"
        });

        // Letter J
        BLOCK_LETTERS.put('J', new String[]{
                "     ██╗",
                "     ██║",
                "     ██║",
                "██   ██║",
                "╚█████╔╝",
                " ╚════╝ "
        });

        // Letter K
        BLOCK_LETTERS.put('K', new String[]{
                "██╗  ██╗",
                "██║ ██╔╝",
                "█████╔╝ ",
                "██╔═██╗ ",
                "██║  ██╗",
                "╚═╝  ╚═╝"
        });

        // Letter L
        BLOCK_LETTERS.put('L', new String[]{
                "██╗     ",
                "██║     ",
                "██║     ",
                "██║     ",
                "███████╗",
                "╚══════╝"
        });

        // Letter M
        BLOCK_LETTERS.put('M', new String[]{
                "███╗   ███╗",
                "████╗ ████║",
                "██╔████╔██║",
                "██║╚██╔╝██║",
                "██║ ╚═╝ ██║",
                "╚═╝     ╚═╝"
        });

        // Letter N
        BLOCK_LETTERS.put('N', new String[]{
                "███╗   ██╗",
                "████╗  ██║",
                "██╔██╗ ██║",
                "██║╚██╗██║",
                "██║ ╚████║",
                "╚═╝  ╚═══╝"
        });

        // Letter O
        BLOCK_LETTERS.put('O', new String[]{
                " ██████╗ ",
                "██╔═══██╗",
                "██║   ██║",
                "██║   ██║",
                "╚██████╔╝",
                " ╚═════╝ "
        });

        // Letter P
        BLOCK_LETTERS.put('P', new String[]{
                "██████╗ ",
                "██╔══██╗",
                "██████╔╝",
                "██╔═══╝ ",
                "██║     ",
                "╚═╝     "
        });

        // Letter Q
        BLOCK_LETTERS.put('Q', new String[]{
                " ██████╗ ",
                "██╔═══██╗",
                "██║   ██║",
                "██║▄▄ ██║",
                "╚██████╔╝",
                " ╚══▀▀═╝ "
        });

        // Letter R
        BLOCK_LETTERS.put('R', new String[]{
                "██████╗ ",
                "██╔══██╗",
                "██████╔╝",
                "██╔══██╗",
                "██║  ██║",
                "╚═╝  ╚═╝"
        });

        // Letter S
        BLOCK_LETTERS.put('S', new String[]{
                "███████╗",
                "██╔════╝",
                "███████╗",
                "╚════██║",
                "███████║",
                "╚══════╝"
        });

        // Letter T
        BLOCK_LETTERS.put('T', new String[]{
                "████████╗",
                "╚══██╔══╝",
                "   ██║   ",
                "   ██║   ",
                "   ██║   ",
                "   ╚═╝   "
        });

        // Letter U
        BLOCK_LETTERS.put('U', new String[]{
                "██╗   ██╗",
                "██║   ██║",
                "██║   ██║",
                "██║   ██║",
                "╚██████╔╝",
                " ╚═════╝ "
        });

        // Letter V
        BLOCK_LETTERS.put('V', new String[]{
                "██╗   ██╗",
                "██║   ██║",
                "██║   ██║",
                "╚██╗ ██╔╝",
                " ╚████╔╝ ",
                "  ╚═══╝  "
        });

        // Letter W
        BLOCK_LETTERS.put('W', new String[]{
                "██╗    ██╗",
                "██║    ██║",
                "██║ █╗ ██║",
                "██║███╗██║",
                "╚███╔███╔╝",
                " ╚══╝╚══╝ "
        });

        // Letter X
        BLOCK_LETTERS.put('X', new String[]{
                "██╗  ██╗",
                "╚██╗██╔╝",
                " ╚███╔╝ ",
                " ██╔██╗ ",
                "██╔╝ ██╗",
                "╚═╝  ╚═╝"
        });

        // Letter Y
        BLOCK_LETTERS.put('Y', new String[]{
                "██╗   ██╗",
                "╚██╗ ██╔╝",
                " ╚████╔╝ ",
                "  ╚██╔╝  ",
                "   ██║   ",
                "   ╚═╝   "
        });

        // Letter Z
        BLOCK_LETTERS.put('Z', new String[]{
                "███████╗",
                "╚══███╔╝",
                "  ███╔╝ ",
                " ███╔╝  ",
                "███████╗",
                "╚══════╝"
        });

        // Number 0
        BLOCK_LETTERS.put('0', new String[]{
                " ██████╗ ",
                "██╔═████╗",
                "██║██╔██║",
                "████╔╝██║",
                "╚██████╔╝",
                " ╚═════╝ "
        });

        // Number 1
        BLOCK_LETTERS.put('1', new String[]{
                " ██╗",
                "███║",
                "╚██║",
                " ██║",
                " ██║",
                " ╚═╝"
        });

        // Number 2
        BLOCK_LETTERS.put('2', new String[]{
                "██████╗ ",
                "╚════██╗",
                " █████╔╝",
                "██╔═══╝ ",
                "███████╗",
                "╚══════╝"
        });

        // Number 3
        BLOCK_LETTERS.put('3', new String[]{
                "██████╗ ",
                "╚════██╗",
                " █████╔╝",
                " ╚═══██╗",
                "██████╔╝",
                "╚═════╝ "
        });

        // Number 4
        BLOCK_LETTERS.put('4', new String[]{
                "██╗  ██╗",
                "██║  ██║",
                "███████║",
                "╚════██║",
                "     ██║",
                "     ╚═╝"
        });

        // Number 5
        BLOCK_LETTERS.put('5', new String[]{
                "███████╗",
                "██╔════╝",
                "███████╗",
                "╚════██║",
                "███████║",
                "╚══════╝"
        });

        // Number 6
        BLOCK_LETTERS.put('6', new String[]{
                " ██████╗ ",
                "██╔════╝ ",
                "███████╗ ",
                "██╔═══██╗",
                "╚██████╔╝",
                " ╚═════╝ "
        });

        // Number 7
        BLOCK_LETTERS.put('7', new String[]{
                "███████╗",
                "╚════██║",
                "    ██╔╝",
                "   ██╔╝ ",
                "   ██║  ",
                "   ╚═╝  "
        });

        // Number 8
        BLOCK_LETTERS.put('8', new String[]{
                " █████╗ ",
                "██╔══██╗",
                "╚█████╔╝",
                "██╔══██╗",
                "╚█████╔╝",
                " ╚════╝ "
        });

        // Number 9
        BLOCK_LETTERS.put('9', new String[]{
                " █████╗ ",
                "██╔══██╗",
                "╚██████║",
                " ╚═══██║",
                " █████╔╝",
                " ╚════╝ "
        });

        // Space
        BLOCK_LETTERS.put(' ', new String[]{
                "           ",
                "           ",
                "           ",
                "           ",
                "           ",
                "           "
        });
    }

    public static String generateBanner(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        text = text.toUpperCase(); // Convert to uppercase for consistency

        // Get the height of the ASCII letters (all are the same height)
        int height = BLOCK_LETTERS.get('A').length;

        // Find the maximum width of the banner
        int totalWidth = 0;
        for (char c : text.toCharArray()) {
            if (BLOCK_LETTERS.containsKey(c)) {
                totalWidth += BLOCK_LETTERS.get(c)[0].length();
            } else {
                // For characters not in our map, use a space
                totalWidth += BLOCK_LETTERS.get(' ')[0].length();
            }
        }

        // Add padding and border width
        int borderWidth = totalWidth + 2; // 5 spaces padding on each side

        StringBuilder banner = new StringBuilder();

        // Top border
        banner.append("╔").append("═".repeat(borderWidth)).append("╗\n");

        // Add some space before the text
        for (int i = 0; i < 1; i++) {
            banner.append("║").append(" ".repeat(borderWidth)).append("║\n");
        }

        // Construct the ASCII art text line by line
        for (int i = 0; i < height; i++) {
            banner.append("║ "); // Left border with padding

            // Add each character's line
            for (char c : text.toCharArray()) {
                if (BLOCK_LETTERS.containsKey(c)) {
                    banner.append(BLOCK_LETTERS.get(c)[i]);
                } else {
                    // For characters not in our map, use a space
                    banner.append(BLOCK_LETTERS.get(' ')[i]);
                }
            }

            // Right padding and border
            int padding = borderWidth - totalWidth - 1; // -3 for the initial padding
            banner.append(" ".repeat(padding)).append("║\n");
        }

        // Add some space after the text
        for (int i = 0; i < 1; i++) {
            banner.append("║").append(" ".repeat(borderWidth)).append("║\n");
        }

        // Bottom border
        banner.append("╚").append("═".repeat(borderWidth)).append("╝");

        return banner.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to convert to ASCII banner: ");
        String text = scanner.nextLine();
        scanner.close();

        String banner = generateBanner(text);
        System.out.println("\nHere is your ASCII banner:\n");
        System.out.println(banner);
    }
}