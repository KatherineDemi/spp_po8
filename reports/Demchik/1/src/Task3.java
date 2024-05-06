import java.util.Scanner;

public class Task3 {
    static boolean isAllLowerCase(String cs) {
        for (int i = 0; i < cs.length(); i++) {
            char ch = cs.charAt(i);
            if (!Character.isLowerCase(ch) && !Character.isWhitespace(ch)) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings (press Enter after each string, type 'exit' to finish):");

        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            System.out.println("string: " + input + " isLower: "  + isAllLowerCase(input));
            input = scanner.nextLine();
        }

        scanner.close();
    }
}
