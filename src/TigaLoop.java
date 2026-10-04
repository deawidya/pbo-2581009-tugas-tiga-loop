
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

    }
}