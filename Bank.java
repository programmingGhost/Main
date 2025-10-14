public class Bank {
    public static void main(String[] args) {
    

        Bankacount acount1 = new Bankacount(10000); // Thanasis
        Bankacount acount2 = new Bankacount(5000); // Maria.
        Bankacount acount3 = new Bankacount(850);//nikos

        acount1.deposit(5000);
        acount1.withdaw(2000);

        System.out.println("Ipoloipo Thanasis: " + acount1.getBalance());

        acount2.deposit(3000);
        acount2.deposit(2000);
        acount2.withdaw(5000);
        acount2.withdaw(15000);

        System.out.println("Ipoloipo Marias: " + acount2.getBalance());

        acount3.deposit(50);
        acount3.deposit(150);
        acount3.withdaw(80);
        acount3.withdaw(800);
        acount3.withdaw(50);

        System.out.println("Ipoloipo Nikos: " + acount3.getBalance());
    }
}
