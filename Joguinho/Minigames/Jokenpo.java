package Minigames;

public class Jokenpo extends Jogos {
    public static boolean jogar() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        System.out.println();
        System.out.println("******************************************************");
        System.out.println("Bem-vindo ao Jokenpô! Ganhe para salvar o local atual.");
        System.out.println();
        do{
            System.out.print("Escolha sua jogada (pedra, papel, tesoura): ");
            System.out.println();
            System.out.println("Sua escolha: ");
            String jogadaJogador = scanner.nextLine().toLowerCase();
            
            int indexJogadaComputador = random.nextInt(opcoes.length);
            String jogadaComputador = opcoes[indexJogadaComputador];
            
            System.out.println("O computador escolheu: " + jogadaComputador);
            System.out.println();
            
            if (jogadaJogador.equals(jogadaComputador)) {
                System.out.println("Empate!");
                System.out.println();
                resultado = false;
            } else if ((jogadaJogador.equals("pedra") && jogadaComputador.equals("tesoura")) ||
                    (jogadaJogador.equals("papel") && jogadaComputador.equals("pedra")) ||
                    (jogadaJogador.equals("tesoura") && jogadaComputador.equals("papel"))) {
                System.out.println("Você venceu!");
                System.out.println();
                resultado = true;
            } else {
                System.out.println("Você perdeu!");
                System.out.println();
                resultado = false;
            }
        }while(!resultado);

        return resultado;
    }
}