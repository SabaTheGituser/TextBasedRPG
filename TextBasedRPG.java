import java.util.Scanner;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press ENTER to begin...");
        scan.nextLine();
        intro();
    }

    public static void intro() {
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        typewriter("The story begins here...");
        typewriter("1958, Australia. The government is failing its people. Corrupt politicians and billionaires tighten their grip on society.");
        typewriter("You, " + name + ", are a high-ranking detective. You've seen the corruption firsthand and know justice won’t come through the system.");
        typewriter("You decide to take matters into your own hands.");

        firstChoice();
    }

    public static void firstChoice() {
        System.out.print("Introduce yourself to the CEO? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You introduce yourself, hoping to get closer to uncovering corruption.");
        } else {
            typewriter("You stay in the shadows, gathering more information first.");
        }
    }

    public static void typewriter(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try { Thread.sleep(10); } catch (InterruptedException ex) {}
        }
        System.out.println();
    }
}
