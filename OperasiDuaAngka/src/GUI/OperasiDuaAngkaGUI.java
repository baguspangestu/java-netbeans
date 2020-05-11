/////////////////////////////
// NPM  : 1911010052       //
// Nama : Bagus Pangestu   //
// Kelas: D3-MI-2          //
// MK   : Java Fundamental //
/////////////////////////////

package GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

public class OperasiDuaAngkaGUI extends javax.swing.JFrame {

    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public OperasiDuaAngkaGUI() {
        // Panggil Semua Komponen
        initComponents();
        // Set Action Tombol Enter
        JRootPane rootButton = SwingUtilities.getRootPane(enterButton); 
        rootButton.setDefaultButton(enterButton);
        // Set Action Tombol Close [X]
        for ( WindowListener wl : this.getWindowListeners())
        this.removeWindowListener(wl);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                 exitDialog();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bil1TextField = new javax.swing.JTextField();
        bil2TextField = new javax.swing.JTextField();
        hasilTextField = new javax.swing.JTextField();
        tambahButton = new javax.swing.JButton();
        kurangButton = new javax.swing.JButton();
        kaliButton = new javax.swing.JButton();
        bagiButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        aksiLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hapusButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Operasi Dua Angka");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icon/baguspangestu.png")).getImage());
        setMinimumSize(new java.awt.Dimension(584, 138));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operasi Dua Angka"));
        jPanel1.setToolTipText("");

        bil1TextField.setMaximumSize(new java.awt.Dimension(162, 30));
        bil1TextField.setMinimumSize(new java.awt.Dimension(162, 30));
        bil1TextField.setPreferredSize(new java.awt.Dimension(162, 30));

        bil2TextField.setMaximumSize(new java.awt.Dimension(162, 30));
        bil2TextField.setMinimumSize(new java.awt.Dimension(162, 30));
        bil2TextField.setPreferredSize(new java.awt.Dimension(162, 30));

        hasilTextField.setMaximumSize(new java.awt.Dimension(172, 30));
        hasilTextField.setMinimumSize(new java.awt.Dimension(172, 30));
        hasilTextField.setPreferredSize(new java.awt.Dimension(172, 30));

        tambahButton.setText("Tambah");
        tambahButton.setMaximumSize(new java.awt.Dimension(83, 23));
        tambahButton.setMinimumSize(new java.awt.Dimension(83, 23));
        tambahButton.setPreferredSize(new java.awt.Dimension(83, 23));
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        kurangButton.setText("Kurang");
        kurangButton.setMaximumSize(new java.awt.Dimension(83, 23));
        kurangButton.setMinimumSize(new java.awt.Dimension(83, 23));
        kurangButton.setPreferredSize(new java.awt.Dimension(83, 23));
        kurangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangButtonActionPerformed(evt);
            }
        });

        kaliButton.setText("Kali");
        kaliButton.setMaximumSize(new java.awt.Dimension(83, 23));
        kaliButton.setMinimumSize(new java.awt.Dimension(83, 23));
        kaliButton.setPreferredSize(new java.awt.Dimension(83, 23));
        kaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliButtonActionPerformed(evt);
            }
        });

        bagiButton.setText("Bagi");
        bagiButton.setMaximumSize(new java.awt.Dimension(83, 23));
        bagiButton.setMinimumSize(new java.awt.Dimension(83, 23));
        bagiButton.setPreferredSize(new java.awt.Dimension(83, 23));
        bagiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Keluar");
        exitButton.setMaximumSize(new java.awt.Dimension(83, 23));
        exitButton.setMinimumSize(new java.awt.Dimension(83, 23));
        exitButton.setPreferredSize(new java.awt.Dimension(83, 23));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        aksiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aksiLabel.setText("&");
        aksiLabel.setPreferredSize(new java.awt.Dimension(7, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("=");
        jLabel2.setPreferredSize(new java.awt.Dimension(8, 20));

        hapusButton.setText("Hapus");
        hapusButton.setMaximumSize(new java.awt.Dimension(83, 23));
        hapusButton.setMinimumSize(new java.awt.Dimension(83, 23));
        hapusButton.setPreferredSize(new java.awt.Dimension(83, 23));
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        enterButton.setMaximumSize(new java.awt.Dimension(0, 0));
        enterButton.setMinimumSize(new java.awt.Dimension(0, 0));
        enterButton.setPreferredSize(new java.awt.Dimension(0, 0));
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bil1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aksiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bil2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kurangButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bagiButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hasilTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aksiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bil2TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasilTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kurangButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bagiButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Double bil1(){
        // Mengambil String Dari Form Pertama & dikonvert ke Double
        return Double.parseDouble(bil1TextField.getText());
    }
    
    private Double bil2(){
        // Mengambil String Dari Form Kedua & dikonvert ke Double
        return Double.parseDouble(bil2TextField.getText());
    }
    
    private DecimalFormat decimal(){
        // Menghapus .0 & mengatur angka setelah . sampe max 11 digit
        DecimalFormat decimal = new DecimalFormat("0.###########");
        return decimal;
    }
    
    private void fieldFocus(){
        // Set Focus Text Field
        if(bil1TextField.getText().isEmpty()){
            bil1TextField.requestFocus();
        }else if(bil2TextField.getText().isEmpty()){
            bil2TextField.requestFocus();
        }
    }
    
    private void exitDialog(){
        // Dialog Tutup Aplikasi
        boolean exit = JOptionPane.showConfirmDialog(rootPane,
            "Yakin Ingin Menutup Apikasi?\nProgramer: Bagus Pangestu", "PERINGATAN",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if(exit){
            System.exit(0);
        }
    }
    
    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        fieldFocus();
        // Proses Penambahan
        aksiLabel.setText("+");
        String hasil = decimal().format(bil1() + bil2());
        hasilTextField.setText(hasil);
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void kurangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangButtonActionPerformed
        fieldFocus();
        // Proses Pengurangan
        aksiLabel.setText("-");
        String hasil = decimal().format(bil1() - bil2());
        hasilTextField.setText(hasil);
    }//GEN-LAST:event_kurangButtonActionPerformed

    private void kaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliButtonActionPerformed
        fieldFocus();
        // Proses Perkalian
        aksiLabel.setText("*");
        String hasil = decimal().format(bil1() * bil2());
        hasilTextField.setText(hasil);       
    }//GEN-LAST:event_kaliButtonActionPerformed

    private void bagiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiButtonActionPerformed
        fieldFocus();
        // Proses Pembagian
        aksiLabel.setText("/");
        String hasil = decimal().format(bil1() / bil2());
        hasilTextField.setText(hasil);       
    }//GEN-LAST:event_bagiButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        exitDialog();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // Mengosongkan Text Field
        bil1TextField.setText("");
        bil2TextField.setText("");
        hasilTextField.setText("");
        bil1TextField.requestFocus();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        fieldFocus();
    }//GEN-LAST:event_enterButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aksiLabel;
    private javax.swing.JButton bagiButton;
    private javax.swing.JTextField bil1TextField;
    private javax.swing.JTextField bil2TextField;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTextField hasilTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kaliButton;
    private javax.swing.JButton kurangButton;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new OperasiDuaAngkaGUI().setVisible(true);
            
        }
    }
}