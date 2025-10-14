public class Shark extends Fish {
    private int numberOfTeeth;

    public Shark(){

    }

    public Shark(String name, double averageDepth, boolean isDangerous, String waterType, int numberOfTeeth){
        super(name, averageDepth, isDangerous, waterType);
        this.numberOfTeeth = numberOfTeeth;
    }

    // getter
    public int getNumberOfTeeth(){
        return numberOfTeeth;
    }

    // setter
    public void setNumberOfTeeth(int numberOfTeeth){
        this.numberOfTeeth = numberOfTeeth;
    }

    // method
    public void displayInfo(boolean showDangerLevel){
        super.displayInfo();
        System.out.println("\n\n Number of teeth: " + getNumberOfTeeth() + "\n\n" + "Danger level: " + true);
    }
}
