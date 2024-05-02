package Lugares;

import Minigames.Jogos;
import Visualizacao.ParqueImagem;
import src.Main;

public class Parque extends Lugar{
    private String nome = "parque";
    private String pensamento1 = "";
    private String pensamento2 = "";
    private String pensamento3 = "";
    protected static boolean concluido = false;


    public void Viajar(){
        nomeJogador = Main.getNomeJogador();

        ParqueImagem imagem = new ParqueImagem();
        imagem.mostrar();
        System.out.println();
        System.out.println("Voce chegou ao " + nome + ".");

        do {
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }
            
            System.out.println();
            System.out.println("O que voce gostaria de fazer?:" + "\n[1] - Olhar as arvores" + "\n[2] - Observar o comportamento das pessoas" + "\n[3] - Olhar o lago");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha = scanner.nextLine();
        
            switch (escolha) {
                case "1":
                    System.out.println();
                    System.out.println("Enquanto observava atentamente as majestosas arvores do parque, voce ficou alarmado ao notar sinais claros de estresse ambiental. \nMuitas delas exibiam folhas murchas e amareladas, indicativas de uma possivel contaminacao do ar por poluentes. \nManchas escuras e ramificacoes secas sugeriam que substancias nocivas estavam afetando sua saude.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Ao observar o movimento no parque, voce ficou consternado ao testemunhar comportamentos que ameacavam a saude do ambiente. \nPessoas despreocupadas alimentavam os patos do lago com pedacos de pao, enquanto outras descartavam lixo indiscriminadamente.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Ao se aproximar das margens do lago, voce ficou chocado com a cena diante de si. A agua antes cristalina estava agora turva e coberta por uma camada espessa de algas. \nSacolas plasticas e garrafas vazias flutuavam na superficie, testemunhas da poluicao causada pelo descarte irresponsavel de residuos.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (!escolha.equals("1") || !escolha.equals("2") || !escolha.equals("3"));

        System.out.println();
        System.out.println("O que voce gostaria de fazer?:" + "\n[x] - Ir falar com o Lixeiro");
        System.out.println();
        System.out.println("Sua escolha: ");
        scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Voce deseja falar sobre qual das suas acoes?" + "\n[1] - Falar sobre arvores" + "\n[2] - Falar sobre o comportamento das pessoas" + "\n[3] - Falar sobre o lago");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha2 = scanner.nextLine();
                
            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, desculpe interromper, mas voce e o lixeiro do parque, certo?");
                    System.out.println("Lixeiro: Sim, sou eu mesmo. Em que posso ajudar?");
                    System.out.println(nomeJogador + ": Eu estava observando as arvores do parque e notei que muitas delas parecem estar em mau estado. Algumas folhas estao murchas e amareladas. Voce tem alguma ideia do que poderia estar acontecendo?");
                    System.out.println("Lixeiro: Ah, eu entendo o que voce quer dizer. Esses sinais podem indicar problemas de poluicao atmosferica. O ar contaminado por poluentes pode afetar diretamente a saude das arvores, causando esses sintomas. \nAcredito que seja uma questao seria que precisa ser abordada urgentemente.");
                    System.out.println(nomeJogador + ": Concordo. Precisamos encontrar uma maneira de combater essa poluicao para proteger as arvores e o ecossistema do parque.");
                    break;
                case "2":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, desculpe interromper, mas voce e o lixeiro do parque, certo?");
                    System.out.println("Lixeiro: Sim, sou eu mesmo. Em que posso ajudar?");
                    System.out.println(nomeJogador + ": Eu estava observando as pessoas no parque e notei que algumas delas estao alimentando os patos do lago com pedacos de pao. Voce acha que isso pode estar afetando o ambiente?");
                    System.out.println("Lixeiro: Bem, as pessoas costumam fazer isso, mas nao acho que seja um grande problema. Os patos ficam felizes em receber comida, e geralmente a quantidade de pao nao e prejudicial para eles. \nAlem disso, a equipe de limpeza faz a coleta de lixo regularmente para garantir a limpeza do parque.");
                    System.out.println(nomeJogador + ": Entendo. Obrigado pela informacao.");
                    break;
                case "3":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, desculpe interromper, mas voce e o lixeiro do parque, certo?");
                    System.out.println("Lixeiro: Sim, sou eu mesmo. Em que posso ajudar?");
                    System.out.println(nomeJogador + ": Eu estava observando o lago do parque e fiquei chocado com o estado em que ele se encontra. A agua esta turva e coberta por uma camada espessa de algas. \nSacolas plasticas e garrafas vazias flutuavam na superficie, testemunhas da poluicao causada pelo descarte irresponsavel de residuos.");
                    System.out.println("Lixeiro: Bem, o lago as vezes fica assim devido ao clima ou ao excesso de nutrientes na agua. Mas nao se preocupe, nossa equipe esta ciente disso e esta trabalhando para resolver o problema. Provavelmente faremos uma limpeza em breve.");
                    System.out.println(nomeJogador + ": Entendo. Obrigado pela informacao.");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (!escolha2.equals("1"));
            
        Jogos minigame = new Jogos();
        minigame.escolherJogo();
        System.out.println();
        System.out.println("Apos algumas horas voce conseguiu compartilhar com todos do parque a urgente necessidade de combater a poluicao, \nalem disso voce distribuiu cartazes e panfletos para incentivar as pessoas a mudarem alguns habitos que prejudicam o ambiente. \nEm um futuro proximo o parque estara em perfeitas condicoes, gracas a sua ajuda " + nomeJogador + "!");
        System.out.println();
        System.out.println("O que voce gostaria de fazer?:" + "\n[x] - Ir para outro lugar");
        scanner.nextLine();
        concluido = true;
        super.Viajar();
    }

    public static boolean getConcluido() {
        return concluido;
    }
}
