/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.visao;

import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import reservasala.controle.LoginControle;
import reservasala.controle.PrincipalControle;

/**
 *
 * @author helio
 */
public class LoginVisao extends javax.swing.JPanel {
    LoginControle login = new LoginControle();

    /**
     * Creates new form Login
     * 
     */
    public LoginVisao() {
        initComponents();
        jLabelError.setForeground(new java.awt.Color(240, 240, 240));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(17, 20));
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        jTextUsuario = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(17, 20));
        jPassword = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(17, 20));
        jButton1 = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(17, 20));
        jButton2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabelError = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setName("login"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jPanel3.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        jPanel7.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.X_AXIS));
        jPanel3.add(jPanel7);

        jPanel9.setMaximumSize(new java.awt.Dimension(255, 60));
        jPanel9.setMinimumSize(new java.awt.Dimension(155, 60));
        jPanel9.setPreferredSize(new java.awt.Dimension(155, 60));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.X_AXIS));
        jPanel9.add(filler4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Login");
        jPanel9.add(jLabel1);

        jPanel3.add(jPanel9);

        jPanel4.setMaximumSize(new java.awt.Dimension(255, 60));
        jPanel4.setMinimumSize(new java.awt.Dimension(155, 60));
        jPanel4.setPreferredSize(new java.awt.Dimension(155, 60));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.X_AXIS));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usuário");
        jPanel4.add(jLabel2);
        jPanel4.add(filler1);

        jTextUsuario.setToolTipText("");
        jTextUsuario.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jTextUsuario.setMaximumSize(new java.awt.Dimension(155, 25));
        jTextUsuario.setMinimumSize(new java.awt.Dimension(155, 25));
        jTextUsuario.setPreferredSize(new java.awt.Dimension(155, 25));
        jPanel4.add(jTextUsuario);

        jPanel3.add(jPanel4);

        jPanel5.setMaximumSize(new java.awt.Dimension(255, 60));
        jPanel5.setMinimumSize(new java.awt.Dimension(155, 60));
        jPanel5.setPreferredSize(new java.awt.Dimension(155, 60));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.X_AXIS));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Senha");
        jPanel5.add(jLabel3);
        jPanel5.add(filler2);

        jPassword.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jPassword.setMaximumSize(new java.awt.Dimension(155, 25));
        jPassword.setMinimumSize(new java.awt.Dimension(155, 25));
        jPassword.setPreferredSize(new java.awt.Dimension(155, 25));
        jPanel5.add(jPassword);

        jPanel3.add(jPanel5);

        jPanel8.setMaximumSize(new java.awt.Dimension(255, 60));
        jPanel8.setMinimumSize(new java.awt.Dimension(155, 60));
        jPanel8.setPreferredSize(new java.awt.Dimension(155, 60));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.X_AXIS));
        jPanel8.add(filler5);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Limpar");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 35));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });
        jPanel8.add(jButton1);
        jPanel8.add(filler3);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Entrar");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 35));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton2KeyReleased(evt);
            }
        });
        jPanel8.add(jButton2);

        jPanel3.add(jPanel8);

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.X_AXIS));

        jLabelError.setForeground(new java.awt.Color(232, 68, 134));
        jLabelError.setText("Seu usuário ou senha estão incorretos. ");
        jPanel10.add(jLabelError);

        jPanel3.add(jPanel10);

        jPanel6.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.X_AXIS));
        jPanel3.add(jPanel6);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            limpar();
        }

    }//GEN-LAST:event_jButton1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        logar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logar();
        }
    }//GEN-LAST:event_jButton2KeyReleased
    
    private void logar(){
        if(login.autenticar(jTextUsuario.getText(), new String(jPassword.getPassword()))){
            
        } else {
            jLabelError.setForeground(new java.awt.Color(232, 68, 134));   
        }
    }
    
    private void limpar(){
        jPassword.setText("");
        jTextUsuario.setText("");  
        jLabelError.setForeground(new java.awt.Color(240, 240, 240));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
