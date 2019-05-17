package utama;
import javax.swing.JOptionPane;
import pendaftaran.data_pendaftar;

public class admin extends javax.swing.JFrame {

    public admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        iconTambahInfo = new javax.swing.JLabel();
        iconpendaftar = new javax.swing.JLabel();
        iconPengumuman = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        iconTambahInfo.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        iconTambahInfo.setForeground(new java.awt.Color(204, 102, 0));
        iconTambahInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/uploadinfo.png"))); // NOI18N
        iconTambahInfo.setText("UPLOAD INFORMASI");
        iconTambahInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconTambahInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconTambahInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconTambahInfoMouseClicked(evt);
            }
        });

        iconpendaftar.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        iconpendaftar.setForeground(new java.awt.Color(204, 102, 0));
        iconpendaftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/pendaftar.png"))); // NOI18N
        iconpendaftar.setText("PENDAFTAR");
        iconpendaftar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconpendaftar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconpendaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconpendaftarMouseClicked(evt);
            }
        });

        iconPengumuman.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        iconPengumuman.setForeground(new java.awt.Color(204, 102, 0));
        iconPengumuman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/uploadPeng.png"))); // NOI18N
        iconPengumuman.setText("UPLOAD PENGUMUMAN");
        iconPengumuman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconPengumuman.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iconPengumuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconPengumumanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(iconTambahInfo)
                .addGap(54, 54, 54)
                .addComponent(iconpendaftar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(iconPengumuman)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconpendaftar)
                    .addComponent(iconPengumuman)
                    .addComponent(iconTambahInfo))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/beasiswa.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/admin (1).png"))); // NOI18N
        jLabel5.setText("IT'S ADMIN !");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/logout(1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconTambahInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconTambahInfoMouseClicked
        // TODO add your handling code here:
        // INFORMASI
        info x;
        x = new info();
        x.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_iconTambahInfoMouseClicked

    private void iconpendaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconpendaftarMouseClicked
        // TODO add your handling code here:
        // PENDAFTAR    
        data_pendaftar a;
        a = new data_pendaftar();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconpendaftarMouseClicked

    private void iconPengumumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPengumumanMouseClicked
        // TODO add your handling code here:
        //PENGUMUMAN       
        up_pengumuman a;
        a = new up_pengumuman();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconPengumumanMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        utama i;
        i = new utama();
        int responses = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin keluar", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(responses == JOptionPane.YES_OPTION){
            i.setVisible(true);
            this.dispose();
        }else{
            System.out.println("");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconPengumuman;
    private javax.swing.JLabel iconTambahInfo;
    private javax.swing.JLabel iconpendaftar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
