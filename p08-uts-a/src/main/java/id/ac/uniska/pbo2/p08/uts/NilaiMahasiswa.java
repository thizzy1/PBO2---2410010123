// Nama : M Hafiz Ilmi
// NPM  : 2410010123
package id.ac.uniska.pbo2.uts;

import java.util.Locale;

/**
 * Class data: satu baris nilai mahasiswa beserta perhitungan nilai akhir
 * dan huruf mutu.
 *
 * @author M Hafiz Ilmi
 */
public class NilaiMahasiswa {

    /** Format angka Indonesia: koma sebagai pemisah desimal (82,50). */
    public static final Locale LOKAL = Locale.forLanguageTag("id-ID");

    private final String npm;
    private final String nama;
    private final int tugas;
    private final int uts;
    private final int uas;

    public NilaiMahasiswa(String npm, String nama, int tugas, int uts, int uas) {
        this.npm = npm;
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    /**
     * Nilai akhir = 30% tugas + 30% UTS + 40% UAS. Dihitung dengan bilangan
     * bulat lalu dibagi 10 agar tidak terkena kesalahan pembulatan desimal
     * pada batas huruf mutu (misalnya tepat 80,0).
     */
    public double getNilaiAkhir() {
        return (3 * tugas + 3 * uts + 4 * uas) / 10.0;
    }

    /** Nilai akhir dengan dua angka di belakang koma, misalnya "82,50". */
    public String getNilaiAkhirTeks() {
        return String.format(LOKAL, "%.2f", getNilaiAkhir());
    }

    public String getHurufMutu() {
        double akhir = getNilaiAkhir();
        if (akhir >= 80) {
            return "A";
        } else if (akhir >= 75) {
            return "B+";
        } else if (akhir >= 70) {
            return "B";
        } else if (akhir >= 65) {
            return "C+";
        } else if (akhir >= 60) {
            return "C";
        } else if (akhir >= 40) {
            return "D";
        }
        return "E";
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public int getTugas() {
        return tugas;
    }

    public int getUts() {
        return uts;
    }

    public int getUas() {
        return uas;
    }
}
