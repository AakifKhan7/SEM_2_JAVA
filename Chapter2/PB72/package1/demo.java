package Chapter2.PB72.package1;

public class demo {
    protected String protectedMessage = "This is PROTECTED";
    String defaultMessage = "This is DEFAULT (package-private)";

    public void showMessages() {
        System.out.println(protectedMessage);
        System.out.println(defaultMessage);
    }
}
