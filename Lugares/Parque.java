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
        System.out.println("Você chegou ao " + nome + ".");

        do {
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }
            
            System.out.println();
            System.out.println("O que você gostaria de fazer?:" + "\n[1] - Olhar as arvores" + "\n[2] - Observar o comportamento das pessoas" + "\n[3] - Olhar o lago");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha = scanner.nextLine();
        
            switch (escolha) {
                case "1":
                    System.out.println();
                    System.out.println("Enquanto observava atentamente as majestosas árvores do parque, você ficou alarmado ao notar sinais claros de estresse ambiental. \nMuitas delas exibiam folhas murchas e amareladas, indicativas de uma possível contaminação do ar por poluentes. \nManchas escuras e ramificações secas sugeriam que substâncias nocivas estavam afetando sua saúde.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Ao observar o movimento no parque, você ficou consternado ao testemunhar comportamentos que ameaçavam a saúde do ambiente. \nPessoas despreocupadas alimentavam os patos do lago com pedaços de pão, enquanto outras descartavam lixo indiscriminadamente.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Ao se aproximar das margens do lago, você ficou chocado com a cena diante de si. A água antes cristalina estava agora turva e coberta por uma camada espessa de algas. \nSacolas plásticas e garrafas vazias flutuavam na superfície, testemunhas da poluição causada pelo descarte irresponsável de resíduos.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!escolha.equals("1") || !escolha.equals("2") || !escolha.equals("3"));

        System.out.println();
        System.out.println("O que você gostaria de fazer?:" + "\n[x] - Ir falar com o Lixeiro");
        System.out.println();
        System.out.println("Sua escolha: ");
        scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Você deseja falar sobre qual das suas ações?" + "\n[1] - Falar sobre arvores" + "\n[2] - Falar sobre o comportamento das pessoas" + "\n[3] - Falar sobre o lago");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha2 = scanner.nextLine();
                
            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, desculpe interromper, mas você é o lixeiro do parque, certo?");
                    System.out.println("Lixeiro: Sim, sou eu mesmo. Em que posso ajudar?");
                    System.out.println(nomeJogador + ": Eu estava observando as árvores do parque e notei que muitas delas parecem estar em mau estado. Algumas folhas estão murchas e amareladas. Você tem alguma ideia do que poderia estar acontecendo?");
                    System.out.println("Lixeiro: Ah, eu entendo o que você quer dizer. Esses sinais podem indicar problemas de poluição atmosférica. O ar contaminado por poluentes pode afetar diretamente a saúde das árvores, causando esses sintomas. \nAcredito que seja uma questão séria que precisa ser abordada urgentemente.");
                    System.out.println(nomeJogador + ": Concordo. Precisamos encontrar uma maneira de combater essa poluição para proteger as árvores e o ecossistema do parque.");
                    break;
                case "2":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, desculpe interromper, mas você é o lixeiro do parque, certo?");
                    System.out.println("Lixeiro: Sim, sou eu mesmo. Em que posso ajudar?");
                    System.out.println(nomeJogador + ": Eu estava observando as pessoas no parque e notei que algumas delas estão alimentando os patos do lago com pedaços de pão. Você acha que isso pode estar afetando o ambiente?");
                    System.out.println("Lixeiro: Bem, as pessoas costumam fazer isso, mas não acho que seja um grande problema. Os patos ficam felizes em receber comida, e geralmente a quantidade de pão não é prejudicial para eles. \nAlém disso, a equipe de limpeza faz a coleta de lixo regularmente para garantir a limpeza do parque.");
                    System.out.println(nomeJogador + ": Entendo. Obrigado pela informação.");
                    break;
                case "3":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, desculpe interromper, mas você é o lixeiro do parque, certo?");
                    System.out.println("Lixeiro: Sim, sou eu mesmo. Em que posso ajudar?");
                    System.out.println(nomeJogador + ": Eu estava observando o lago do parque e fiquei chocado com o estado em que ele se encontra. A água está turva e coberta por uma camada espessa de algas. \nSacolas plásticas e garrafas vazias flutuavam na superfície, testemunhas da poluição causada pelo descarte irresponsável de resíduos.");
                    System.out.println("Lixeiro: Bem, o lago às vezes fica assim devido ao clima ou ao excesso de nutrientes na água. Mas não se preocupe, nossa equipe está ciente disso e está trabalhando para resolver o problema. Provavelmente faremos uma limpeza em breve.");
                    System.out.println(nomeJogador + ": Entendo. Obrigado pela informação.");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!escolha2.equals("1"));
            
        Jogos minigame = new Jogos();
        minigame.escolherJogo();
        System.out.println();
        System.out.println("Após algumas horas você conseguiu compartilhar com todos do parque a urgente necessidade de combater a poluição, \nalém disso você distribuiu cartazes e panfletos para incentivar as pessoas a mudarem alguns hábitos que prejudicam o ambiente. \nEm um futuro próximo o parque estará em perfeitas condiçoes, gracas a sua ajuda " + nomeJogador + "!");
        System.out.println();
        System.out.println("O que você gostaria de fazer?:" + "\n[x] - Ir para outro lugar");
        scanner.nextLine();
        concluido = true;
        super.Viajar();
            

    }

    public static boolean getConcluido() {
        return concluido;
    }
}