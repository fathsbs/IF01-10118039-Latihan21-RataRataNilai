
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang dapat menghasilkan rata-rata nilai dari suatu input-an  
 */
public class RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, totalMahasiswa;
        double Total;
        double nilai;

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        totalMahasiswa = masuk.nextInt();

        i = 1;
        Total = 0;

        while (i <= totalMahasiswa) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = masuk.nextDouble();
            Total += nilai;

            i++;
        }

        System.out.println("\nMaka,Rata-rata Nilainya adalah " + Total / totalMahasiswa);
        System.out.println("Developed by : Fatahillah Satria Bima Seno");
    }

}
