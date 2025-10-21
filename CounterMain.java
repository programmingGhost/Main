public class CountersMain {
    public static void main(String[] args) {

        Counter count1 = new Counter();
        Counter count2 = new Counter();
        Counter count3 = new Counter();

        // Αύξανη κατά ένα το μετρημα
        count1.increment();
        count2.increment();
        count3.increment();

        // Αύξανη κατά 10 το μερρημα
        count1.incrementBy(10);
        count2.incrementBy(10);
        count3.incrementBy(10);

        // Μηδενιζη το τρίτο μετρημα
        count3.reset();

        // Αντιγραφή τη δεύτερη μετρητης στο τρίτο
        count3 = new Counter(count2.getValue());

        // Αντιγραφή της τιμής του δεύτερου και τρίτου στον πρώτο μετρητή
        count1 = new Counter(count2.getValue() + count3.getValue());

        System.out.println("==============================");

        System.out.println("Count one: " + count1.getValue());
        System.out.println("Count two: " + count2.getValue());
        System.out.println("Count three: " + count3.getValue());

        System.out.println("==============================");

    }
}
