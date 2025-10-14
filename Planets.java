public class Planets {
    public static void main(String[] args) {

        //Arraylist for the planets
        Planet[] planets;
        planets = new Planet[5];

        Planet p1 = new Planet("Keplar-22b", 6.41, 2.1, 6.3623, true);
        Planet p2 = new Planet("Pluto", 1.303, 2.376, 0.063, false);
        Planet p3 = new Planet("Moon", 1.2, 3.474, 1.62, false);
        Planet p4 = new Planet("Europa", 4.799, 3.061, 1.314, false);
        Planet p5 = new Planet("Mars", 6.4171, 1.4437, 3.72076, false);

        //
        planets[0] = p1;
        planets[1] = p2;
        planets[2] = p3;
        planets[3] = p4;
        planets[4] = p5;

        System.out.println("===========================");

        //For loop for getting a mass of a planet above 1.5
        for (int i = 0; i < planets.length; i++) {
            if (planets[i].getMass() > 1.5) {
                System.out.println(planets[i].getName() + " " + planets[i].getMass());
            }
        }

        System.out.println("===========================");

        p1.planetDescribe();
        System.out.println("---------------------------");
        p2.planetDescribe();
        System.out.println("---------------------------");
        p3.planetDescribe();
        System.out.println("---------------------------");
        p4.planetDescribe();
        System.out.println("---------------------------");
        p5.planetDescribe();

        System.out.println("===========================");

        p1.planetsGravity();
        System.out.println("---------------------------");
        p2.planetsGravity();
        System.out.println("---------------------------");
        p3.planetsGravity();
        System.out.println("---------------------------");
        p4.planetsGravity();
        System.out.println("---------------------------");
        p5.planetsGravity();

        System.out.println("===========================");

        p1.doesThisPlanethaveLife();
        System.out.println("---------------------------");
        p2.doesThisPlanethaveLife();
        System.out.println("---------------------------");
        p3.doesThisPlanethaveLife();
        System.out.println("---------------------------");
        p4.doesThisPlanethaveLife();
        System.out.println("---------------------------");
        p5.doesThisPlanethaveLife();

        System.out.println("===========================");
    }
}
