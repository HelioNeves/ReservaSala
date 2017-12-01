/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.controle;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import reservasala.visao.FormAVisao;
import reservasala.visao.FormBVisao;
import reservasala.visao.FormCVisao;
import reservasala.visao.Home;
import reservasala.visao.LoginVisao;
import reservasala.visao.PesquisaVisao;
import reservasala.visao.PrincipalVisao;

/**
 *
 * @author helio
 */
public class PrincipalControle {  
        static JFrame principal;
        static JPanel main;

        public static void main(String[] args) {
        // TODO code application logic here          
        principal = new PrincipalVisao();
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        principal.setVisible(true);
        estadoMenu(principal, false);       
        
        // Instanciar os JPanels
        main = PrincipalVisao.getMain();        
        JPanel login = new LoginVisao();
        JPanel inicio = new Home();
        JPanel pesquisa = new PesquisaVisao();
        JPanel formA = new FormAVisao();
        JPanel formB = new FormBVisao();
        JPanel formC = new FormCVisao();
        
        // Adicionar os JPanels ao CardLayout
        main.add(inicio, "home");
        main.add(login, "login");   
        main.add(pesquisa, "pesquisar");   
        main.add(formA, "forma");
        main.add(formB, "formb");
        main.add(formC, "formc");

        
        CardLayout f = (CardLayout) main.getLayout();
        
        
        // Aqui é a tela de inicio da aplicação
        // Caso queira iniciar por formulário é so
        // mudar "login" por "form"
        f.show(main, "login");
      
        principal.revalidate();
    }

        
    public static void atualizaTela(String tela){
        CardLayout f = (CardLayout) main.getLayout();
        f.show(main, tela);
        
        System.out.println(tela);
        
        if(tela.equals("home")){
            estadoMenu(principal, true);
        }
    }
    
    public static void estadoMenu(JFrame f, boolean estado){
        for(int x = 0; x < f.getJMenuBar().getMenuCount(); x++){
            f.getJMenuBar().getMenu(x).setEnabled(estado);
        }
    }    
}
