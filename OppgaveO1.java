import java.util.Scanner;

public class OppgaveO1 {

    private static double trinnskattBeregning(int input, int nedreGrense, int ovreGrense, double prosent) {
        double trinn = 0;
        if (input > nedreGrense) {
            trinn = input - nedreGrense;
            if (input > ovreGrense) {
                trinn = ovreGrense - nedreGrense;
            }
            trinn = trinn * prosent;
        }
        return trinn;
    }

    public static void main(String[] args) {
        Scanner inputTastatur = new Scanner(System.in);

        System.out.print("Skriv inntekten din: ");
        int inntekt = inputTastatur.nextInt();
        double trinnskatt = 0;

        trinnskatt = trinnskatt + trinnskattBeregning(inntekt,217400,306050,0.017);

        trinnskatt = trinnskatt + trinnskattBeregning(inntekt,306050,697150,0.04);

        trinnskatt = trinnskatt + trinnskattBeregning(inntekt,697150,942400,0.137);

        trinnskatt = trinnskatt + trinnskattBeregning(inntekt,942400,1410750,0.167);

        trinnskatt = trinnskatt + trinnskattBeregning(inntekt,1410750,2000000000,0.177);

        System.out.println("Den totale trinnskatten din er: " + trinnskatt + " kr");

    }

}
