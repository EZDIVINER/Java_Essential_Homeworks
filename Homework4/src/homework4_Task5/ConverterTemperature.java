package homework4_Task5;

public class ConverterTemperature {

    void converterKelvin(int value){
        double result = value + 273.15;
        System.out.println("Kelvin - " + result);
   }
   void converterFahrenheit(int value){
        double result = value*9/5+32;
       System.out.println("Fahrenheit - " + result);

   }
}
