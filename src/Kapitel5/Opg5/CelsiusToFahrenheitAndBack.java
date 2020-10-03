package Kapitel5.Opg5;

public class CelsiusToFahrenheitAndBack {
    public static void main(String[] args) {
        System.out.println("Celsius" + "    " + "Fahrenheit" + "   |   " + "Fahrenheit" + "    " + "Celsius");
        for (int celsius = 0; celsius <= 100; celsius++) {
            double fahrenheit = (double)celsius * 9/5 +32;
            int fahrenheitReverse = celsius / 2 * 5 + 20;
            double celsiusReverse = (double)(fahrenheitReverse - 32) / 9 * 5;
            System.out.printf("%-5d %15.3f   |   %-5d %15.3f\n", celsius, fahrenheit, fahrenheitReverse, celsiusReverse);
            celsius++;
        }
    }
}
