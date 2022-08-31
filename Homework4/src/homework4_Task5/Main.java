package homework4_Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        ConverterTemperature converterTemperature = new ConverterTemperature();
        converterTemperature.converterKelvin(value);
        converterTemperature.converterFahrenheit(value);
    }
}
