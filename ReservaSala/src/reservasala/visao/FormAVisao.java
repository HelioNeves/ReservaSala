/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.visao;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import reservasala.controle.FormularioControle;
import reservasala.controle.PrincipalControle;

/**
 *
 * @author helio
 */
public class FormAVisao extends javax.swing.JPanel {

    private FormularioControle form;

    private JComboBox comboGrad;
    private JComboBox comboPos;
    private JTextField textOutro;
    private JTextField textSol;
    private JTextField textTel;
    private JTextField textEmail;
    private ButtonGroup gruAtiv;
    private JTextField textOutra;

    private JButton btnProximo;
    private JButton btnCancelar;

    /**
     * Creates new form Formulario
     * @param f
     */
    public FormAVisao(FormularioControle f) {

        this.form = f;

        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));

        setLayout(new BorderLayout());

        JPanel painelSolicitante = new JPanel();
        painelSolicitante.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        painelSolicitante.setLayout(new GridLayout(6, 2, 2, 2));

        JLabel grad = new JLabel("Graduação");
        grad.setFont(new Font("Tahoma", Font.PLAIN, 13));

        comboGrad = new JComboBox();
        comboGrad.setFont(new Font("Tahoma", Font.PLAIN, 13));
        comboGrad.addItem("");
        comboGrad.addItem("Biomedicina");
        comboGrad.addItem("Enfermagem");
        comboGrad.addItem("Fisioterapia");
        comboGrad.addItem("Fonoaudiologia");
        comboGrad.addItem("Medicina");
        comboGrad.addItem("Psicologia");

        JLabel posgrad = new JLabel("Pós-Graduação");
        posgrad.setFont(new Font("Tahoma", Font.PLAIN, 13));

        comboPos = new JComboBox();
        comboPos.setFont(new Font("Tahoma", Font.PLAIN, 13));
        comboPos.addItem("");
        comboPos.addItem("Especialização");
        comboPos.addItem("Residência Médica");
        comboPos.addItem("Pós-Graduação(M ou D)");

        JLabel outro = new JLabel("Outro: Especificar - ");
        outro.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textOutro = new JTextField();
        textOutro.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel solicitante = new JLabel("Solicitante: ");
        solicitante.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textSol = new JTextField();
        textSol.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel telefone = new JLabel("Telefone para contato: ");
        telefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textTel = new JTextField();
        textTel.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel email = new JLabel("Endereço eletrônico: ");
        email.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textEmail = new JTextField();
        textEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));

        painelSolicitante.add(grad);
        painelSolicitante.add(comboGrad);
        painelSolicitante.add(posgrad);
        painelSolicitante.add(comboPos);
        painelSolicitante.add(outro);
        painelSolicitante.add(textOutro);
        painelSolicitante.add(solicitante);
        painelSolicitante.add(textSol);
        painelSolicitante.add(telefone);
        painelSolicitante.add(textTel);
        painelSolicitante.add(email);
        painelSolicitante.add(textEmail);

        JPanel painelAtividade = new JPanel();
        painelAtividade.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        painelAtividade.setLayout(new FlowLayout());

        gruAtiv = new ButtonGroup();

        JLabel atividade = new JLabel("Atividade curricular (aula, seminário, etc.): ");
        atividade.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JRadioButton aula = new JRadioButton("Aula");
        aula.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JRadioButton semi = new JRadioButton("Seminário");
        semi.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JRadioButton prova = new JRadioButton("Prova");
        prova.setFont(new Font("Tahoma", Font.PLAIN, 13));

        gruAtiv.add(aula);
        gruAtiv.add(semi);
        gruAtiv.add(prova);

        JLabel outra = new JLabel("Outra: Especificar - ");
        outra.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textOutra = new JTextField();
        textOutra.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textOutra.setColumns(30);

        JLabel aviso1 = new JLabel("1) não serão agendadas provas e aulas fora do horário fornecido pela secretaria;");
        aviso1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        JLabel aviso2 = new JLabel(
                "2) terão prioridade as atividades curriculares no agendamento de reserva especial de salas.");
        aviso2.setFont(new Font("Tahoma", Font.PLAIN, 11));

        painelAtividade.add(atividade);
        painelAtividade.add(aula);
        painelAtividade.add(semi);
        painelAtividade.add(prova);
        painelAtividade.add(outra);
        painelAtividade.add(textOutra);
        painelAtividade.add(aviso1);
        painelAtividade.add(aviso2);

        JPanel painelBtns = new JPanel();
        painelBtns.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        painelBtns.setLayout(new FlowLayout());

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnCancelar.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnCancelarActionPerformed(evt);
        });

        btnProximo = new JButton("Proximo");
        btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnProximo.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnProximoActionPerformed(evt);
        });

        painelBtns.add(btnCancelar);
        painelBtns.add(btnProximo);

        add(painelSolicitante, BorderLayout.NORTH);
        add(painelAtividade, BorderLayout.CENTER);
        add(painelBtns, BorderLayout.SOUTH);
    }

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:       
        form.formA(comboGrad.getSelectedItem().toString(), comboPos.getSelectedItem().toString(), textOutro.getText(), textSol.getText(), textTel.getText(), textEmail.getText(), getSelectedButtonText(gruAtiv));
        PrincipalControle.atualizaTela("formb");
        limpaTela();
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        PrincipalControle.atualizaTela("home");
        limpaTela();
    }

    public void limpaTela() {
        comboGrad.setSelectedIndex(-1);
        comboPos.setSelectedIndex(-1);
        textOutro.setText("");
        textSol.setText("");
        textTel.setText("");
        textEmail.setText("");
        gruAtiv.clearSelection();
        textOutra.setText("");
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
