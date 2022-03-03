package bmi;

import java.util.Scanner;

public class BmiSzamolo {
    public static void main(String[] args) {
        kiir("Bmi számolás");
        int tomeg = beker("Adja meg a tömegét[40, 150]: ", 40, 150);
        int mag = beker("Adja meg a magasságát[100, 200]: ", 100, 200);
        double meter = meterrevalt(mag);
        double ertek = bmikeplet(tomeg, meter);
        String str = Double.toString(ertek);
        kiir(str);
    }
    
    static void kiir(String szoveg){
        System.out.println(szoveg);
    }
    
    static int beker(String szoveg, int hatar1, int hatar2){
        Scanner scn = new Scanner(System.in);
        kiir(szoveg);
        int szam = scn.nextInt();
        while(!(szam>=hatar1) && !(szam<=hatar2)){
            kiir("Nem jó adjon adjon meg egy rendeset.");
            kiir(szoveg);
            szam = scn.nextInt();
        }
        return szam;
    }
    
    static double bmikeplet(int tomeg, double magassag){
        double bmi = tomeg/Math.pow(magassag, 2);
        return bmi;
    }
    
    static double meterrevalt(int szam){
        double vissza;
        vissza = szam / 100.0;
        return vissza;
    }
}
