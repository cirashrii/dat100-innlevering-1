import java.util.Scanner;
//husk å skrive om kommentarene/printlinene
public class OppgaveO3 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn et verdi for n: ");
        int n = input.nextInt();
        int totalSum = 1;

        if (n > 0) {
            System.out.print("1");
            for (int i = 2; i <= n; i++) {
                System.out.print(" * " + i);
                totalSum *= i;
            }
            System.out.println("\nTotalsum av " + n + "! = " + totalSum);
        } else if (n == 0) {
            System.out.println("Totalsum av 0! = 1");
        } else {
            System.out.println("Ugyldig tall, vennligst prøv igjen.");
        }
    }
}