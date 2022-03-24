package szokitalalo;

import java.util.Scanner;

public class SzoKitalalo {

    public static char megoldas[] = new char[]{'_', '_'};
    static char[] tipp;

    public static void main(String[] args) {
        //matepro();
        //System.out.printf("%s %c %s %c","\u001B[41m", 's',"\u001B[42m",'c');
    }

    public static void szokitalal() {

    }

    public static void tajekoztatas() {

    }

    public static void szovalaszto() {

    }

    public static String[] zalanpro() {
        String valasz[] = new String[2];
        return valasz;
    }
    public static String[] szoeldonto(){
        String valasz[] = new String[2];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {   
            }
        }
        return valasz;
    }

    public static void matepro() {
        Scanner scn = new Scanner(System.in);
        System.out.print("_ _\nSzerinted mi lehet a szó?\n");
        String szo = scn.nextLine();
        tipp = new char[]{szo.charAt(0), szo.charAt(1)};
    }

    public static void eredmeny() {

    }

    public static void szin() {
        String szin1= "";
        String szin2 ="";
        System.out.printf("%c %s ",tipp[0],szin1, tipp[1],szin2);
    }
    public static void tombelem_csere(){
        
    }
}
