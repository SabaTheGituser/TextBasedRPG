import java.util.Scanner;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static String name;

    public static void main(String[] args) {
        System.out.println("Press ENTER to begin...");
        scan.nextLine();
        intro();
    }

    public static void intro() {
        System.out.print("Enter your name: ");
        name = scan.nextLine();

        typewriter("The story begins here...");
        typewriter("1958, Australia. The government is failing its people. Corrupt politicians and billionaires tighten their grip on society.");
        typewriter("You, " + name + ", are a high-ranking detective. You've seen the corruption firsthand and know justice won’t come through the system.");
        typewriter("You decide to take matters into your own hands.");
        typewriter("-----------------------------------------------------------------------------------------------------------------------------------------------");
        typewriter("You walk into work one day see a company named Beezwax doing promotion.");
        typewriter("Beezwax is a company that sells very organic honey but at the cost of millions");
        typewriter("of a specific bee that pollinates crops in some of the poorer countries of Europe costing thousands of lives for mass production.");
        typewriter("After talking to some co-workers, you see the CEO who is personally running this promotion, you know you should introduce yourself to him,");
        typewriter("but you can barely stand thinking of him");


        firstChoice();
    }

    public static void firstChoice() {
        System.out.print("Introduce yourself to the CEO? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You introduce yourself, hoping to get closer to uncovering corruption.");
            typewriter("You: Hey, I’m detective " + name);
            typewriter("CEO: That’s a nice name, easy to remember.");
            typewriter("You: Well, what might your name be?");
            typewriter("CEO: Danny, Danny Wax.");
            typewriter("You: I see where the company name comes from now.");
            typewriter("CEO: And I would love to see YOU at our yearly honey convection this Thursday, it always gets very crowded.");
            typewriter("You: I’ll be sure to find the time.");
        } else {
            typewriter("You go into your office and look over recent cases");
            typewriter("While looking through your computer, you get a unnamed file sent to you.");
            secondChoice();
        }
    }


        public static void secondChoice() {
            System.out.print("Do you open it? (yes/no): ");
            String choice = scan.nextLine();
            if (choice.equals("yes")) {
                //something next.
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
