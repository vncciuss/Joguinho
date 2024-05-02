package Visualizacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Imagens {
    protected String caminho;
    
    public void mostrar(String caminho){
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminho));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            leitor.close();
        }
        catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
