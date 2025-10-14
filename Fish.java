public class Fish extends MarineOrganism{
    private String waterType;
    
    public Fish(){

    }

    public Fish(String name, double averageDepth, boolean isDangerous, String waterType){
        super(name, averageDepth, isDangerous);
        this.waterType = waterType;
    }

    // getter
    public String getWaterType(){
        return waterType;
    }

    //setter
    public void setWaterType(String waterType){
        this.waterType = waterType;
    }

    //methods
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("\n\n Water type: " + getName());
    }
}
