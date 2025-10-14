public class MarineOrganism {

    private String name;
    private double averageDepth;
    private boolean isDangerous;

    public MarineOrganism() {

    }

    public MarineOrganism(String name, double averageDepth, boolean isDangerous) {
        this.name = name;
        this.averageDepth = averageDepth;
        this.isDangerous = isDangerous;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getAverageDepth() {
        return averageDepth;
    }

    public boolean getIsDangerous() {
        return isDangerous;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAverageDepth(double averageDepth) {
        this.averageDepth = averageDepth;
    }

    public void setIsDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    // methods
    public void displayInfo() {
        System.out.println("Name of the organism: " + getName() + "\n\n" + "Organisms depth level: " + getAverageDepth()
                + "\n\n" + "Is the organism dangerous: " + getIsDangerous());
    }
}
