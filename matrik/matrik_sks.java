import java.util.Scanner;

public class matrik_sks {

    static class Nilai {
        int sks;
        char indeksNilai;

        public Nilai(int sks, char indeksNilai) {
            this.sks = sks;
            this.indeksNilai = indeksNilai;
        }

        public double getBobot() {
            switch (indeksNilai) {
                case 'A': return 4.0;
                case 'B': return 3.0;
                case 'C': return 2.0;
                case 'D': return 1.0;
                case 'E': return 0.0;
                default: return 0.0;
            }
        }
    }

    public static Nilai[][] bacaMatriks(int m, int n) {
        Scanner scanner = new Scanner(System.in);
        Nilai[][] matriks = new Nilai[m][n];

        System.out.println("Masukkan data nilai mahasiswa (SKS dan Indeks Nilai):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Mahasiswa " + (i + 1) + ", Mata Kuliah " + (j + 1) + ":");
                System.out.print("  SKS: ");
                int sks = scanner.nextInt();
                System.out.print("  Indeks Nilai (A/B/C/D/E): ");
                char indeksNilai = scanner.next().toUpperCase().charAt(0);
                matriks[i][j] = new Nilai(sks, indeksNilai);
            }
        }

        scanner.close();
        return matriks;
    }

    public static void tulisMatriks(Nilai[][] matriks, int m, int n) {
        System.out.println("Data Nilai Mahasiswa:");
        for (int i = 0; i < m; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print("[SKS: " + matriks[i][j].sks + ", Indeks: " + matriks[i][j].indeksNilai + "] ");
            }
            System.out.println();
        }
    }

    public static double hitungNR(Nilai[] nilaiMhs) {
        double totalNilai = 0;
        int totalSKS = 0;

        for (Nilai nilai : nilaiMhs) {
            totalNilai += nilai.getBobot() * nilai.sks;
            totalSKS += nilai.sks;
        }

        return totalSKS > 0 ? totalNilai / totalSKS : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah mahasiswa dan mata kuliah
        System.out.print("Masukkan jumlah mahasiswa (m): ");
        int m = scanner.nextInt();
        System.out.print("Masukkan jumlah mata kuliah (n): ");
        int n = scanner.nextInt();

        // Membaca data nilai mahasiswa
        Nilai[][] matriks = bacaMatriks(m, n);

        // Menampilkan data matriks
        tulisMatriks(matriks, m, n);

        // Menghitung dan menampilkan NR setiap mahasiswa
        System.out.println("Nilai Rata-rata (NR) setiap mahasiswa:");
        for (int i = 0; i < m; i++) {
            double nr = hitungNR(matriks[i]);
            System.out.printf("Mahasiswa %d: %.2f\n", (i + 1), nr);
        }

        scanner.close();
    }
}