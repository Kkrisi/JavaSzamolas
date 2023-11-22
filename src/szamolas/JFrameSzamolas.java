
package szamolas;

import java.awt.HeadlessException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class JFrameSzamolas extends javax.swing.JFrame {

    int osszeg;
    
    
    public JFrameSzamolas() {
        initComponents();
        
        osszeg = 0;
        
        //lblosszesen.setText(osszeg + " Ft");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pnlOsszetevok = new javax.swing.JPanel();
        chbhagyma = new javax.swing.JCheckBox();
        chbananasz = new javax.swing.JCheckBox();
        chbsajt = new javax.swing.JCheckBox();
        pnlOsszesen = new javax.swing.JPanel();
        lblosszesen = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProgram = new javax.swing.JMenu();
        mnuProgramMentes = new javax.swing.JMenuItem();
        mnuProgramMegnyitas = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuProgramKilepes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Számolás");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlOsszetevok.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Összetevők"));

        chbhagyma.setText("Hagyma");
        chbhagyma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStateChanged(evt);
            }
        });

        chbananasz.setText("Ananász");
        chbananasz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStateChanged(evt);
            }
        });

        chbsajt.setText("Sajt");
        chbsajt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStateChanged(evt);
            }
        });

        pnlOsszesen.setBorder(javax.swing.BorderFactory.createTitledBorder("Összesen"));

        lblosszesen.setText("0");

        javax.swing.GroupLayout pnlOsszesenLayout = new javax.swing.GroupLayout(pnlOsszesen);
        pnlOsszesen.setLayout(pnlOsszesenLayout);
        pnlOsszesenLayout.setHorizontalGroup(
            pnlOsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszesenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblosszesen, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOsszesenLayout.setVerticalGroup(
            pnlOsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszesenLayout.createSequentialGroup()
                .addComponent(lblosszesen)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlOsszetevokLayout = new javax.swing.GroupLayout(pnlOsszetevok);
        pnlOsszetevok.setLayout(pnlOsszetevokLayout);
        pnlOsszetevokLayout.setHorizontalGroup(
            pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszetevokLayout.createSequentialGroup()
                .addGroup(pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOsszetevokLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbananasz)
                            .addComponent(chbhagyma)
                            .addComponent(chbsajt)))
                    .addGroup(pnlOsszetevokLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnlOsszesen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlOsszetevokLayout.setVerticalGroup(
            pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszetevokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbananasz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbhagyma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbsajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlOsszesen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Beállítások", pnlOsszetevok);

        jTextArea1.setColumns(12);
        jTextArea1.setRows(3);
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane3.addTab("Kiválasztva", jScrollPane1);

        jTabbedPane2.addTab("Statisztika", jTabbedPane3);

        mnuProgram.setText("Program");

        mnuProgramMentes.setText("Mentés...");
        mnuProgram.add(mnuProgramMentes);

        mnuProgramMegnyitas.setText("Megnyitás...");
        mnuProgram.add(mnuProgramMegnyitas);
        mnuProgram.add(jSeparator4);

        mnuProgramKilepes.setText("Kilépés...");
        mnuProgramKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProgramKilepesActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuProgramKilepes);

        jMenuBar1.add(mnuProgram);

        jMenu2.setText("Lehetőségek");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        osszegetKiir();
    }//GEN-LAST:event_formWindowOpened


    private void OsszetevokItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OsszetevokItemStateChanged
        int ar = 200;
        
        JCheckBox chb = (JCheckBox) evt.getSource();
        
        
        if (chb.isSelected()) {
            osszeg += ar;
        } else {
            osszeg -= ar;
        }
        
        
        osszegetKiir();
    }//GEN-LAST:event_OsszetevokItemStateChanged

    private void mnuProgramKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProgramKilepesActionPerformed
        kilepes();
        
    }//GEN-LAST:event_mnuProgramKilepesActionPerformed

    private void kilepes() {
        //System.exit(0);
        //int gomb = JOptionPane.showConfirmDialog(rootPane,"Biztosan kilép?");
        
        String kerdes = "Biztosan kilép?";
        String cim = "KILÉPÉS";
        int gombokTipusa = JOptionPane.OK_CANCEL_OPTION;
        
        int gomb = JOptionPane.showConfirmDialog(rootPane,kerdes,cim,gombokTipusa);
        //System.out.println("gomb = " + gomb);
        
        if (gomb == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing
    
    
    private void osszegetKiir() {
        lblosszesen.setText("A fizetendő összeg: " + osszeg + " Ft");
    }
    
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
            java.util.logging.Logger.getLogger(JFrameSzamolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSzamolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSzamolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSzamolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSzamolas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbananasz;
    private javax.swing.JCheckBox chbhagyma;
    private javax.swing.JCheckBox chbsajt;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblosszesen;
    private javax.swing.JMenu mnuProgram;
    private javax.swing.JMenuItem mnuProgramKilepes;
    private javax.swing.JMenuItem mnuProgramMegnyitas;
    private javax.swing.JMenuItem mnuProgramMentes;
    private javax.swing.JPanel pnlOsszesen;
    private javax.swing.JPanel pnlOsszetevok;
    // End of variables declaration//GEN-END:variables
}
