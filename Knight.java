public class Knight {

    private String name;
    private int strength;
    private int honor;
    private int armor;

    // cunstractor
    public Knight() {

    };

    public Knight(String name, int strength, int honor, int armor) {
        this.name = name;
        this.strength = strength;
        this.honor = honor;
        this.armor = armor;
    }

    // Getters and Setters

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHonor(int honor) {
        return honor;
    }

    public int getArmor(int armor) {
        return armor;
    }

    // Methods
    public void defend() {
        honor = honor + 10;
        strength = strength - 5;
    }

    public void attackThief(Thief thief) {
        thief.setStolenGold(thief.getStolenGold() - 20);
        honor = honor + 15;
    }

    public void askWizardForHelp(Wizard wizard) {
        if (wizard.getMana() > 50) {
            strength = strength + 20;
        }
    }
}
