package Modul1;

import java.util.Scanner;
public class PRAK104_2210817220020_HelenaRosalina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String tanganAbu = scanner.nextLine();

        System.out.print("Tangan Bagas: ");
        String tanganBagas = scanner.nextLine();

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i <= 4; i+=2) {


            if ((tanganAbu.charAt(i) == 'B' && tanganBagas.charAt(i) == 'G') ||
                    (tanganAbu.charAt(i) == 'G' && tanganBagas.charAt(i) == 'K') ||
                    (tanganAbu.charAt(i) == 'K' && tanganBagas.charAt(i) == 'B')) {
                poinAbu++;
            } else if (tanganAbu.charAt(i) ==  tanganBagas.charAt(i)){
                continue;}
            else {
                poinBagas++; }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
