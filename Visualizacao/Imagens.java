package Visualizacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Imagens {
    protected String caminho;

    public void mostrar(String caminho){
        try {
            // Criar um BufferedReader para ler o arquivo
            BufferedReader leitor = new BufferedReader(new FileReader(caminho));
            // Variável para armazenar cada linha do arquivo
            String linha;
            // Ler cada linha do arquivo e imprimir no console
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        System.out.println();    
            // Fechar o BufferedReader
            leitor.close();
        }
        catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    

    
}
