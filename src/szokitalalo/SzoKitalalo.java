package szokitalalo;

import java.util.Scanner;

public class SzoKitalalo {
    public static char megoldas[] = new char[]{'_', '_'};
    public static void main(String[] args) {
        matepro();
    }
    public static void szokitalal(){
    
    }
    public static void tajekoztatas(){
    
    }
    public static void szovalaszto(){
    
    }
    public static String[] zalanpro(){
        String valasz[] = new String[2];
        
        return valasz;
    }
    public static char[] matepro(){
        Scanner scn = new Scanner(System.in);
        System.out.print("_ _\nSzerinted mi lehet a szó?\n");
        String szo = scn.nextLine();
        char[] tipp =  new char[]{szo.charAt(0),szo.charAt(1)};
        return tipp;
    }
    public static void eredmeny(){
    
    }
    
}
