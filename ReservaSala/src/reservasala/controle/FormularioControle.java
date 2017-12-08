/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.controle;

import java.io.IOException;
import reservasala.DAO.Arquivo;
import reservasala.modelo.Formulario;

/**
 *
 * @author helio
 */
public class FormularioControle {

    private Formulario f;
    
    public FormularioControle() {
        super();
        this.f = new Formulario();
    }
          
    public void formA(String grad, String pos, String outro, String solicita, 
            String telefone, String email, String atv){
        this.f.setGraduacao("\nGraduação: " + grad);
        this.f.setPosGraduacao("\nPós-Graduação: " + pos);
        this.f.setOutro("\nOutro: " + outro);
        this.f.setSolicitante("\nSolicitante: " + solicita);
        this.f.setTelefone("\nTelefone: " + telefone);
        this.f.setEmail("\nEmail: " + email);
        this.f.setAtividade("\nAtividade: " + atv);
    }
    
    public void formB(String data, String periodo, String hrReserva, String Alunos){
        this.f.setData("\nData: " + data);
        this.f.setPeriodo("\nPeríodo: " + periodo);
        this.f.setHoraReserva("\nHorário Reservado: " + hrReserva);
        this.f.setAlunos("\nQuantidade de Alunos: " + Alunos);
    }
    
    public void formC(String equip){
        this.f.setEquipamentos("\nEquipamentos: " + equip);
    }
    
    public void print() throws IOException{
        String conteudo = "#" + f.getSolicitante().substring(14)
                + f.getGraduacao()
                + f.getPosGraduacao()
                + f.getOutro()
                + f.getSolicitante()
                + f.getTelefone()
                + f.getEmail()
                + f.getAtividade()
                + f.getData()
                + f.getPeriodo()
                + f.getHoraReserva()
                + f.getAlunos()
                + f.getEquipamentos()
                + "\n";
        
        Arquivo arq = new Arquivo();
        arq.escreverArquivo("formularios.txt", conteudo);
        
        System.out.println(conteudo);   
    }    
}
