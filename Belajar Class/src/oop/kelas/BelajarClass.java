package oop.kelas;


class PersegiPanjang {
    int panjang;
    int lebar;
    // private int panjang;
    // private int lebar;
}
// menambahkan class Persegi
class Persegi {
    int sisi;
}

public class BelajarClass {
    public static void main(String[] args) {
        int luasPsPanjang;
        int luasPersegi;
        PersegiPanjang ps = new PersegiPanjang();

        // Mengisi nilai ke dalam atribut persegi panjang
        ps.panjang = 5;
        ps.lebar = 6;
        luasPsPanjang = ps.panjang * ps.lebar;
        System.out.println("\nLuas Persegi panjang adalah : " + luasPsPanjang);
        Persegi psg = new Persegi();
        psg.sisi = 10;
        luasPersegi = psg.sisi * psg.sisi;
        System.out.println("\nLuas Persegi : " + luasPersegi + "\n");
    }
}
