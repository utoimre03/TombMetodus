package main;

public class TombMetodus {

    private static int[] tomb;
    private static int veletlenszam;

    public static void main(String[] args) {
        int[] tomb1 = tombFeltolt();
        tombKiiras("1. tömb:", tomb1);
        
        int[] tomb2 = tombFeltolt();
        tombKiiras("2. tömb:", tomb2);
    }

    private static int[] tombFeltolt() {
        tomb = new int[ (veletlenSzam())];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = veletlenSzam();
        }
        return tomb;
    }
    
    static void tombKiiras(String cim, int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
    }

    private static int veletlenSzam() {
        veletlenszam = (int) (Math.random() * 10)+1;
        return veletlenszam;
    }

    private static void kiIratas(String uzenet) {
        System.out.println(uzenet);
    }
    
}
