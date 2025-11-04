import java.util.Scanner;

public class LatihanUKLsulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Jumlah Siswa");
        int JumlahSiswa = input.nextInt();
        int temp = 0;

        for (int i = 1; i<= JumlahSiswa; i++) {
            System.out.println("Masukkan Nilai Siswa ke-"+i);
            int nilai = input.nextInt();
            temp+= nilai;
        }
        System.out.println("Total Rata-Rata Siswa Adalah "+ temp/JumlahSiswa);
    }

    
}
