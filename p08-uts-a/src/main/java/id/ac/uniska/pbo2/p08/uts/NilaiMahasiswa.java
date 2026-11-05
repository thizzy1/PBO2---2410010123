/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08.uts;

/**
 *
 * @author Ideapad Slim 1
 */
// NPM 
public class NilaiMahasiswa {

    public class NilaiMahasiswa {

        private String npm;
        private String nama;
        private int tugas;
        private int uts;
        private int uas;

        // Constructor
        public NilaiMahasiswa(String npm, String nama, int tugas, int uts, int uas) {
            this.npm = npm;
            this.nama = nama;
            this.tugas = tugas;
            this.uts = uts;
            this.uas = uas;
        }

        // Method perhitungan nilai akhir sesuai bobot spesifikasi
        public double getNilaiAkhir() {
            return (0.30 * tugas) + (0.30 * uts) + (0.40 * uas);
        }

        // Method penentuan huruf mutu berdasarkan nilai akhir
        public String getHurufMutu() {
            double akhir = getNilaiAkhir();
            if (akhir >= 80 && akhir <= 100) {
                return "A";
            } else if (akhir >= 75 && akhir < 80) {
                return "B+";
            } else if (akhir >= 70 && akhir < 75) {
                return "B";
            } else if (akhir >= 65 && akhir < 70) {
                return "C+";
            } else if (akhir >= 60 && akhir < 65) {
                return "C";
            } else if (akhir >= 40 && akhir < 60) {
                return "D";
            } else {
                return "E";
            }
        }

        // Getters untuk mengambil data ke tabel
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
}
