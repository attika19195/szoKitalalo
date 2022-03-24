package szokitalalo;

import java.util.Scanner;

public class SzoKitalalo {

    public static void main(String[] args) {
        tajekoztatas();
        szovalaszto();

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


    public static void szovalaszto(){
        
    }
}
//    public static String[] zalanpro(){
//        String valasz[] = new String[3];
//        return valasz;
//    }
//    public static void matepro(){
//    
//    }
//    public static void eredmeny(){
//    
//    }

