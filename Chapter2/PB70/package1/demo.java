package Chapter2.PB70.package1;

public class demo {
    private int pValue = 10;
    int defValue = 5;
    protected int proValue = 15;
    public int pubValue = 20;

    public void showValues() {
        System.out.println("Private Value: " + pValue);
        System.out.println("Default Value: " + defValue);
        System.out.println("Protected Value: " + proValue);
        System.out.println("Public Value: " + pubValue);
    }
}
