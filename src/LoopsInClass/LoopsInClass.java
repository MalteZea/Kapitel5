package LoopsInClass;

public class LoopsInClass {
    public static void main(String[] args) {

        //Der er 3 loops: for, while og do-while

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        int opvaskeMax = 10;
        int tallerknerIMaskinen = 10;

        do {
            System.out.println("Nu er der " + tallerknerIMaskinen + " tallerkner i maskinen.");
            tallerknerIMaskinen++;
            System.out.println("Jeg har lagt endnu en tallerken i maskinen.");
        } while (tallerknerIMaskinen < opvaskeMax);

            System.out.println("**************** Der er " + tallerknerIMaskinen +
                " tallerkner i maskinen.");
    }
}
