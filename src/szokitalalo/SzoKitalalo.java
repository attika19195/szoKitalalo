package szokitalalo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {

<<<<<<< HEAD
    static char[] kiSzo;

    public static char megoldas[] = new char[]{'_', '_'};

    public static void main(String[] args) {
        do {            
            do {            
            tajekoztatas();
            szovalaszto();
            } while (megoldas[1] == '_' || megoldas[0] == '_');
            eredmeny(username, probaszam);
           
        } while (true);
        
        

        

    }
//    public static void szokitalal(){
//    
//    }

    public static String tajekoztatas() {
        Scanner name = new Scanner(System.in);
        System.out.println("Szia, hogy hívnak?");
        String username = name.nextLine();
        System.out.println("Üdvözöllek " + username + ", a SZÓKITATÁLÓ  játékban a feladat lényege hogy kitalálj egy két betűs szót.\nTippelned kell, hogy mi "
                + "lehet a szó,\nha egy betű jó helyen van és benne van,zölden fog megjelenni, "
                + "ha benne van de nem jó helyen akkor narancssárgán fog megjelenni,\nha nincs benne akkor pirosan.\nPróbáld meg"
                + " minél kevesebb lépésből kitalálni a szót sok sikert.");
        return username;
    }

    public static char[] szovalaszto() {
        Random rnd = new Random();
        ArrayList<String> szavak = new ArrayList<String>();
        szavak.add("ki");
        szavak.add("tó");
        szavak.add("le");
        int max = 2;
        String randomElement = szavak.get(rnd.nextInt(max + 1));
        kiSzo = new char[]{randomElement.charAt(0), randomElement.charAt(1)};
        return kiSzo;

    }

//        matepro();


//public static void szokitalal() {
//
//    }
//
//    public static void tajekoztatas() {
//
//    }
//
//    public static void szovalaszto() {
//
//    }
//
//    public static String[] zalanpro() {
//        String valasz[] = new String[2];
//
//        return valasz;
//    }
//
//    public static void matepro() {
//        Scanner scn = new Scanner(System.in);
//        System.out.print("_ _\nSzerinted mi lehet a szó?\n");
//        String tipp = scn.nextLine();
//
//    }

    public static void eredmeny(String username, int probaszam) {
        System.out.println("Nyertél "+ username +"!\n A próbálkozásiad száma: "+ probaszam);
        
=======
    public static char megoldas[] = new char[]{'_', '_'};
    static char[] tipp= new char[2];

    public static void main(String[] args) {
        tipp[0] ='s';
        tipp[1] ='c';
        tombelem_csere();
        System.out.printf("%c %c",megoldas[0],megoldas[1]);
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
        String szin1 = "";
        String szin2 = "";
        System.out.printf("%c %s ",tipp[0],szin1, tipp[1],szin2);
    }
    public static void tombelem_csere(){
        String[] szin= new String[]{"\u001B[42m","\u001B[41m"};
        for (int i = 0; i < 2; i++) {
            if(szin[i].equals("\u001B[42m")){
                megoldas[i]=tipp[i];
            }
        }
>>>>>>> 55a65ba5e0a35ec13eff515d964d7f470dc1f5c3
    }
}



