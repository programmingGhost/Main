import java.util.Random;

public class MainPartyKnightWizardvThief {

    public static void main(String[] args) {
        Random random = new Random();

        int agility = random.nextInt(101);
        int mana = 50 + random.nextInt(51);

        String[] thiefNames = { "John", "Jack", "Robin", "Eliot", "Scarlet" };
        String[] knightNames = { "Arthur", "Lancelot", "Gawain", "Percival", "Tristan" };
        String[] wizardNames = { "Merlin", "Morgana", "Gandalf", "Radagast", "Saruman" };

        String randomThiefName = thiefNames[random.nextInt(thiefNames.length)];
        String randomKnightName = knightNames[random.nextInt(knightNames.length)];
        String randomWizardName = wizardNames[random.nextInt(wizardNames.length)];

        System.out.println("Random Thief Name:" + randomThiefName);
        System.out.println("Random Knight Name: " + randomKnightName);
        System.out.println("Random Wizard Name: " + randomWizardName);

        Thief r1 = new Thief("John", 19, 5, 16);
        Thief r2 = new Thief("Scarlet", 20, 4, 16);

        Knight k1 = new Knight("Arthur", 20, 20, 15);
        Knight k2 = new Knight("Tristan",17, 15, 15);

        Wizard w1 = new Wizard("Merlin",50, 50, 100);
        Wizard w2 = new Wizard("Morgana", 50, 50, 80);


    }
}
