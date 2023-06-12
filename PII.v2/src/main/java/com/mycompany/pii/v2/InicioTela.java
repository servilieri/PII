
package com.mycompany.pii.v2;

public class InicioTela extends javax.swing.JFrame {

    public InicioTela() {
        super("Inicio");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarButton = new javax.swing.JButton();
        logarButton = new javax.swing.JButton();
        fundoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarButton.setText("<html>\n\t<font face=\"Comic Sans MS\" size = \"7\"> Cadastrar </font> <br/>\n</html>");
        cadastrarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        cadastrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 340, 120));

        logarButton.setText("<html>\n\t<font face=\"Comic Sans MS\" size = \"7\"> Logar </font> <br/>\n</html>");
        logarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        logarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 730, 340, 120));

        fundoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FundoLogo.png"))); // NOI18N
        getContentPane().add(fundoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        var ct = new CadastrarTela();
        ct.setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void logarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarButtonActionPerformed
        var lt = new LoginTela();
        lt.setVisible(true);
        dispose();
    }//GEN-LAST:event_logarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InicioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JLabel fundoLabel;
    private javax.swing.JButton logarButton;
    // End of variables declaration//GEN-END:variables
}
