

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Perkenalan Mahasiswa Dengan Menggunakan Konsep OOP
 */
package pbo3.pkg10117110.latihan31.perkenalanmahasiswa;


public class PBO310117110Latihan31PerkenalanMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
            mhs1.nim = "10110269";
            mhs1.nama = "Rizki Adam Kurniawan";
            mhs1.perkenalanMahasiswa(mhs1.nim, mhs1.nama);
            
        Mahasiswa mhs2 = new Mahasiswa();
            mhs2.nim = "10110270";
            mhs2.nama = "Indra Tiola";
            mhs2.perkenalanMahasiswa(mhs2.nim, mhs2.nama);
            
        Mahasiswa mhs3 = new Mahasiswa();
            mhs3.nim = "10110272";
            mhs3.nama = "Robi Tanzil Ganefi";
            mhs3.perkenalanMahasiswa(mhs3.nim, mhs3.nama);
            
        Mahasiswa mhs4 = new Mahasiswa();
            mhs4.nim = "10110272";
            mhs4.nama = "Muhammad Nur Awaludin";
            mhs4.perkenalanMahasiswa(mhs1.nim, mhs1.nama);
            
        

    }
    
}
