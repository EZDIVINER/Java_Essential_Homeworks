package homework4_Task2;

public class Main {
    public static void main(String[] args) {
        XMLHandler xmlHandler = new XMLHandler();
        TXTHandler txtHandler = new TXTHandler();
        DOCHandler docHandler = new DOCHandler();

        abstractHandler(xmlHandler);
        System.out.print("\n");
        abstractHandler(txtHandler);
        System.out.print("\n");
        abstractHandler(docHandler);
        System.out.print("\n");
    }
    public static void abstractHandler (AbstractHandler value){
        value.open();
        value.create();
        value.create();
        value.save();
    }
}
