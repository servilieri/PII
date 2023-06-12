/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pii.v2;
import static javax.swing.JOptionPane.showMessageDialog;
public class LoginTelaAdm extends javax.swing.JFrame {

    public LoginTelaAdm() {
        super("Login Adm");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instucaoLabel = new javax.swing.JLabel();
        loginTextField1 = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        cancelarButton1 = new javax.swing.JButton();
        confirmarButton = new javax.swing.JButton();
        fundoLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        instucaoLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        instucaoLabel.setText("Realize o seu Login Adm!");
        instucaoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        getContentPane().add(instucaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 430, -1));

        loginTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        loginTextField1.setText("Código");
        loginTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        loginTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 430, 80));

        senhaPasswordField.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        senhaPasswordField.setText("Senha");
        senhaPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 760, 430, 80));

        cancelarButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cancelarButton1.setText("Cancelar");
        cancelarButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        cancelarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 910, 140, 60));

        confirmarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        confirmarButton.setText("Confirmar");
        confirmarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 910, 140, 60));

        fundoLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FundoLogo.png"))); // NOI18N
        fundoLabel1.setText("jLabel1");
        getContentPane().add(fundoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextField1ActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void cancelarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButton1ActionPerformed
        var it = new InicioTela();
        it.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarButton1ActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        try{

            String cod = loginTextField1.getText();
            String senha = new String(senhaPasswordField.getPassword());
            int codigo = Integer.parseInt(cod);
            var adm = new Administrador(codigo, senha);
            var dao = new AdministradorDAO();
            boolean g = dao.existe(adm);
            if (g){
                showMessageDialog(null,"Bem vindo adiministrador!!");
                var ht = new HubTelaAdm();
                ht.setVisible(true);
                dispose();
            }
            else
            showMessageDialog(null,"Acesso negado");
        }
        catch(Exception e){
            showMessageDialog(null,"Erro técnico");
            e.printStackTrace();
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton1;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel fundoLabel1;
    private javax.swing.JLabel instucaoLabel;
    private javax.swing.JTextField loginTextField1;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
