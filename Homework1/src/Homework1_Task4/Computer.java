package Homework1_Task4;

public class Computer {
    int name;

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < computers.length; i++) {
            computers[i].name = i+1;
            System.out.println("compputers: " + computers[i].name);
        }
    }
}


