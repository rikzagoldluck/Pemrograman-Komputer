package praktikum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BilanganGanjil {
    public static void main(String[] args) throws IOException {
        // Memasukkan nilai batas atas
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        int batasAtas, batasBawah;

        try {
            System.out.print("Masukkan nilai batas atas : ");
            batasAtas = Integer.parseInt(stdIn.readLine());
            System.out.println("Nilai batas atas adalah " + batasAtas);

            // Memasukkan nilai batas bawah
            System.out.print("Masukkan nilai batas bawah : ");
            batasBawah = Integer.parseInt(stdIn.readLine());
            System.out.println("Nilai batas bawah adalah " + batasBawah);

            // Pembatas nilai yang akan di tampilkan
            System.out.println("Deret bilangan ganjil dari " + batasBawah + " sampai " + batasAtas + " adalah ");
            for (int i = batasBawah ; i <= batasAtas; i++){
                // Menyeleksi bilangan ganjil
                if (i % 2 == 1) {
                    System.out.print(i + "; ");
                }
            }

        }
        catch (Exception error){
            System.out.println("Erorrnya adalah = " + error);
        }
    }
}
