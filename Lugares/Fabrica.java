package Lugares;

import Minigames.Jogos;
import Visualizacao.FabricaImagem;
import src.Main;

public class Fabrica extends Lugar{
    private String nome = "fábrica abandonada";
    private String pensamento1 = "";
    private String pensamento2 = "";
    private String pensamento3 = "";
    protected static boolean concluido = false;


    public void Viajar(){
        nomeJogador = Main.getNomeJogador();

        FabricaImagem imagem = new FabricaImagem();
        imagem.mostrar();

        System.out.println("\nVocê chegou à " + nome + ".");

        do {
            // Se todas as ações já foram concluídas, não há necessidade de repetir o primeiro menu
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }
        
            System.out.println("\nO que você gostaria de fazer?:" + "\n[1] - Explorar os corredores" + "\n[2] - Observar vestígios de pessoas" + "\n[3] - Olhar os arredores");
            escolha = scanner.nextLine();
        
            // Verifica se a escolha é válida
            switch (escolha) {
                case "1":
                    System.out.println("\nEnquanto explorava os corredores sombrios da fábrica abandonada, você notou vestígios de uma atividade industrial passada. \nAs paredes desgastadas e as máquinas enferrujadas contam a história de uma era em que esta fábrica estava em pleno funcionamento, mas agora permanece como um monumento ao descaso ambiental. \nO ar impregnado com o cheiro de óleo queimado e produtos químicos agressivos serve como um lembrete sombrio dos impactos prejudiciais da indústria descontrolada no meio ambiente.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println("\nAo observar os vestígios da atividade humana na fábrica abandonada, você fica intrigado com os sinais de negligência ambiental. \nMontes de resíduos tóxicos e materiais descartados poluem o chão, enquanto equipamentos industriais enferrujados vazam substâncias nocivas no solo. \nEsta visão desoladora ressalta a importância urgente de práticas industriais mais sustentáveis e de uma gestão responsável dos resíduos, para evitar danos irreparáveis ao ecossistema.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println("\nAo explorar os arredores da fábrica, você se depara com um rio outrora vital que agora está contaminado e sufocado por detritos industriais. \nAs águas escuras e poluídas refletem a triste realidade da degradação ambiental causada pela atividade industrial irresponsável. \nPeixes mortos flutuam na superfície, enquanto o cheiro acre de produtos químicos tóxicos paira no ar. É evidente que medidas urgentes são necessárias para descontaminar este rio e restaurar sua vitalidade, antes que seja tarde demais.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (!escolha.equals("1") || !escolha.equals("2") || !escolha.equals("3"));

            System.out.println("\nO que você gostaria de fazer?:" + "\n[x] - Ir falar com o ex-funcionário");
            scanner.nextLine();

        do {
            System.out.println("\nVocê deseja falar sobre qual das suas ações?" + "\n[1] - Falar sobre os corredores" + "\n[2] - Falar sobre os vestígios" + "\n[3] - Falar sobre os arredores");
            escolha2 = scanner.nextLine();
                
            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println("\n" + nomeJogador + ": Ei, desculpe interromper, mas você trabalhava nesta fábrica, certo?");
                    System.out.println("\nEx-funcionário da fábrica: Sim, eu costumava ser um dos operários. O que você quer saber?");
                    System.out.println("\n" + nomeJogador + ": Enquanto explorava a fábrica, percebi que muitas das estruturas e máquinas estão em péssimo estado. Algumas delas até parecem estar desmoronando. Você tem alguma ideia do que poderia ter causado isso?");
                    System.out.println("\nEx-funcionário da fábrica: Ah, sim, essas máquinas eram antigas e muitas vezes não recebiam a manutenção adequada. O tempo também não foi gentil com elas. Além disso, a empresa costumava despejar resíduos tóxicos nas proximidades, o que pode ter contribuído para a degradação das estruturas. É triste ver como o descaso ambiental afetou este lugar.");
                    System.out.println("\n" + nomeJogador + ": Concordo. É importante aprender com os erros do passado para evitar danos ainda maiores ao meio ambiente.");
                    break;
                case "2":
                    System.out.println();
                    System.out.println("\n" + nomeJogador + ": Ei, desculpe interromper, mas você trabalhava nesta fábrica, certo?");
                    System.out.println("\nEx-funcionário da fábrica: Sim, trabalhei aqui por anos. Em que posso ajudar?");
                    System.out.println("\n" + nomeJogador + ": Enquanto explorava os arredores da fábrica, percebi muitos resíduos tóxicos e materiais abandonados. Parece que o local foi negligenciado por muito tempo. Você acha que isso pode ter causado danos ao meio ambiente?");
                    System.out.println("\nEx-funcionário da fábrica: Infelizmente, sim. Durante os anos em que trabalhei aqui, testemunhei muitos casos de descarte irresponsável de resíduos industriais. A empresa não se preocupava muito com os impactos ambientais de suas operações. Agora, vemos o resultado desse descaso. É triste ver como a ganância pode destruir um lugar tão bonito.");
                    System.out.println("\n" + nomeJogador + ": Concordo. É hora de tomar medidas para limpar este lugar e restaurar o equilíbrio ambiental.");
                    break;
                case "3":
                    System.out.println();
                    System.out.println("\n" + nomeJogador + ": Ei, desculpe interromper, mas você trabalhava nesta fábrica, certo?");
                    System.out.println("\nEx-funcionário da fábrica: Sim, eu conheço este lugar como a palma da minha mão. Em que posso ajudar?");
                    System.out.println("\n" + nomeJogador + ": Enquanto explorava os arredores da fábrica, cheguei perto do rio que passa por aqui. Fiquei chocado ao ver como as águas estão poluídas e como a vida selvagem está sofrendo. Você tem alguma ideia do que poderia ter causado essa contaminação?");
                    System.out.println("\nEx-funcionário da fábrica: Bem, durante os anos em que trabalhei aqui, vi muitos produtos químicos sendo despejados diretamente no rio. A empresa achava mais fácil se livrar dos resíduos dessa maneira, sem se preocupar com as consequências. Agora vemos o resultado disso. É uma tragédia ver como a ganância pode destruir um ecossistema tão frágil.");
                    System.out.println("\n" + nomeJogador + ": Concordo. Precisamos tomar medidas urgentes para descontaminar este rio e proteger a vida selvagem que depende dele.");
                    break;
            }
        } while (!escolha2.equals("2"));
            
        Jogos minigame = new Jogos();
        minigame.escolherJogo();
        System.out.println();
        System.out.println("\nVocê liderou uma equipe de voluntários na limpeza dos arredores da fábrica abandonada, removendo resíduos tóxicos e materiais abandonados. Eles também descontaminaram o rio próximo, restaurando a vida aquática. Por meio de campanhas educativas, conscientizaram a comunidade sobre a importância da preservação ambiental. \nAs suas ações transformaram a fábrica de um símbolo de decadência em um exemplo de renovação e esperança.");
        System.out.println("\nO que você gostaria de fazer?:" + "\n[x] - Ir para outro lugar");
        scanner.nextLine();
        concluido = true;
        super.Viajar();
            

    }

    public static boolean getConcluido() {
        return concluido;
    }
}