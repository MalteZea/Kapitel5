package Kapitel5.Opg3;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Celsius" + "    " + "Fahrenheit");
        for (int celsius = 0; celsius <= 100; celsius++) {
            //Hvorfor skal der castes en double? fahrenheit er jo en double?
            double fahrenheit = (double)celsius * 9 / 5 + 32;
            System.out.printf("%-5s %15s\n", celsius, fahrenheit);
        }
    }
}
