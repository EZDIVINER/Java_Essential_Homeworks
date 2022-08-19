package homework3_Task6;

public class RedPrinter extends Printer{
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_RED+value);
    }

}
