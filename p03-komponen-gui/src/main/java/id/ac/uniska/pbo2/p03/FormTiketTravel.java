/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p03;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Hafiz
 */
public class FormTiketTravel extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormTiketTravel.class.getName());

    /**
     * Creates new form FormTiketTravel
     */

    public FormTiketTravel() {
    initComponents();

    // Kode tambahan ditulis setelah initComponents(), di luar blok abu-abu
    namaField.putClientProperty("JTextField.placeholderText", "Nama sesuai KTP");
    hpField.putClientProperty("JTextField.placeholderText", "08xxxxxxxxxx");
    getRootPane().setDefaultButton(pesanButton);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kelasGroup = new javax.swing.ButtonGroup();
        namaPemesanLabel = new javax.swing.JLabel();
        nomorHpLabel = new javax.swing.JLabel();
        catatanLabel = new javax.swing.JLabel();
        kotaTujuanLabel = new javax.swing.JLabel();
        kelasLabel = new javax.swing.JLabel();
        fasilitasTambahanLabel = new javax.swing.JLabel();
        kotaCombo = new javax.swing.JComboBox<>();
        ekonomiRadio = new javax.swing.JRadioButton();
        bisnisRadio = new javax.swing.JRadioButton();
        eksekutifRadio = new javax.swing.JRadioButton();
        pesanButton = new javax.swing.JButton();
        temaToggle = new javax.swing.JToggleButton();
        namaField = new javax.swing.JTextField();
        hpField = new javax.swing.JTextField();
        bagasiCheck = new javax.swing.JCheckBox();
        makanCheck = new javax.swing.JCheckBox();
        asuransiCheck = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        catatanArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namaPemesanLabel.setText("Nama Pemesan");

        nomorHpLabel.setText("Nomor HP");

        catatanLabel.setText("Catatan");

        kotaTujuanLabel.setText("Kota Tujuan");

        kelasLabel.setText("Kelas");

        fasilitasTambahanLabel.setText("Fasilitas Tambahan");

        kotaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banjarbaru", "Martapura", "Palangka Raya", "Samarinda", "Balikpapan" }));
        kotaCombo.addActionListener(this::kotaComboActionPerformed);

        kelasGroup.add(ekonomiRadio);
        ekonomiRadio.setText("Ekonomi");
        ekonomiRadio.addActionListener(this::ekonomiRadioActionPerformed);

        kelasGroup.add(bisnisRadio);
        bisnisRadio.setText("Bisnis");

        kelasGroup.add(eksekutifRadio);
        eksekutifRadio.setText("Eksekutif");
        eksekutifRadio.addActionListener(this::eksekutifRadioActionPerformed);

        pesanButton.setText("Pesan");
        pesanButton.addActionListener(this::pesanButtonActionPerformed);

        temaToggle.setText("Mode Gelap");
        temaToggle.addActionListener(this::temaToggleActionPerformed);

        bagasiCheck.setText("Bagasi");

        makanCheck.setText("Makan");

        asuransiCheck.setText("Asuransi");

        catatanArea.setColumns(20);
        catatanArea.setRows(3);
        jScrollPane1.setViewportView(catatanArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(temaToggle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesanButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fasilitasTambahanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kelasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kotaTujuanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kotaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(263, 263, 263))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ekonomiRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(bisnisRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eksekutifRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(159, 159, 159))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bagasiCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(makanCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(asuransiCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(202, 202, 202))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaPemesanLabel)
                            .addComponent(nomorHpLabel)
                            .addComponent(catatanLabel))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hpField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPemesanLabel)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomorHpLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(catatanLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kotaTujuanLabel)
                    .addComponent(kotaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kelasLabel)
                    .addComponent(bisnisRadio)
                    .addComponent(eksekutifRadio)
                    .addComponent(ekonomiRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fasilitasTambahanLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bagasiCheck)
                        .addComponent(makanCheck)
                        .addComponent(asuransiCheck)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temaToggle)
                    .addComponent(pesanButton))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekonomiRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekonomiRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ekonomiRadioActionPerformed

    private void eksekutifRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksekutifRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eksekutifRadioActionPerformed

    private void kotaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kotaComboActionPerformed

    private void pesanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanButtonActionPerformed
        tampilkanRingkasan();
    }//GEN-LAST:event_pesanButtonActionPerformed

    private void temaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaToggleActionPerformed
        gantiTema(temaToggle.isSelected());
    }//GEN-LAST:event_temaToggleActionPerformed
    private void tampilkanRingkasan() {
    String kelas;
    if (ekonomiRadio.isSelected()) {
        kelas = "Ekonomi";
    } else if (bisnisRadio.isSelected()) {
        kelas = "Bisnis";
    } else {
        kelas = "Eksekutif";
    }
 
    List<String> fasilitas = new ArrayList<>();
    for (JCheckBox cb : List.of(bagasiCheck, makanCheck, asuransiCheck)) {
        if (cb.isSelected()) {
            fasilitas.add(cb.getText());
        }
    }
 
    String catatan = catatanArea.getText().isBlank() ? "-" : catatanArea.getText();
 
    String pesan = "Nama Pemesan: " + namaField.getText()
            + "\nNomor HP: " + hpField.getText()
            + "\nKota Tujuan: " + kotaCombo.getSelectedItem()
            + "\nKelas: " + kelas
            + "\nFasilitas: " + (fasilitas.isEmpty() ? "-" : String.join(", ", fasilitas))
            + "\nCatatan: " + catatan;
 
    JOptionPane.showMessageDialog(this, pesan, "Ringkasan Pesanan",
            JOptionPane.INFORMATION_MESSAGE);
}
 
private void gantiTema(boolean gelap) {
    if (gelap) {
        FlatDarkLaf.setup();
    } else {
        FlatLightLaf.setup();
    }
    FlatLaf.updateUI(); // terapkan tema baru ke semua jendela yang terbuka
    temaToggle.setText(gelap ? "Mode Terang" : "Mode Gelap");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    // Blok Nimbus buatan NetBeans diganti dengan tema FlatLaf
    FlatLightLaf.setup();

    // Tampilkan form di Event Dispatch Thread
    java.awt.EventQueue.invokeLater(() -> new FormTiketTravel().setVisible(true));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox asuransiCheck;
    private javax.swing.JCheckBox bagasiCheck;
    private javax.swing.JRadioButton bisnisRadio;
    private javax.swing.JTextArea catatanArea;
    private javax.swing.JLabel catatanLabel;
    private javax.swing.JRadioButton ekonomiRadio;
    private javax.swing.JRadioButton eksekutifRadio;
    private javax.swing.JLabel fasilitasTambahanLabel;
    private javax.swing.JTextField hpField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup kelasGroup;
    private javax.swing.JLabel kelasLabel;
    private javax.swing.JComboBox<String> kotaCombo;
    private javax.swing.JLabel kotaTujuanLabel;
    private javax.swing.JCheckBox makanCheck;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaPemesanLabel;
    private javax.swing.JLabel nomorHpLabel;
    private javax.swing.JButton pesanButton;
    private javax.swing.JToggleButton temaToggle;
    // End of variables declaration//GEN-END:variables
}
