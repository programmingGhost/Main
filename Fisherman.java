
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Stack;

/*
 * Να υλοποιηθεί η κλάση Fisherman (ψαράς) η οποία υλοποιεί          προγραμματιστικά
 * έναν ψαρά. Η κλάση Fisherman περιέχει τα χαρακτηριστικά: Name (το όνομα
 * του ψαρά), Basket (καλάθι ως Stack Basket (στοίβα)) για αντικείμενα τύπου
 * Fish, Net (δίχτυ ως ArrayDeque (ουρά)) για αντικείμενα τύπου Fish,
 * Junks (σκουπίδια ως List<Fish> Junks (λίστα)) για αντικείμενα τύπου Fish,
 * FishingScore (το συνολικό score για κάθε ψάρεμα με πετονιά),
 *  NetingScore (το συνολικό score για κάθε ψάρεμα με δίχτυ) και τις
 * μεθόδους:
 * 
 * - private void initJunks(): Περιέχει HashMap<string, double> someJunks,
 * το οποίο για κλειδιά έχει τις 6 τιμές: Boot, Seaweed, Bottle, Wheel, Tin Can,
 * Plastic Bag και για αξίες (values) έχει τις 6 τιμές: -0.5, -0.1, -0.3, -0.9,
 * -0.2, -0.4, αντίστοιχα. Aρχικοποιεί το List Junks με 100 τυχαία σκουπίδια
 * τύπου Fish, με τιμές για το Type τους: ένα τυχαίο κλειδί από το HashSet
 * someJunks και για τα Weight την αντίστοιχη τιμή του κλειδιού αυτού και για
 * Difficulty πάντα την τιμή 0.0. Η μέθοδος αυτή καλείται μέσα σε όλους τους
 * constructors του Fisherman.
 */

public class Fisherman {

    private String name;

    // create stack
    Stack<Fish> basket = new Stack<>();

    // array list
    ArrayDeque<String> net = new ArrayDeque<>();

    // array list
    ArrayDeque<Fish> junks = new ArrayDeque<>();

    // method
    public void FishingScore() {

    }

    public void NetingScore() {

    }

    // private
    private void initJunks() {
        HashMap<String, Double> someJunks = new HashMap<>();

        someJunks.put("Boot", -0.5);
        someJunks.put("Seaweed", -0.1);
        someJunks.put("Wheel", -0.3);
        someJunks.put("Tin Can", -0.9);
        someJunks.put("Plastic Bag", -0.4);

    }

}
