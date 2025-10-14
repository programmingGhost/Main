public class MainMarineOrganisms {

    public static int countDangerousOrganisms(MarineOrganism[] organisms) {
        int count = 0;
        for (MarineOrganism organism : organisms) {
            if (organism.getIsDangerous()) {
                count++;
            }
        }
        return count;
    }

    public static double calculateAverageDepth(MarineOrganism[] organisms) {
        if (organisms.length == 0) {
            return 0;
        }
        int totalDepth = 0;
        for (MarineOrganism organism : organisms) {
            totalDepth += organism.getAverageDepth();
        }
        return (double) totalDepth / organisms.length;
    }

    public static void main(String[] args) {

        MarineOrganism[] organism;
        organism = new MarineOrganism[3];

        MarineOrganism mo1 = new MarineOrganism("Great white shark", 200.0, true);
        MarineOrganism mo2 = new MarineOrganism("Angler", 2.000, false);
        MarineOrganism mo3 = new MarineOrganism("Barracuda", 110, true);

        organism[0] = mo1;
        organism[1] = mo2;
        organism[2] = mo3;

        System.out.println("===========================");

        mo1.displayInfo();
        System.out.println("---------------------------");
        mo2.displayInfo();
        System.out.println("---------------------------");
        mo3.displayInfo();

        System.out.println("===========================");

        System.out.println("Average depth: " + calculateAverageDepth(organism));
    }
}
