/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasala.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
    
    public void escreverArquivo(String path, String conteudo) throws IOException{
                
        BufferedWriter wr;
        try (FileWriter write = new FileWriter(path, true)) {
            wr = new BufferedWriter(write);
            wr.write(conteudo);
            wr.newLine();
            wr.flush();
        }
		wr.close();
    }
    
    public String pesquisarArquivo(String path, String alvo) throws FileNotFoundException{
        String resultado = "";
        
        Scanner scan = new Scanner(new File(path));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase();
            if(line.contains("#" + alvo.toLowerCase())){
                for(int i = 0; i < 12; i++){
                    line = scan.nextLine();
                    System.out.println(line);
                    resultado = resultado + line + "\n";
                }
            }
        }    
        
        return resultado;
    }    
}
