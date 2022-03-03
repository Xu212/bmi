package progtetel;

import java.util.Random;

public class Primmeth {
        static int szam = 10001;
        static int oszto = 0;
        static int i = 2;
    public static void main(String[] args) {
        int[] sorozat = {10001, 2, 1, 10007, new Random().nextInt()};
        listakiratas(sorozat);
        //prime();
        /*boolean vanOsztoja = i< szam - 1
          boolean nincsOsztoja = i >=szam-1
          boolean prim = i >= szam-1
          prim = i > Math.sqrt(szam)*/
        System.out.println("Ennyi db prím van: "+hanydarabprimvan(sorozat));
    }
    
    static int primvizsgalat(){
        while (i<= Math.sqrt(szam)  && !(szam%i==0) ) {            
                i++;
            }
        return i;
    }
    
    static boolean prime(int a){
        if(a < 2){
            return false;
        }
        else{
            primvizsgalattombelemei(a);
        return i > Math.sqrt(a);
        }
    }
    
    static void listakiratas(int[] sorozat){
        for (int j = 0; j < sorozat.length; j++) {
            System.out.println(sorozat[j]);
        }
    }
    
    static int primvizsgalattombelemei(int szam){
        while (i<= Math.sqrt(szam)  && !(szam%i==0) ) {            
                i++;
            }
        return i;
    }
    
    static int hanydarabprimvan(int[] sorozat){
        int dbprim = 0;
        for (int j = 0; j < sorozat.length; j++) {
            if(prime(sorozat[j])){
                dbprim++;
            }
        }
        return dbprim;
    }
}
