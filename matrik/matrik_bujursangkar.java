import java.util.Scanner;

public class matrik_bujursangkar {
    public static int[][] bacaMatriks(int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrik = new int[n][n];
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrik[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return matrik;
        
    }

    public static void tulisMatriks(int[][] matrik) {
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                System.out.print(matrik[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean apakahSegitigaAtas(int[][] matrik) {
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrik[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran matriks (n): ");
        int n = scanner.nextInt();

        int[][] matrik = bacaMatriks(n);

        System.out.println("Matriks yang dihasilkan:");
        tulisMatriks(matrik);

        if (apakahSegitigaAtas(matrik)) {
            System.out.println("Matriks adalah matriks segitiga atas.");
        } else {
            System.out.println("Matriks bukan matriks segitiga atas.");
        }

        scanner.close();
    }
}