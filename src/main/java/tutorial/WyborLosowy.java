package tutorial;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by Piotrek on 2015-06-20.
 */
public class WyborLosowy {
    public static void main(String[] args) {
        String wejscie = JOptionPane.showInputDialog("Ile liczb musisz wybrać?");
        int k = Integer.parseInt(wejscie);

        wejscie = JOptionPane.showInputDialog("Ile jest liczb do wyboru?");
        int n = Integer.parseInt(wejscie);

        //wypełnij tablicę liczbami 1 2 3 . . . n
        int[] liczby = new int[n];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = i + 1;
        }

        //wybierz k liczb i wstaw je do drugiej tablicy
        int[] wynik = new int[k];
        for (int i = 0; i < wynik.length; i++) {
            //wylosuj indeks z przedziału 1 do n
            int l = (int)(Math.random() * n);

            //wybierz element z wylosowanym indeksem
			wynik[i] = liczby[l];

            //przesuń ostatni element pod wylosowany indeks
            liczby[l] = liczby[n-1];
            n--;
        }

        Arrays.sort(wynik);

        JOptionPane.showMessageDialog(null, "Oto wylosowane liczby: " + Arrays.toString(wynik), "Wynik losowania lotto"
                , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
