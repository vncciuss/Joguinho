package Minigames;


public class Forca extends Jogos {
    public static boolean jogar() {
        String[] palavrasPossiveis = {"Floresta", "Biodiversidade", "Sustentabilidade", "Reciclagem", "Ecossistema"};
        boolean resultado;
        System.out.println();
        System.out.println("************************************************************");
        System.out.println("Bem-vindo ao Jogo da Forca! Ganhe para salvar o local atual.");
        System.out.println();

        do {
            String palavraSecreta = palavrasPossiveis[random.nextInt(palavrasPossiveis.length)].toUpperCase();
            int tentativasMaximas = 10;
            int tentativas = 0;
            boolean acertou = false;

            char[] palavraDescoberta = new char[palavraSecreta.length()];
            for (int i = 0; i < palavraSecreta.length(); i++) {
                palavraDescoberta[i] = '_';
            }

            while (tentativas < tentativasMaximas && !acertou) {
                System.out.println("Palavra: " + String.valueOf(palavraDescoberta));
                System.out.println();
                System.out.print("Digite uma letra ou a palavra completa: ");
                System.out.println();
                System.out.println("Seu palpite: ");
                String entrada = scanner.next().toUpperCase();

                if (entrada.length() == 1) {
                    char letra = entrada.charAt(0);
                    boolean letraDescoberta = false;
                    for (int i = 0; i < palavraSecreta.length(); i++) {
                        if (Character.toUpperCase(palavraSecreta.charAt(i)) == letra) { 
                            palavraDescoberta[i] = palavraSecreta.charAt(i);
                            letraDescoberta = true;
                        }
                    }
                    if (!letraDescoberta) {
                        tentativas++;
                        System.out.println("Letra não encontrada. Tentativas restantes: " + (tentativasMaximas - tentativas));
                        System.out.println();
                    }
                } else if (entrada.equals(palavraSecreta)) {
                    acertou = true;
                } else {
                    System.out.println("Palavra incorreta!");
                    System.out.println();
                }

                if (String.valueOf(palavraDescoberta).equals(palavraSecreta)) {
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("Parabéns! Você acertou a palavra.");
                System.out.println();
                resultado = true;
            } else {
                System.out.println("Você perdeu! A palavra secreta era: " + palavraSecreta);
                System.out.println();
                resultado = false;
            }
        } while (!resultado);

        return resultado;
    }
}