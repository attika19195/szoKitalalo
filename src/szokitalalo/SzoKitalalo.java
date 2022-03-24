package szokitalalo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {

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
        
    }
}



