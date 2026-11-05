/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08.uts;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ideapad Slim 1
 */

//Nama : M Hafiz Ilmi NPM : 2410010123
public class TabelModelNilai {

    public class TabelModelNilai extends AbstractTableModel {

        // List untuk menampung semua data mahasiswa
        private final List<NilaiMahasiswa> listData = new ArrayList<>();

        // Nama-nama kolom sesuai spesifikasi
        private final String[] namaKolom = {"NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"};

        @Override
        public int getRowCount() {
            return listData.size();
        }

        @Override
        public int getColumnCount() {
            return namaKolom.length;
        }

        @Override
        public String getColumnName(int column) {
            return namaKolom[column];
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            NilaiMahasiswa mhs = listData.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return mhs.getNpm();
                case 1:
                    return mhs.getNama();
                case 2:
                    return mhs.getTugas();
                case 3:
                    return mhs.getUts();
                case 4:
                    return mhs.getUas();
                case 5:
                    return String.format("%.2f", mhs.getNilaiAkhir()); // Format 2 angka di belakang koma
                case 6:
                    return mhs.getHurufMutu();
                default:
                    return null;
            }
        }

        // Method untuk menambah data dari form GUI ke dalam tabel
        public void tambahData(NilaiMahasiswa mhs) {
            listData.add(mhs);
            // Memberitahu JTable bahwa ada baris baru yang dimasukkan
            fireTableRowsInserted(listData.size() - 1, listData.size() - 1);
        }

        // Method untuk mengecek apakah NPM sudah ada (untuk validasi data ganda)
        public boolean isNpmExists(String npm) {
            for (NilaiMahasiswa mhs : listData) {
                if (mhs.getNpm().equals(npm)) {
                    return true;
                }
            }
            return false;
        }

        // Mengambil total rata-rata untuk label ringkasan
        public double getRataRataKelas() {
            if (listData.isEmpty()) {
                return 0.0;
            }
            double total = 0.0;
            for (NilaiMahasiswa mhs : listData) {
                total += mhs.getNilaiAkhir();
            }
            return total / listData.size();
        }
    }
}
