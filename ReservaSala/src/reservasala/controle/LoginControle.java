/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.controle;

import java.util.ArrayList;
import reservasala.DAO.Arquivo;

/**
 *
 * @author helio
 */
public class LoginControle {
    public boolean autenticar(String login, String senha){
            Arquivo arq = new Arquivo();
            ArrayList<String> segredo = arq.lerArquivo("contas.txt");
            
            if(segredo.contains(login)){
                if (segredo.get(segredo.indexOf(login)+1).equals(senha)){
                PrincipalControle.atualizaTela("home");
                return true;
                }                
            }
           
        return false;
    }
}
