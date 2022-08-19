package homework3_Task6;

public class BlackPrinter extends Printer{

    public static final String ANSI_BLACK = "\u001B[30m";

    @Override
    public void print(String value) {
        System.out.println(ANSI_BLACK+value);
    }

}
