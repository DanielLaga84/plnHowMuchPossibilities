package LiczenieGroszy;

import java.util.Scanner;

public class Main extends Thread {

    public static void main(String[] args) {
        int ilesposobow = 0;
        int zmienna;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zmienna w groszach :");
        zmienna = scanner.nextInt();


        for (int i500 = 0; i500 <= zmienna / 500; i500++) {
            for (int i200 = 0; i200 <= zmienna / 200; i200++) {
                for (int i100 = 0; i100 <= zmienna / 100; i100++)
                    for (int i50 = 0; i50 <= zmienna / 50; i50++) {
                        for (int i20 = 0; i20 <= zmienna / 20; i20++) {
                            for (int i10 = 0; i10 <= zmienna / 10; i10++) {
                                for (int i5 = 0; i5 <= zmienna / 5; i5++) {
                                    for (int i2 = 0; i2 <= zmienna / 2; i2++) {
                                        for (int i1 = 0; i1 <= zmienna / 1; i1++) {
                                            int grosze = i1 + i2 * 2 + i5 * 5 + i10 * 10 + i20 * 20 + i50 * 50 + i100 * 100 + i200 * 200 + i500 * 500;
                                            if (grosze == zmienna) {
                                                ilesposobow++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
            }
        }

        System.out.println(ilesposobow + " tyle jest sposobów by zapłacić " + (double) zmienna / 100 + " złotych!");
    }
}
