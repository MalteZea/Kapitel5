package Kapitel5.Opg6;

public class SquareMeterToPing {
    public static void main(String[] args) {
        System.out.println("Ping" + "       " + "Square meter" + "  |  " + "Square meter" + "       " + "Ping");
        for (int i = 0; i <= 14; i++) {
            double ping = 10 + i * 5;
            double squareMeter = ping * 3.305;
            double squareMeterReverse = 30 + i * 5;
            double pingReverse = squareMeterReverse / 3.305;
            System.out.printf("%-10.0f %12.3f  |  %-10.0f %12.3f\n", ping, squareMeter, squareMeterReverse, pingReverse);
        }
    }
}
