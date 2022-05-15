package oop.kelas;
import java.util.Scanner;
import java.time.LocalDate;

public class RunDataMhs {
 public static void main(String[] args) {

   int thnLahir;
   // Inisialisasi Data Mahasiswa 1
   DataMhs mhs = new DataMhs();
   mhs.setNrp(1051140009);
   mhs.setNama("Deni Susanto");
   mhs.setTglLahir("12/8/1989");
   mhs.setAlamat("Surabaya");

   // Inisialisasi  Data Mahasiswa 2
   DataMhs mhs2 = new DataMhs();
   mhs2.setNrp(1051140011);
   mhs2.setNama("Fitria Agustin");
   mhs2.setTglLahir("1/2/1987");
   mhs2.setAlamat("Bangkalan");

   // Menampilkan Data Mahasiswa 1
   System.out.println("Data Mahasiswa 1");
   System.out.println("Nrp\t\t: " + mhs.getNrp() + " \nNama\t\t: " + mhs.getNama() + " \nTgl Lahir\t: " + mhs.getTglLahir() + " \nAlamat\t\t: " + mhs.getAlamat() + " \n");

   // Menampilkan Data Mahasiswa 2
   System.out.println("Data Mahasiswa 2");
   System.out.println("Nrp\t\t: " + mhs2.getNrp() + " \nNama\t\t: " + mhs2.getNama() + " \nTgl Lahir\t: "
     + mhs2.getTglLahir() + " \nAlamat\t\t: " + mhs2.getAlamat());

     System.out.println("\n Oke sekarang menghitung umur dari kedua mahasiswa tersebut. \n");
   // Menghitung Umur mahasiswa 1 dan 2

   // inisialisasi inputan
   Scanner InputTglLahir = new Scanner(System.in);
   // inisialisasi tanggal
   LocalDate tgl = LocalDate.now();

   // input tanggal lahir mahasiswa 1
   System.out.print("Masukkan Tahun lahir mahasiswa 1 \t: ");
   thnLahir = InputTglLahir.nextInt();

   // rumus umur mahasiswa 1
   int umur = tgl.getYear() - thnLahir;

   // menampilkan umur mahasiswa 1
   System.out.print("Umur mahasiswa 1 adalah \t\t: " + umur + " tahun \n\n");

   // input tanggal lahir mahasiswa 2
   System.out.print("Masukkan Tahun lahir mahasiswa 2 \t: ");
   thnLahir = InputTglLahir.nextInt();

   // rumus umur mahasiswa 2
   int umur2 = tgl.getYear() - thnLahir;
   System.out.print("Umur mahasiswa 2 adalah \t\t: " + umur2 + " tahun \n\n");
  }
}