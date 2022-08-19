package homework3_Task6;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        BlackPrinter blackPrinter = new BlackPrinter();
        RedPrinter redPrinter = new RedPrinter();
        WightPrinter wightPrinter = new WightPrinter();
        printer.print("Classic");
        blackPrinter.print("Black");
        redPrinter.print("Red");
        wightPrinter.print("Wight");

    }
}
