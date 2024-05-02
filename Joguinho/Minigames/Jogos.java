package Minigames;

import java.util.Scanner;
import java.util.Random;

public class Jogos {
    protected static boolean resultado;
    protected static Scanner scanner = new Scanner(System.in);
    protected static Random random = new Random();
    private static String[] jogosPossiveis = {"Adivinhe", "Calcule", "Forca", "Jokenpo"};

    public boolean Jogar(){
        return resultado;
    }

    public void escolherJogo(){
        String jogoEscolhido = jogosPossiveis[random.nextInt(jogosPossiveis.length)];
        switch(jogoEscolhido){
            case "Adivinhe":
                Adivinhe.jogar();
                break;
            case "Calcule":
                Calcule.jogar();
                break;
            case "Forca":
                Forca.jogar();
                break;
            case "Jokenpo":
                Jokenpo.jogar();
                break;    
        }
    }

    
}
