package struktury_danych;

public class Tablice {

    //przypadek 1
    public int[] liczbyOdKoncaNaParzystychIndeksach(int[] tab) {
        for (int i = (tab.length - 1); i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println();
        return tab;
    }

    //drugi przypadek
    public int[] sumaLiczbPodzielnychPrzez3(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 3 == 0) {
                suma = suma + tab[i];
            }
        }
        System.out.println(suma);
        return tab;
    }

    public void suma5LiczbMinusOstatni(int[] tab) {

        if (tab.length >= 6) {
            int suma = 0;

            for (int i = 0; i < 5; i++) {
                suma += tab[i];
            }
            suma = suma - tab[tab.length - 1];
            //suma = suma - tab.length;
            //System.out.println(tab.length);
            System.out.println(suma);
        }
        //return suma;
    }

    public static void main(String[] args) {
        Tablice tablice = new Tablice();
        int[] tab = {3, 3, 0, 100, -5,7,89,4,50};
        tablice.liczbyOdKoncaNaParzystychIndeksach(tab);
        tablice.sumaLiczbPodzielnychPrzez3(tab);
        tablice.suma5LiczbMinusOstatni(tab);

    }
}
