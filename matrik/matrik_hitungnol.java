import java.util.Scanner;

public class matrik_hitungnol {
    public static int[][] bacaMatriks(int m, int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrik = new int[m][n];
        System.out.println("Masukkan elemen matriks secara manual (integer):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrik[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return matrik;
    }

    public static void tulisMatriks(int[][] matrik, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrik[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean adaBarisNol(int[][] matrik, int m, int n) {
        for (int i = 0; i < m; i++) {
            boolean semuaNol = true;
            for (int j = 0; j < n; j++) {
                if (matrik[i][j] != 0) {
                    semuaNol = false;
                    break;
                }
            }
            if (semuaNol) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca ukuran matriks
        System.out.print("Masukkan jumlah baris (m): ");
        int m = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom (n): ");
        int n = scanner.nextInt();

        // Membaca matriks dari input
        int[][] matrik = bacaMatriks(m, n);

        // Menampilkan matriks
        System.out.println("Matriks yang dihasilkan:");
        tulisMatriks(matrik, m, n);

        // Mengecek apakah ada baris yang semua elemennya 0
        if (adaBarisNol(matrik, m, n)) {
            System.out.println("Ada baris yang semua elemennya 0.");
        } else {
            System.out.println("Tidak ada baris yang semua elemennya 0.");
        }

        scanner.close();
    }
}