import java.util.Scanner;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static String name;
    public static int maxItems = 5;
    public static String[] inventory = new String[maxItems];

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
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        typewriter("You walk into work one day see a company named Beezwax doing promotion.");
        typewriter("Beezwax is a company that sells very organic honey but at the cost of millions");
        typewriter("of a specific bee that pollinates crops in some of the poorer countries of Europe costing thousands of lives for mass production.");
        typewriter("After talking to some co-workers, you see the CEO who is personally running this promotion, you know you should introduce yourself to him,");
        typewriter("but you can barely stand thinking of him");


        firstChoice();
    }

    public static void firstChoice() {
        typewriter("Introduce yourself to the CEO? (yes/no): ");
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
            secondChoice();

        } else {
            typewriter("You go into your office and look over recent cases.");
            typewriter("While looking through your computer, you get an unnamed file sent to you.");
            thirdChoice();
        }
    }


        public static void thirdChoice() {
            typewriter("Do you open it? (yes/no): ");
            String choice = scan.nextLine();
            if (choice.equals("yes")) {
                typewriter("Your computer explodes and you die.");
                System.out.println("Mission Failed.");
            } else {
                typewriter("You feel suspicious of the file so you decide to investigate more and learn that it would’ve exploded the computer if opened,");
                typewriter("you must find out who sent it.");

            }

    }

    public static void secondChoice() {
        typewriter("You really don’t want to go, but you also really want him dead.");
        typewriter("Do you go? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You prepare for convection, looking through your desk you find an old revolver with two bullets left, sitting in the bottom cabinet.");
            fourthChoice();
        } else {
            typewriter("You forget about it and go get a doughnut and coffee, while getting your doughnut you drop your coffee, slip on it,");
            typewriter("landing on your back paralyzing yourself from the waist down.");
            System.out.println("Mission Failed.");

        }



    }


    public static void fourthChoice() {
        typewriter("");
        typewriter("Do you take it? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You put the revolver in your belt, knowing you might need it later");
            inventory[0] = "Revolver";
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
            typewriter("Thursday:");
            typewriter("");
            typewriter("");
            typewriter("At the convection your watching Danny Wax give a speech, but you also notice the trailer that he came out of is cracked open.");
            fifthChoice();
        } else {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
            typewriter("Thursday:");
            typewriter("");
            typewriter("");
            typewriter("At the convention you are watching Danny Wax give a speech, but you also notice the trailer that he came out of is cracked open.");
            fifthChoice();
        }



    }


    public static void fifthChoice() {
        System.out.print("Do you sneak inside? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            sixthChoice();
        } else {
            typewriter("You buy a giant Jar of organic honey and take it home to give to your pet squirrel.");
            typewriter("Mission skipped");

        }

    }

    public static void sixthChoice() {
        if (inventory[0].equals ("Revolver")) {
            typewriter("You go in and see some filing cabinets and a desk in the middle of the room. ");
            typewriter("While getting closer to the desk you get hit on the back of the head. ");
            typewriter("You turn around and see a beefy man getting ready to hit you again.");
            seventhChoice();
        } else {
            typewriter("You go in and see some filing cabinets and a desk in the middle of the room. ");
            typewriter("While getting closer to the desk you get hit on the back of the head.");
            typewriter("You turn around and he hits you again and knocks you out...");
        }

    }

    public static void seventhChoice() {
        System.out.print("Do you pull out you gun and shoot him? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            sixthChoice();
        } else {
            typewriter("You buy a giant Jar of organic honey and take it home to give to your pet squirrel.");
            typewriter("Mission skipped");

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
