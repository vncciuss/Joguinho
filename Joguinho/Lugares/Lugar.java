package Lugares;

import java.util.Scanner;
import src.Pontos;

public class Lugar {
    protected String nomeJogador;
    protected String nome;
    protected boolean concluido;
    protected String escolha;
    protected String escolha2;
    protected String pensamento1;
    protected String pensamento2;
    protected String pensamento3;

    protected Scanner scanner = new Scanner(System.in);

    public void Viajar(){
        Pontos cronometro = new Pontos();
        if(Parque.getConcluido() == false && Fabrica.getConcluido() == false && Ferrovia.getConcluido() == false && Cinema.getConcluido() == false && Praia.getConcluido() == false){
            cronometro.iniciar();
        } 

        int numerinho = 1;
        String nParque = "";
        String nFabrica = "";
        String nFerrovia = "";
        String nCinema = "";
        String nPraia = "";

        boolean todosConcluidos = false;

        do {
            if(Parque.getConcluido() == false || Fabrica.getConcluido() == false || Ferrovia.getConcluido() == false || Cinema.getConcluido() == false || Praia.getConcluido() == false){
                System.out.println("\nPara onde gostaria de ir?:");
                if (Parque.getConcluido() == false) {
                    System.out.println("\n[" + (nParque = Integer.toString(numerinho++)) + "] - Parque");
                }
                if (Fabrica.getConcluido() == false) {
                    System.out.println("\n[" + (nFabrica = Integer.toString(numerinho++)) + "] - Fabrica");
                }
                if (Ferrovia.getConcluido() == false) {
                    System.out.println("\n[" + (nFerrovia = Integer.toString(numerinho++)) + "] - Ferrovia");
                }
                if (Cinema.getConcluido() == false) {
                    System.out.println("\n[" + (nCinema = Integer.toString(numerinho++)) + "] - Cinema");
                }
                if (Praia.getConcluido() == false) {
                    System.out.println("\n[" + (nPraia = Integer.toString(numerinho++)) + "] - Praia");
                }
                System.out.println();
                System.out.println("Sua escolha: ");
                escolha = scanner.nextLine();
                System.out.println();

                if (escolha.equals(nParque)) {
                    Parque parque = new Parque();
                    parque.Viajar();
                }
                if (escolha.equals(nFabrica)) {
                    Fabrica fabrica = new Fabrica();
                    fabrica.Viajar();
                }
                if (escolha.equals(nFerrovia)) {
                    Ferrovia ferrovia = new Ferrovia();
                    ferrovia.Viajar();
                }
                if (escolha.equals(nCinema)) {
                    Cinema cinema = new Cinema();
                    cinema.Viajar();
                }
                if (escolha.equals(nPraia)) {
                    Praia praia = new Praia();
                    praia.Viajar();
                }
            }else{
                System.out.println("\nPara onde gostaria de ir?" + "\n[x] - Casa");
                scanner.nextLine();
                System.out.println();
                System.out.println("Voce chega em sua casa. Enquanto fecha a porta de seu quarto, voce se sente cansado, mas tambem leve por conta da missao cumprida. \nFinalmente sua cidade prosperara, gracas as suas acoes!");
                System.out.println();
                System.out.println("[x] - Ver Creditos");
                String xcreditos = scanner.nextLine();
                if(xcreditos.equals(xcreditos)){
                    cronometro.darPontuação();
                } else{
                    cronometro.darPontuação();
                }
            }
            
            todosConcluidos = Parque.getConcluido() && Fabrica.getConcluido() && Ferrovia.getConcluido() && Cinema.getConcluido() && Praia.getConcluido();
            
        } while (!todosConcluidos);

    
   

    }



}
