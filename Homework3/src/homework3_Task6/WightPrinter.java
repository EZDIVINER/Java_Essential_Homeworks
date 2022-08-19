package homework3_Task6;

public class WightPrinter extends Printer {

    public static final String ANSI_WHITE = "\u001B[37m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_WHITE+ value);
    }
}
