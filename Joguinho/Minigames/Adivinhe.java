package Minigames;

public class Adivinhe extends Jogos{

    public static boolean jogar() {
        int min = 1;
        int max = 100;
        int numeroAleatorio = random.nextInt(max - min + 1) + min;
        System.out.println();
        System.out.println("**********************************************************************");    
        System.out.println("Bem-vindo ao Minigame de Adivinhação! Ganhe para salvar o local atual.");
        System.out.println();
        System.out.println("Tente adivinhar um número entre " + min + " e " + max + ".");
        System.out.println();
        
        int palpite;
            
        do {
            System.out.print("Digite seu palpite: ");
            System.out.println();
            palpite = scanner.nextInt();
                
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
                System.out.println();
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente.");
                System.out.println();
            }
        } while (palpite != numeroAleatorio);
            
        System.out.println("Parabéns! Você acertou o número: " + numeroAleatorio);
        System.out.println();
        resultado = true;
        return resultado;


    }
}

