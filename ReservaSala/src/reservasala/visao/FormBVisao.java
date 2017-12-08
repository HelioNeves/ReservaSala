/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.visao;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import reservasala.controle.FormularioControle;
import reservasala.controle.PrincipalControle;

/**
 *
 * @author helio
 */
public class FormBVisao extends javax.swing.JPanel {
    
    private FormularioControle form;
   
    private JTextField txtData;
    private JTextField txtPeriodo;
    private JComboBox boxDia;
    private JComboBox boxHora;
    private JTextField txtAlunos;
    
    /**
     * Creates new form Formulario
     */
    public FormBVisao(FormularioControle f) {
        
        this.form = f;        
        
        setSize(500, 200);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        JPanel telaData = new JPanel();
        telaData.setLayout(new BoxLayout(telaData, BoxLayout.PAGE_AXIS));

        JLabel lblData = new JLabel("Data: (dd/mm/aa) ");
        lblData.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtData = new JTextField();
        txtData.setHorizontalAlignment(SwingConstants.LEFT);
        txtData.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtData.setColumns(5);

        JLabel lblPeriodo = new JLabel("Período - início e término: (dd/mm/aa á dd/mm/aa) ");
        lblPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtPeriodo = new JTextField();
        txtPeriodo.setHorizontalAlignment(SwingConstants.LEFT);
        txtPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtPeriodo.setColumns(20);

        telaData.add(lblData);
        telaData.add(txtData);
        telaData.add(lblPeriodo);
        telaData.add(txtPeriodo);

        JPanel telaHorario = new JPanel();
        FlowLayout fl_telaHorario = new FlowLayout();
        fl_telaHorario.setHgap(10);
        fl_telaHorario.setVgap(2);
        fl_telaHorario.setAlignment(FlowLayout.LEADING);
        telaHorario.setLayout(fl_telaHorario);

        JLabel lblDia = new JLabel("Dia da semana: ");
        lblDia.setFont(new Font("Tahoma", Font.PLAIN, 13));
        boxDia = new JComboBox();
        boxDia.setFont(new Font("Tahoma", Font.PLAIN, 13));
        boxDia.addItem(" ");
        boxDia.addItem("Segunda-feira");
        boxDia.addItem("Terça-feira");
        boxDia.addItem("Quarta-feira");
        boxDia.addItem("Quinta-feira");
        boxDia.addItem("Sexta-feira");
        boxDia.addItem("Sábado");

        JLabel lblHora = new JLabel("Horário: ");
        lblHora.setFont(new Font("Tahoma", Font.PLAIN, 13));
        boxHora = new JComboBox();
        boxHora.setFont(new Font("Tahoma", Font.PLAIN, 13));
        boxHora.addItem(" ");
        boxHora.addItem("7h ás 8h");
        boxHora.addItem("8h ás 9h");
        boxHora.addItem("9h ás 10h");
        boxHora.addItem("10h ás 11h");
        boxHora.addItem("11h ás 12h");
        boxHora.addItem("12h ás 13h");
        boxHora.addItem("13h ás 14h");
        boxHora.addItem("14h ás 15h");
        boxHora.addItem("15h ás 16h");
        boxHora.addItem("16h ás 17h");
        boxHora.addItem("17h ás 18h");
        boxHora.addItem("18h ás 19h");
        boxHora.addItem("19h ás 20h");
        boxHora.addItem("20h ás 21h");
        boxHora.addItem("21h ás 22h");
        boxHora.addItem("22h ás 23h");

        telaHorario.add(lblDia);
        telaHorario.add(boxDia);
        telaHorario.add(lblHora);
        telaHorario.add(boxHora);

        JPanel telaAlunos = new JPanel();
        FlowLayout fl_telaAlunos = new FlowLayout();
        fl_telaAlunos.setHgap(10);
        fl_telaAlunos.setVgap(2);
        fl_telaAlunos.setAlignment(FlowLayout.LEADING);
        telaAlunos.setLayout(fl_telaAlunos);

        JLabel lblAlunos = new JLabel("Previsão de número de alunos: ");
        lblAlunos.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtAlunos = new JTextField();
        txtAlunos.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtAlunos.setColumns(20);

        telaAlunos.add(lblAlunos);
        telaAlunos.add(txtAlunos);

        JPanel telaBtns = new JPanel();
        FlowLayout fl_telaBtns = new FlowLayout();
        fl_telaBtns.setVgap(2);
        fl_telaBtns.setHgap(0);
        telaBtns.setLayout(fl_telaBtns);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JButton btnProximo = new JButton("Próximo");
        btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 13));

        btnCancelar.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnCancelarActionPerformed(evt);
        });
        
        btnProximo.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnProximoActionPerformed(evt);
        });
        
        
        
        telaBtns.add(btnCancelar);
        telaBtns.add(btnProximo);

        add(telaData);
        add(telaHorario);
        add(telaAlunos);
        add(telaBtns);
    }
   
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        form.formB(txtData.getText(), txtPeriodo.getText(), boxDia.getSelectedItem().toString() + " " + boxHora.getSelectedItem().toString(), txtAlunos.getText());
        PrincipalControle.atualizaTela("formc");
        limpaTela();
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        PrincipalControle.atualizaTela("home");
        limpaTela();
    }
    
    public void limpaTela() {       
        boxDia.setSelectedIndex(-1);
        boxHora.setSelectedIndex(-1);
        txtData.setText("");
        txtAlunos.setText("");
        txtPeriodo.setText("");
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
        jLabel1.setText("Formulário B");
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
