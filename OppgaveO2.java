import java.util.Scanner;

public class OppgaveO2 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Skriv inn poengsum her til elev nr. " + i + ": ");
            int poengsum = input.nextInt();

            if (poengsum > 100 || poengsum < 0) {
                System.out.println("Ugyldig tall, vennligst prøv igjen.");
                i--;
            } else {
                switch(poengsum/10) {
                    case 0: case 1: case 2: case 3:
                        System.out.println("Karakter: F");
                        break;
                    case 4:
                        System.out.println("Karakter: E");
                        break;
                    case 5:
                        System.out.println("Karakter: D");
                        break;
                    case 6: case 7:
                        System.out.println("Karakter: C");
                        break;
                    case 8:
                        System.out.println("Karakter: B");
                        break;
                    case 9: case 10:
                        System.out.println("Karakter A");
                        break;
                    default:
                        System.out.println("Feilkilde ukjent.");
                }
            }
        }
        input.close();
    }
}