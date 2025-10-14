public class Planet {
    
    private String name;
    private double mass;
    private double size;
    private double gravity;
    private boolean isLivabelOrNotLivabal;

    //constractor

    public Planet() {

    };

    public Planet(String name, double mass, double size, double gravity, boolean isLivabelOrNotLivabal){
        this.name = name;
        this.mass = mass;
        this.size = size;
        this.gravity = gravity;
        this.isLivabelOrNotLivabal = isLivabelOrNotLivabal;
    };

    //Getters and Setters

    //Setters

    public void setName(String name){
        this.name = name;
    }

    public void setMass(double mass){
        this.mass = mass;
    }

    public void setSize(double size){
        this.size = size;
    }

    public void setGravity(double gravity){
        this.gravity = gravity;
    }

    public void setIsLivabelOrNotLivabal(boolean isLivabelOrNotLivabal){
        this.isLivabelOrNotLivabal = isLivabelOrNotLivabal;
    }

    //Getters

    public String getName(){
        return name;
    }

    public double getMass(){
        return mass;
    }

    public double getSize(){
        return size;
    }

    public double getGravity(){
        return gravity;
    }

    public boolean getIsLivabelOrNotLivabal(){
        return isLivabelOrNotLivabal;
    }

    //Methods

    public void planetDescribe(){
        System.out.println("The planet's name is " + getName() + " and it's mass is " + getMass() + " with the gravity of " + getGravity() + ", the habitability is " + getIsLivabelOrNotLivabal());
    }

    public void planetsGravity(){
        if(getGravity() > 5){
            System.out.println("The gravity of the " + getName() + " is " + getGravity());
        }
    }

    public void doesThisPlanethaveLife(){
        if(isLivabelOrNotLivabal == true){
            System.out.println("This planet is habitable ");
        }else{
            System.out.println("This planet is not habitable ");
        }
    }


}
