package Minigames;

public class Calcule extends Jogos {
    public static boolean jogar() {
        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("Bem-vindo ao Acerte o Resultado! Ganhe para salvar o local atual.");
        System.out.println();
        do{
            int numero1 = random.nextInt(10);
            int numero2 = random.nextInt(10);
            char operador = gerarOperador();
            int resultadoCorreto = calcularResultado(numero1, numero2, operador);
            
            System.out.print("Quanto é " + numero1 + " " + operador + " " + numero2 + "? ");
            System.out.println();
            System.out.println("Seu palpite: ");
            int palpite = scanner.nextInt();
            
            if (palpite == resultadoCorreto) {
                System.out.println("Parabéns! Você acertou o resultado.");
                System.out.println();
                resultado = true;
            } else {
                System.out.println("Você errou! O resultado correto era: " + resultadoCorreto);
                System.out.println();
                resultado = false;
            }
        }while(!resultado);

        return resultado;
    }
    
    private static char gerarOperador() {
        char[] operadores = {'+', '-', '*'};
        return operadores[random.nextInt(operadores.length)];
    }
    
    private static int calcularResultado(int num1, int num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                return 0;
        }
    }
}

