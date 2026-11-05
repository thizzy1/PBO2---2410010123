// Nama : M Hafiz Ilmi
// NPM  : 2410010123
package id.ac.uniska.pbo2.uts;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Class model tabel: menyimpan daftar NilaiMahasiswa dan menyediakannya
 * untuk JTable.
 *
 * @author M Hafiz Ilmi
 */
public class TabelModelNilai extends AbstractTableModel {

    private final List<NilaiMahasiswa> daftar = new ArrayList<>();

    private final String[] namaKolom = {
        "NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"
    };

    @Override
    public int getRowCount() {
        return daftar.size();
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
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 2, 3, 4 -> Integer.class;
            default -> String.class;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NilaiMahasiswa mhs = daftar.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> mhs.getNpm();
            case 1 -> mhs.getNama();
            case 2 -> mhs.getTugas();
            case 3 -> mhs.getUts();
            case 4 -> mhs.getUas();
            case 5 -> mhs.getNilaiAkhirTeks();
            case 6 -> mhs.getHurufMutu();
            default -> null;
        };
    }

    public void tambah(NilaiMahasiswa mhs) {
        daftar.add(mhs);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    public boolean npmSudahAda(String npm) {
        for (NilaiMahasiswa mhs : daftar) {
            if (mhs.getNpm().equals(npm)) {
                return true;
            }
        }
        return false;
    }

    public int getJumlahMahasiswa() {
        return daftar.size();
    }

    public double getRataRataNilaiAkhir() {
        if (daftar.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (NilaiMahasiswa mhs : daftar) {
            total += mhs.getNilaiAkhir();
        }
        return total / daftar.size();
    }
}
