/*
Γράψτε ένα πρόγραμμα σε Java που να διαχειρίζεται πληροφορίες για βιβλία. Το πρόγραμμα θα πρέπει να περιέχει μια κλάση *Book* και να δημιουργεί 3 αντικείμενα από αυτήν. Ακολουθούν οι απαιτήσεις:

#### Κλάση *Book*
1. **Πεδία**:
   - `title` (τίτλος): `String`
   - `author` (συγγραφέας): `String`
   - `pages` (αριθμός σελίδων): `int`
   - `price` (τιμή): `double`

2. **Κατασκευαστές**:
   - Κενός κατασκευαστής που αρχικοποιεί τα πεδία με προεπιλεγμένες τιμές.
   - Πλήρης κατασκευαστής που λαμβάνει ως παραμέτρους όλες τις ιδιότητες (`title`, `author`, `pages`, `price`) και τις αρχικοποιεί.

3. **Getters και Setters**:
   - Δημιουργήστε getters και setters για κάθε πεδίο.

4. **Μέθοδοι**:
   - `getBookDescription()`: Επιστρέφει μια συμβολοσειρά που περιγράφει το βιβλίο με τη μορφή:  
     "Title: [τίτλος], Author: [συγγραφέας], Pages: [σελίδες], Price: [τιμή]".
   - `applyDiscount(double percentage)`: Μειώνει την τιμή του βιβλίου κατά το ποσοστό που δίνεται ως όρισμα.

#### Κυρίως Πρόγραμμα
1. Δημιουργήστε μια κλάση *Main*.
2. Στη μέθοδο `main`:
   - Δημιουργήστε 3 αντικείμενα της κλάσης *Book*, ένα με τον κενό κατασκευαστή και δύο με τον πλήρη κατασκευαστή.
   - Ρυθμίστε τις τιμές των πεδίων για το αντικείμενο που δημιουργήθηκε με τον κενό κατασκευαστή χρησιμοποιώντας setters.
   - Εμφανίστε την περιγραφή κάθε βιβλίου καλώντας τη μέθοδο `getBookDescription`.
   - Εφαρμόστε έκπτωση 10% σε ένα από τα βιβλία καλώντας τη μέθοδο `applyDiscount` και εμφανίστε τη νέα περιγραφή του βιβλίου.

Καλή επιτυχία!
  */
public class Book {

    private String title;
    private String auther;
    private int pages;
    private double price;
    private String description;

    public Book() {
    };

    public Book(String title, String auther, int pages, double price) {
        this.title = title;
        this.auther = auther;
        this.pages = pages;
        this.price = price;
    };

    /*
     * Getters & Setters (Accesors)
     */

    // ---------------setters----------------

    public void setTitle(String title) {
        this.title = title;
    };

    public void setAuther(String auther) {
        this.auther = auther;
    };

    public void setPage(int pages) {
        this.pages = pages;
    };

    public void setPrice(double price) {
        this.price = price;
    };

    public void setDescription(String description){
        this.description = description;
    };

    // ---------------getters----------------

    public String getTitle() {
        return title;
    };

    public String getAuther() {
        return auther;
    };

    public int getPages() {
        return pages;
    };

    public double getPrice() {
        return price;
    };

    // method

    public void getBookDescription() {
        System.out.println("Title: " + getTitle() + ", Auther: " + getAuther() + ", Pages: " + getPages() + ", Price: "
                + getPrice());
    };

    public String applyDiscount(int disc) {
        // Μειώνει την τιμή του βιβλίου κατά το ποσοστό που δίνεται ως όρισμα.
        // p.x. 15% (poso * 15) / 100
        return "Τελική τιμή: " + (price - ((price * disc) / 100));
    };

    /*
     * Νέες Μέθοδοι:
     * 
     * isExpensive(double threshold): Επιστρέφει true αν η τιμή του βιβλίου είναι
     * μεγαλύτερη από το όριο που δίνεται ως όρισμα, διαφορετικά false.
     * 
     * hasMorePages(Book otherBook): Συγκρίνει τον αριθμό σελίδων με ένα άλλο
     * βιβλίο. Επιστρέφει true αν το βιβλίο έχει περισσότερες σελίδες από το άλλο,
     * διαφορετικά false.
     * 
     * comparePrice(Book otherBook): Επιστρέφει μια συμβολοσειρά που συγκρίνει την
     * τιμή με ένα άλλο βιβλίο, όπως "Cheaper", "More Expensive", ή "Same Price".
     * 
     * printSummary(): Εμφανίζει στην κονσόλα τη σύνοψη του βιβλίου χρησιμοποιώντας
     * τη getBookDescription().
     * 
     * updatePrice(double newPrice): Ενημερώνει την τιμή του βιβλίου αν η νέα τιμή
     * είναι μεγαλύτερη από το 0. Διαφορετικά, εμφανίζει μήνυμα σφάλματος.
     * 
     * Κυρίως Πρόγραμμα
     * 
     * Ελέγξτε αν κάποιο από τα βιβλία είναι "ακριβό" καλώντας τη isExpensive.
     * Συγκρίνετε τον αριθμό σελίδων μεταξύ δύο βιβλίων καλώντας τη hasMorePages.
     * Συγκρίνετε τις τιμές δύο βιβλίων χρησιμοποιώντας τη comparePrice.
     * Ενημερώστε την τιμή ενός βιβλίου με την updatePrice και εμφανίστε την
     * επικαιροποιημένη περιγραφή
     */

    public boolean isExpensive(double threshold) {
        if (threshold >= price) {
            return true;
        } else {
            return false;
        }
    };

    public boolean hasMorePages(Book otherBook) {
        if (pages > otherBook.getPages()) {
            return true;
        } else {
            return false;
        }
    };

    public String comparePrice(Book otherBook) {
        if (price < otherBook.getPrice()) {
            return "Cheaper";
        } else if (price > otherBook.getPrice()) {
            return "Same Price";
        } else {
            return "More Expensive";
        }
    };

    public String printSummary() {

        return description;
    };

    public void updatePrice(double newPrice){
        price = newPrice;
        getBookDescription();
        
    };
}
