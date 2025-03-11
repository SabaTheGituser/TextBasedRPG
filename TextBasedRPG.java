import java.util.Scanner;
import java.util.Random;

public class TextBasedRPG {
    static Random random = new Random();
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
            typewriter("CEO: And I would love to see YOU at our yearly honey convention this Thursday, it always gets very crowded.");
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
                typewriter("Mission Failed.");
            } else {
                typewriter("You decide to investigate more and learn that it would’ve exploded the computer if opened,");
                typewriter("after some looking you find that it was from a anonymous source,");
                typewriter("looking around in the file you get a link to a active chat room, joining the room you see a number a names,");
                typewriter("Danny Wax is the name that really pops up to you, you scroll up and read some despicable things,");
                typewriter("in this chat room you read about a convention happening this Thursday ");
                secondChoice();
            }

    }

    public static void secondChoice() {
        typewriter("You really don’t want to go, but you also really want him dead.");
        typewriter("Do you go? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You prepare for convention, looking through your desk you find an old revolver with two bullets left, sitting in the bottom cabinet.");
            fourthChoice();
        } else {
            typewriter("You forget about it and go get a doughnut and coffee, while getting your doughnut you drop your coffee, slip on it,");
            typewriter("landing on your back paralyzing yourself from the waist down.");
            typewriter("Mission Failed.");

        }



    }


    public static void fourthChoice() {
        typewriter("");
        typewriter("Do you take it? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You put the revolver in your belt, knowing you might need it later");
            inventory[0] = "Revolver";
            inventory[1] = "bullet";
            inventory[2] = "bullet2";
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
            typewriter("Thursday:");
            typewriter("");
            typewriter("");
            typewriter("At the convention your watching Danny Wax give a speech, but you also notice the trailer that he came out of is cracked open.");
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
        typewriter("Do you sneak inside? (yes/no): ");
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
            situationTwo();
        }

    }

    public static void seventhChoice() {
        typewriter("Do you pull out your gun and shoot him? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You pull out your gun, having no time to aim you just point and shoot");
            luck();
        } else {
            typewriter("You wake up in a dark dimly lit room, tied up and confused you try to find a way to cut your binds,");
            typewriter("before you can further examine Danny Wax walks in the room, holding a full glass of red wine.");
            typewriter("CEO: I wish we could’ve in a better place, but it seems this will do just fin-");
            typewriter("As he’s finishing, he drops his glass, he sighs and leaves the room.");
            typewriter("");
            typewriter("");
            typewriter("You have a chance to kick some glass to your leg and possibly cut the rope ");
            tenthChoice();
        }

    }


    public static void luck() {
        int num = random.nextInt(0,11);

        if (num > 5)

        {
            typewriter("You hit and the Beefy Man dropped, you sit there for a awhile looking at him,");
            typewriter("you know you must leave when you hear people screaming outside so you grab a file you find on the desk and leave out a window.");
            System.out.println("You have 1 bullet remaining.");
            inventory[1] = null;
            typewriter("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            typewriter("Jumping out the window you’re in the back area of the trailers you see a pair of kids looking at you,");
            typewriter("you tell yourself that these kids could be loose ends");
            typewriter("the only thing you have for them is $20 or a Bullet");
            eighthChoice();
        }
        else
        {
            typewriter("You miss, but the shock of the noise shocked the Beefy Man,");
            typewriter("you take this chance to pistol whip him, he falls over.");
            typewriter("you know you must leave when you hear people screaming outside so you grab a file you find");
            typewriter("on the desk and leave out a window, in this file you find out that BeezWax could’ve gotten a small group of");
            typewriter("the Bees and brought them here to breed and make honey, but it costs more to build and maintain that");
            typewriter("farm than to import the honey from a poor country,");
            typewriter("but also from this file you find what seems to be Barry Wax’s address, you must go.");
            System.out.println("You have 1 bullet remaining.");
            inventory[1] = null;
            situationOne();
        }


    }

    public static void eighthChoice() {
        typewriter("What do you give them? $20 or Bullet");
        String choice = scan.nextLine();
        if (choice.equals("$20")) {
            typewriter("You gave them both $10 and told them to please not say anything,");
            typewriter("they look at the money for awhile before smiling at you and running off");
            situationOne();
        } else {
            typewriter("You give the Kid the Bullet. His friend starts screaming for help,");
            typewriter("you look for a way out but before you can locate one your tackled and put in custody,");
            typewriter("after being tired and found guilty you find yourself in death row and feeling scared.");
            ninthChoice();

        }

    }


    public static void ninthChoice() {
        typewriter("Do you cry? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You cried for the last time.");
            typewriter("You were later put in the electric chair and died");
            typewriter("You died feeling sorry for yourself.");
            typewriter("Mission Failed.");
        } else {
            typewriter("You held in your emotions like you did your whole life.");
            typewriter("You were later put in the electric chair and died.");
            typewriter("You died a Monster.");
            typewriter("Mission Failed.");

        }

    }



    public static void tenthChoice() {
        typewriter("Do you go for the glass? (yes/no):");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("With your hands behind your back you grab the glass and try to start cutting");
            luckTwo();
        } else {
            typewriter("Danny Wax walks in with a candle and a cloth, while cleaning it up");
            typewriter("up the candle randomly falls onto the wine burning the both of you.");
            typewriter("Mission Succfailed");

        }

    }


    public static void luckTwo() {
        int num = random.nextInt(0,11);

        if (num > 5)

        {
            typewriter("You cut the rope right before he comes in, as he walks in you grab him and end him with the glass.");
            typewriter("You grab a Jar a pure golden honey he had in his bag,");
            typewriter("you frantically look for a way out of this complex you’re in,");
            typewriter("after running through hallways you see a door that leads to sun light.");
            eleventhChoice();
        }
        else
        {
            typewriter("You can’t mange to cut the rope, Danny Wax comes backs in and sees your escape attempt...");
            typewriter("He shoots and kills you.");
            typewriter("Mission Failed.");

        }


    }




    public static void eleventhChoice() {
        typewriter("Do you go for it? (yes/no):");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("as you run towards it you get shot in the side by a Beefy man coming from the room you had previously ran out of,");
            typewriter("you run into the snowy forest looking to get as far away as you can.");
            typewriter("After getting far into the forest you sit against a log in the snow waiting to perish to your wounds,");
            typewriter("while waiting you seem a small golden bear wearing red shirt,");
            typewriter("he walks up to you and asks to try your honey");
            twelveChoice();
        } else {
            typewriter("You hesitate and the Beefy man comes out from the room you were previously in and shoots you.");
            typewriter("You die.");
            typewriter("Mission Failed.");

        }

    }


    public static void twelveChoice() {
        typewriter("Do you let him try the honey? (yes/no): ");
        String choice = scan.nextLine();
        if (choice.equals("yes")) {
            typewriter("You give him the Jar of Golden Honey, he grabs a handful and stuffs it in his mouth,");
            typewriter("after chewing for awhile he looks at you and nods, he then grabs another handful and rubs it on your wound,");
            typewriter("he stands up smiles at you, and walks Jar of Honey in hand.");
            typewriter("Mission Complete");
        } else {
            typewriter("The Golden Bear walks away and you did nothing as you’ll eventually perish...");
            typewriter("But instead, you become one with the log you were laying up against,");
            typewriter("with the Jar of honey next to you over many many years you will grow into a great Honey Tree,");
            typewriter("and the Golden Bear in the Red shirt will come collect his honey.");
            typewriter("Mission Honeyed");
        }



    }




    public static void situationTwo() {
        typewriter("You wake up in a dark dimly lit room, tied up and confused you try to find a way to cut your binds,");
        typewriter("before you can further examine Danny Wax walks in the room, holding a full glass of red wine.");
        typewriter("CEO: I wish we could’ve in a better place, but it seems this will do just fin-");
        typewriter("As he’s finishing, he drops his glass, he sighs and leaves the room.");
        typewriter("");
        typewriter("");
        typewriter("You have a chance to kick some glass to gur leg and possibly cut the rope ");
        tenthChoice();
    }



    public static void situationOne() {
        typewriter("After getting home, , in this file you find out that BeezWax could’ve gotten a small group ");
        typewriter("of the Bees and brought them here to breed and make honey, but it costs more to build and maintain that farm ");
        typewriter("than to import the honey from a poor country, but also from this file you find what seems ");
        typewriter("to be Danny Wax’s address, you must go.");
        typewriter("");
        typewriter("Friday:");
        typewriter("");
        typewriter("Sitting in your car outside Danny’s house you think that driving in might be easier than walking in.");
        thirteenthChoice();
    }




    public static void thirteenthChoice() {
        typewriter("Drive in or Walk in? (Drive in/Walk in):");
        String choice = scan.nextLine();
        if (choice.equals("Drive in")) {
            typewriter("You’re Driving your car into Danny Wax’s house at full speed!");
            typewriter("The last thing you see before your car explodes the house is Danny Wax and his family eating dinner with a side of honey.");
            typewriter("Mission complete.");
        } else {
            typewriter("You walk in the house’s front door gun in hand.");
            typewriter("Walking in you see Danny Wax with his family sitting at the dinner table,");
            typewriter("he looks at you for awhile in shock before he offers you a seat in an empty chair.");
            fourteenthChoice();
        }

    }





    public static void fourteenthChoice() {
        typewriter("Shoot or Sit? (Shoot/Sit):");
        String choice = scan.nextLine();
        if (choice.equals("Shoot")) {
            typewriter("You shoot Danny in front of his family and go to walk out of the house but before you do you grab a Jar of Golden Honey.");
            typewriter("You go home and give it to your pet squirrel “Ronnie");
            typewriter("You and Ronnie watch Alvin and the chipmunks while eating honey toast.");
        } else {
            typewriter("You sit down and an old lady puts some food on your plate, after talking to Danny ad his family for awhile you learn they had");
            typewriter("no idea of the hurt it causes and would prefer if Danny had farms or it here,");
            typewriter("after talking to them some more Danny agreed to move honey productions to farms here.");
            typewriter("");
            typewriter("After eating some more your start to feel weird, you look up and the whole family is looking at you,");
            typewriter("they poisoned you, you try to stand but you just fall over.");
            typewriter("The poison takes over and you die.");
            typewriter("Mission failed.");

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
