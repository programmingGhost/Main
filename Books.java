/*#### Κυρίως Πρόγραμμα
1. Δημιουργήστε μια κλάση *Main*.
2. Στη μέθοδο `main`:
   - Δημιουργήστε 3 αντικείμενα της κλάσης *Book*, ένα με τον κενό κατασκευαστή και δύο με τον πλήρη κατασκευαστή.
   - Ρυθμίστε τις τιμές των πεδίων για το αντικείμενο που δημιουργήθηκε με τον κενό κατασκευαστή χρησιμοποιώντας setters.
   - Εμφανίστε την περιγραφή κάθε βιβλίου καλώντας τη μέθοδο `getBookDescription`.
   - Εφαρμόστε έκπτωση 10% σε ένα από τα βιβλία καλώντας τη μέθοδο `applyDiscount` και εμφανίστε τη νέα περιγραφή του βιβλίου.

Καλή επιτυχία! */
public class Books {
    public static void main(String[] args) {

        Book n1 = new Book();
        Book n2 = new Book("Το ΛΑΘΟΣ", "Αντωνηης Σαμαρακης", 279, 20.00);
        Book n3 = new Book("Το πρόβλημα των τριών σωμάτων", "Liu Cixin", 487, 35.00);

        System.out.println("---------------------------------");

        n1.setTitle("The lord of the rings");
        n1.setAuther("George R.R Toleking");
        n1.setPage(1000);
        n1.setPrice(20.00);
        n1.setDescription(
                "Η Συντροφιά του Δαχτυλιδιού είναι ο πρώτος από τους συνολικά 3 τόμους, του επικού μυθιστορήματος, Ο Άρχοντας των Δαχτυλιδιών, του Άγγλου συγγραφέα, Τζ. Ρ. Ρ. Τόλκιν. Η ιστορία του βιβλίου διαδραματίζεται στον φανταστικό κόσμου του συγγραφέα, Μέση-Γη. Η πρώτη κυκλοφορία του βιβλίου έγινε στις 29 Ιουλίου του 1954, στο Ηνωμένο Βασίλειο.");

        n1.getBookDescription();

        System.out.println("---------------------------------");
        n2.setDescription("Ένας πολίτης θεωρείται από την Ασφάλεια ως ύποπτος για συνωμοτική κίνηση κατά του Καθεστώτος. Το μόνο άτομο που θα μπορούσε να επιβεβαιώσει την ενοχή του είναι νεκρό, δολοφονήθηκε από πράκτορες του Καθεστώτος.");
        n2.getBookDescription();

        System.out.println("---------------------------------");
        n3.setDescription("1967: η Γιε Γουέντζι γίνεται μάρτυρας του ξυλοδαρμού μέχρι θανάτου του πατέρα της από τους Ερυθροφρουρούς κατά την διάρκεια της Πολιτιστικής Επανάστασης στην Κίνα. Το γεγονός αυτό δεν θα καθορίσει μόνο την υπόλοιπη ζωή της, αλλά και το μέλλον της ανθρωπότητας.");
        n3.getBookDescription();

        System.out.println(n1.getTitle() + ": " + n1.applyDiscount(15));

        System.out.println(n2.getTitle() + ": " + n2.applyDiscount(10));

        System.out.println(n3.getTitle() + ": " + n3.applyDiscount(20));

        System.out.println("---------------------------------");

        System.out.println(n3.comparePrice(n1));
        System.out.println((n3.isExpensive(15)) ? n3.getTitle()
                + " is more expensive than this price" : n3.getTitle() + " is cheaper than this price");
        System.out.println(n3.hasMorePages(n1));
        System.out.println(n3.printSummary());
        n3.updatePrice(25);

        System.out.println(n2.comparePrice(n3));
        System.out.println((n2.isExpensive(15)) ? n2.getTitle()
                + " is more expensive than this price" : n2.getTitle() + " is cheaper than this price");
        System.out.println(n2.hasMorePages(n3));
        System.out.println(n2.printSummary());
        n2.updatePrice(18);

        System.out.println(n1.comparePrice(n2));
        System.out.println((n1.isExpensive(30)) ? n1.getTitle()
                + " is more expensive than this price" : n1.getTitle() + " is cheaper than this price");
        System.out.println(n1.hasMorePages(n2));
        System.out.println(n1.printSummary());
        n1.updatePrice(33);

    }
}
