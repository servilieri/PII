
package com.mycompany.pii.v2;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileWriter;
public class QuestaoTela5_5 extends javax.swing.JFrame {


    public QuestaoTela5_5() {
        super("Questao 5");
        initComponents();
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respostaTextField1 = new javax.swing.JTextField();
        dicaButton1 = new javax.swing.JButton();
        confirmarButton2 = new javax.swing.JButton();
        pergunraLabel2 = new javax.swing.JLabel();
        dicaLabel1 = new javax.swing.JLabel();
        numQuestaoLabel1 = new javax.swing.JLabel();
        fundoLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        respostaTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        respostaTextField1.setText("Resposta");
        respostaTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        getContentPane().add(respostaTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 780, 520, 100));

        dicaButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        dicaButton1.setText("Dica");
        dicaButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        dicaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dicaButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(dicaButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 220, 70));

        confirmarButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        confirmarButton2.setText("Confirmar");
        confirmarButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        confirmarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 960, 120, 60));

        pergunraLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        pergunraLabel2.setText("Qual é o pacote empacotador da classe JOptionPane?");
        getContentPane().add(pergunraLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        dicaLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        getContentPane().add(dicaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 220, -1));

        numQuestaoLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        numQuestaoLabel1.setText("  5");
        numQuestaoLabel1.setToolTipText("");
        numQuestaoLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(numQuestaoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 90, -1));

        fundoLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/questao - parte 5.png"))); // NOI18N
        fundoLabel1.setText("jLabel1");
        getContentPane().add(fundoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dicaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dicaButton1ActionPerformed
        var dao = new QuestaoDAO();
        try{            
            var questao = dao.buscarQuestao(5);
            JOptionPane.showMessageDialog(null, "Dica: " + questao.getDica());

        }
        catch(Exception e){
            e.printStackTrace();
            showMessageDialog("fora do ar");
        }
        
    }//GEN-LAST:event_dicaButton1ActionPerformed

    private void confirmarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButton2ActionPerformed
        String resp = respostaTextField1.getText();
        var removedor = new RemoverAcentos();
        String resposta = removedor.removerAcentos(resp);
        var dao = new QuestaoDAO();
        try{
            var questao = dao.buscarQuestao(5);
            String r = questao.getResposta();
            if(resposta.equalsIgnoreCase(r)){
                JOptionPane.showMessageDialog(null,"Correto");
                try(var fw = new FileWriter("q5.txt")){
			fw.write("2");
		}catch(IOException e){                
		}
                var qt = new QuestaoTela6_1();
                qt.setVisible(true);
                dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Errado");
                var qt = new QuestaoTela5_6();
                qt.setVisible(true);
                dispose();
                
            }
        
        }
        catch(Exception e){
            e.printStackTrace();
            showMessageDialog("fora do ar");
            
        }
        
        
    }//GEN-LAST:event_confirmarButton2ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuestaoTela1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestaoTela1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestaoTela1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestaoTela1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestaoTela5_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton2;
    private javax.swing.JButton dicaButton1;
    private javax.swing.JLabel dicaLabel1;
    private javax.swing.JLabel fundoLabel1;
    private javax.swing.JLabel numQuestaoLabel1;
    private javax.swing.JLabel pergunraLabel2;
    private javax.swing.JTextField respostaTextField1;
    // End of variables declaration//GEN-END:variables

    private void showMessageDialog(String dica) {
        throw new UnsupportedOperationException("Erro"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String normalize(String resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
