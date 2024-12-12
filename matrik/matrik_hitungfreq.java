import java.util.Scanner;

public class matrik_hitungfreq {
    public static char[][] bacaMatriks(int m, int n) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrik = new char[m][n];
        System.out.println("Masukkan elemen matriks secara manual (karakter):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrik[i][j] = scanner.next().charAt(0);
            }
        }
        scanner.close();
        return matrik;
        
    }

    public static void tulisMatriks(char[][] matrik, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrik[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int hitungFrekuensiA(char[][] matrik, int m, int n) {
        int frekuensi = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrik[i][j] == 'A') {
                    frekuensi++;
                }
            }
        }
        return frekuensi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca ukuran matriks
        System.out.print("Masukkan jumlah baris (m): ");
        int m = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom (n): ");
        int n = scanner.nextInt();

        // Membaca matriks dari input
        char[][] matrik = bacaMatriks(m, n);

        // Menampilkan matriks
        System.out.println("Matriks yang dihasilkan:");
        tulisMatriks(matrik, m, n);

        // Menghitung frekuensi huruf 'A'
        int frekuensiA = hitungFrekuensiA(matrik, m, n);
        System.out.println("Frekuensi huruf 'A': " + frekuensiA);

        scanner.close();
    }
}
