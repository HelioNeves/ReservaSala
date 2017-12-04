/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.controle;

import java.io.FileNotFoundException;
import reservasala.DAO.Arquivo;

/**
 *
 * @author heliof
 */
public class PesquisaControle {
    public String procurar(String s) throws FileNotFoundException{
        String resultado;
        Arquivo arq = new Arquivo();
        resultado = arq.pesquisarArquivo("formularios.txt", s);
        return resultado;
    }
}
