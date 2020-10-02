package Kapitel5.Opg4;

public class Conversion {
    public static void main(String[] args) {
        System.out.println("Inches" + "          " + "Centimeters");
        int inches;
        double centimeters = 0;

        for (inches = 1; inches <= 10; inches++) {
            centimeters = inches * 2.54;
            System.out.printf("%-15s %s\n", inches, centimeters);
        }
    }
}
