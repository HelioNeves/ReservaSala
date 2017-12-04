/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author helio
 */
public class Arquivo {
    ArrayList<String> array = new ArrayList<>();

    public ArrayList<String> lerArquivo(String path) {
        try {
            try (FileReader arq = new FileReader(path)) {
                BufferedReader lerArq = new BufferedReader(arq);
                
                String linha = lerArq.readLine();
                
                while (linha != null) {
                    array.add(linha);
                    linha = lerArq.readLine(); // lê até a última linha
                }
            }
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        return array;
    }
    
    public String pesquisarArquivo(String path, String alvo) throws FileNotFoundException{
        String resultado = null;
        
        Scanner scan = new Scanner(new File(path));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase();
            if(line.contains(alvo)){
                resultado.concat(line + "\n");
            }
        }    
        
        return resultado;
    }    
}
