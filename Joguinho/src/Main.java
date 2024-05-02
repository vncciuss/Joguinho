package src;
import java.util.Scanner;

import Lugares.Lugar;
import Visualizacao.Intro;

public class Main {
    public static String nomeJogador;
    

    public static void main(String[] args){
        Janela janela = new Janela();
        janela.setVisible(true);

        Scanner scanner = new Scanner(System.in);

        Intro intro = new Intro();
        intro.mostrar();

        System.out.println("Qual o seu nome?");
        nomeJogador = scanner.nextLine();

        Lugar lugar = new Lugar();
        lugar.Viajar();

        scanner.close();
    }

    public static String getNomeJogador() {
        return nomeJogador;
    }
}
