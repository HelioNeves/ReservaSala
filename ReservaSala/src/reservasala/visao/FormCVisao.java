/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import reservasala.controle.FormularioControle;
import reservasala.controle.PrincipalControle;

/**
 *
 * @author helio
 */
public class FormCVisao extends javax.swing.JPanel {

    private FormularioControle form;   
    private ButtonGroup grupoEqui;
    private JTextField txtOut;
    
    /**
     * Creates new form Formulario
     */
    public FormCVisao(FormularioControle f) {
        
        this.form = f;
        
        setSize(500, 250);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        JPanel telaObs = new JPanel();
        telaObs.setLayout(new BoxLayout(telaObs, BoxLayout.PAGE_AXIS));

        JTextArea txtObs = new JTextArea("Obs: Todas as salas possuem computador e equipamento multimídia. "
                + "\n\nOutros equipamentos devem ser solicitados com antecedência mínima"
                + "\nde 24h ao Setor de Apoio ás Salas de Aula. "
                + "\n\nReserva para eventos deverão ser realizadas no protocolo, "
                + "\ncom no mínimo 45 dias de antecedência, conforme normas institucionais.");
        txtObs.setBackground(Color.WHITE);
        txtObs.setLineWrap(true);
        txtObs.setFont(new Font("Tahoma", Font.BOLD, 13));
        txtObs.setEditable(false);

        telaObs.add(txtObs);

        JPanel telaOutEqui = new JPanel();
        FlowLayout fl_telaOutEqui = new FlowLayout();
        fl_telaOutEqui.setAlignment(FlowLayout.LEADING);
        telaOutEqui.setLayout(fl_telaOutEqui);

        JLabel lblEqui = new JLabel("Outros equipamentos: ");
        lblEqui.setFont(new Font("Tahoma", Font.PLAIN, 13));

        telaOutEqui.add(lblEqui);

        JPanel telaEqui = new JPanel();
        FlowLayout fl_telaEqui = new FlowLayout();
        fl_telaEqui.setAlignment(FlowLayout.LEADING);
        telaEqui.setLayout(fl_telaEqui);

        grupoEqui = new ButtonGroup();

        JRadioButton radProj = new JRadioButton("projetor slides");
        radProj.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JRadioButton radRet = new JRadioButton("retroprojetor");
        radRet.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JRadioButton radAud = new JRadioButton("equipamento de áudio");
        radAud.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JRadioButton radDvd = new JRadioButton("DVD");
        radDvd.setFont(new Font("Tahoma", Font.PLAIN, 13));

        grupoEqui.add(radProj);
        grupoEqui.add(radRet);
        grupoEqui.add(radAud);
        grupoEqui.add(radDvd);

        telaEqui.add(radProj);
        telaEqui.add(radRet);
        telaEqui.add(radAud);
        telaEqui.add(radDvd);

        JPanel telaOut = new JPanel();
        FlowLayout fl_telaOut = new FlowLayout();
        fl_telaOut.setAlignment(FlowLayout.LEADING);
        telaOut.setLayout(fl_telaOut);

        JLabel lblOut = new JLabel("Outro. Especificar: ");
        lblOut.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtOut = new JTextField();
        txtOut.setColumns(30);

        telaOut.add(lblOut);
        telaOut.add(txtOut);

        JPanel telaBtns = new JPanel();
        telaBtns.setLayout(new FlowLayout());

        JButton btnCan = new JButton("Cancelar");
        btnCan.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JButton btnCon = new JButton("Concluir");
        btnCon.setFont(new Font("Tahoma", Font.PLAIN, 13));

        btnCan.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnCancelarActionPerformed(evt);
        });

        btnCon.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                btnProximoActionPerformed(evt);
            } catch (IOException ex) {
                Logger.getLogger(FormCVisao.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        
        telaBtns.add(btnCan);
        telaBtns.add(btnCon);

        add(telaObs);
        add(telaOutEqui);
        add(telaEqui);
        add(telaOut);
        add(telaBtns);
    }
    
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        form.formC(getSelectedButtonText(grupoEqui) + " " + txtOut.getText());
        PrincipalControle.atualizaTela("home");       
        form.print();
        limpaTela();
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        PrincipalControle.atualizaTela("home");
        limpaTela();
    }

    public void limpaTela() {       
        txtOut.setText("");
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return "";
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(120, 120, 120));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulário C");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
