
import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan batas deret
        System.out.println("Batas deret (n) : ");
        int n = input.nextInt();

        // Menampilkan judul program
        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");


        // Menampilkan deret menggunakan perulangan for
        System.out.println("for     :");

        // Perulangan dimulai dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            // Menampilkan nilai i
            System.out.println(" " + i);
        }
        System.out.println();


        // Menampilkan deret menggunakan perulangan while
        System.out.println("while       :");

        // Membuat variabel penghitung j
        int j = 1;

        // Perulangan berjalan selama j kurang dari atau sama dengan n
        while (j <= n) {
            // Menampilkan nilai j
            System.out.println(" " + j);

            // Menambah nilai j setiap perulangan
            j++;
        }
        System.out.println();


        // Menampilkan deret menggunakan perulangan do-while
        System.out.println("do-While      :");

        // Membuat variabel penghitung k
        int k = 1;

        // Perintah dijalankan minimal satu kali
        do {
            // Menampilkan nilai k
            System.out.println(" " + k);

            // Menambah nilai k
            k++;
        } while (k <= n);

        System.out.println();


        // Membuktikan perbedaan kondisi i < n dan i <= n

        // Menghitung jumlah perulangan dengan kondisi kurang dari
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        // Menghitung jumlah perulangan dengan kondisi kurang dari atau sama dengan
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        // Menampilkan hasil perhitungan
        System.out.println("i < n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");


        // Menyaring deret angka 1 sampai 10
        // Angka genap dilewati dan perulangan berhenti saat i > 7
        int jumlahPrintln = 0;

        System.out.println("Disaring");

        // Melakukan perulangan dari 1 sampai 10
        for (int i = 1; i <= 10; i++) {

            // Melewati angka genap
            if (i % 2 == 0) {
                continue;
            }

            // Menghentikan perulangan jika angka lebih dari 7
            if (i > 7) {
                break;
            }

            // Menampilkan angka yang lolos penyaringan
            System.out.println(" " + i);

            // Menghitung jumlah angka yang ditampilkan
            jumlahPrintln++;
        }

        // Menampilkan jumlah angka yang berhasil dicetak
        System.out.println();
        System.out.println(" Sampai println    : " + jumlahPrintln + " kali");

    }
}