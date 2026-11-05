// Nama : M Hafiz Ilmi
// NPM  : 2410010123
package id.ac.uniska.pbo2.uts;

/**
 * Aturan validasi isian tanpa GUI (pola dari Validator Pertemuan 6).
 * Setiap method mengembalikan pesan kesalahan, atau null jika isian benar.
 *
 * @author M Hafiz Ilmi
 */
public final class Validator {

    private Validator() {
    }

    public static String npm(String npm) {
        if (npm == null || !npm.trim().matches("\\d{10}")) {
            return "NPM harus 10 digit angka";
        }
        return null;
    }

    public static String nama(String nama) {
        if (nama == null || nama.isBlank()) {
            return "Nama wajib diisi";
        }
        return null;
    }

    /** Nilai berupa bilangan bulat 0 sampai 100. */
    public static String nilai(String teks, String namaIsian) {
        String pesan = "Nilai " + namaIsian + " harus angka bulat 0 sampai 100";
        if (teks == null || !teks.trim().matches("\\d{1,3}")) {
            return pesan;
        }
        int angka = Integer.parseInt(teks.trim());
        if (angka < 0 || angka > 100) {
            return pesan;
        }
        return null;
    }
}
