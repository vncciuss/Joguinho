package Lugares;

import Minigames.Jogos;
import Visualizacao.FabricaImagem;
import src.Main;

public class Fabrica extends Lugar{
    private String nome = "fabrica abandonada";
    private String pensamento1 = "";
    private String pensamento2 = "";
    private String pensamento3 = "";
    protected static boolean concluido = false;


    public void Viajar(){
        nomeJogador = Main.getNomeJogador();

        FabricaImagem imagem = new FabricaImagem();
        imagem.mostrar();
        System.out.println();
        System.out.println("Voce chegou a " + nome + ".");

        do {
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }

            System.out.println();
            System.out.println("O que voce gostaria de fazer?:" + "\n[1] - Explorar os corredores" + "\n[2] - Observar vestigios de pessoas" + "\n[3] - Olhar os arredores");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha = scanner.nextLine();
        
            switch (escolha) {
                case "1":
                    System.out.println();
                    System.out.println("Enquanto explorava os corredores sombrios da fabrica abandonada, voce notou vestigios de uma atividade industrial passada. \nAs paredes desgastadas e as maquinas enferrujadas contam a historia de uma era em que esta fabrica estava em pleno funcionamento, mas agora permanece como um monumento ao descaso ambiental. \nO ar impregnado com o cheiro de oleo queimado e produtos quimicos agressivos serve como um lembrete sombrio dos impactos prejudiciais da industria descontrolada no meio ambiente.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Ao observar os vestigios da atividade humana na fabrica abandonada, voce fica intrigado com os sinais de negligencia ambiental. \nMontes de residuos toxicos e materiais descartados poluem o chao, enquanto equipamentos industriais enferrujados vazam substancias nocivas no solo. \nEsta visao desoladora ressalta a importancia urgente de praticas industriais mais sustentaveis e de uma gestao responsavel dos residuos, para evitar danos irreparaveis ao ecossistema.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Ao explorar os arredores da fabrica, voce se depara com um rio outrora vital que agora esta contaminado e sufocado por detritos industriais. \nAs aguas escuras e poluidas refletem a triste realidade da degradacao ambiental causada pela atividade industrial irresponsavel. \nPeixes mortos flutuam na superficie, enquanto o cheiro acre de produtos quimicos toxicos paira no ar. \nE evidente que medidas urgentes sao necessarias para descontaminar este rio e restaurar sua vitalidade, antes que seja tarde demais.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (!escolha.equals("1") || !escolha.equals("2") || !escolha.equals("3"));

        System.out.println();
        System.out.println("O que voce gostaria de fazer?:" + "\n[x] - Ir falar com o ex-funcionario");
        System.out.println();
        System.out.println("Sua escolha: ");
        scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Voce deseja falar sobre qual das suas acoes?" + "\n[1] - Falar sobre os corredores" + "\n[2] - Falar sobre os vestigios" + "\n[3] - Falar sobre os arredores");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha2 = scanner.nextLine();
                
            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ei, desculpe interromper, mas voce trabalhava nesta fabrica, certo?");
                    System.out.println("Ex-funcionario da fabrica: Sim, eu costumava ser um dos operarios. O que voce quer saber?");
                    System.out.println(nomeJogador + ": Enquanto explorava a fabrica, percebi que muitas das estruturas e maquinas estao em pessimo estado. Algumas delas ate parecem estar desmoronando. Voce tem alguma ideia do que poderia ter causado isso?");
                    System.out.println("Ex-funcionario da fabrica: Ah, sim, essas maquinas eram antigas e muitas vezes nao recebiam a manutencao adequada. O tempo tambem nao foi gentil com elas. \nAlem disso, a empresa costumava despejar residuos toxicos nas proximidades, o que pode ter contribuido para a degradacao das estruturas. E triste ver como o descaso ambiental afetou este lugar.");
                    System.out.println(nomeJogador + ": Concordo. E importante aprender com os erros do passado para evitar danos ainda maiores ao meio ambiente.");
                    break;
                case "2":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ei, desculpe interromper, mas voce trabalhava nesta fabrica, certo?");
                    System.out.println("Ex-funcionario da fabrica: Sim, trabalhei aqui por anos. Em que posso ajudar?");
                    System.out.println(nomeJogador + ": Enquanto explorava os arredores da fabrica, percebi muitos residuos toxicos e materiais abandonados. Parece que o local foi negligenciado por muito tempo. Voce acha que isso pode ter causado danos ao meio ambiente?");
                    System.out.println("Ex-funcionario da fabrica: Infelizmente, sim. Durante os anos em que trabalhei aqui, testemunhei muitos casos de descarte irresponsavel de residuos industriais. \nA empresa nao se preocupava muito com os impactos ambientais de suas operacoes. Agora, vemos o resultado desse descaso. E triste ver como a ganancia pode destruir um lugar tao bonito.");
                    System.out.println(nomeJogador + ": Concordo. E hora de tomar medidas para limpar este lugar e restaurar o equilibrio ambiental.");
                    break;
                case "3":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ei, desculpe interromper, mas voce trabalhava nesta fabrica, certo?");
                    System.out.println("Ex-funcionario da fabrica: Sim, eu conheco este lugar como a palma da minha mao. Em que posso ajudar?");
                    System.out.println(nomeJogador + ": Enquanto explorava os arredores da fabrica, cheguei perto do rio que passa por aqui. Fiquei chocado ao ver como as aguas estao poluidas e como a vida selvagem esta sofrendo. Voce tem alguma ideia do que poderia ter causado essa contaminacao?");
                    System.out.println("Ex-funcionario da fabrica: Bem, durante os anos em que trabalhei aqui, vi muitos produtos quimicos sendo despejados diretamente no rio. A empresa achava mais facil se livrar dos residuos dessa maneira, sem se preocupar com as consequencias. \nAgora vemos o resultado disso. E uma tragedia ver como a ganancia pode destruir um ecossistema tao fragil.");
                    System.out.println(nomeJogador + ": Concordo. Precisamos tomar medidas urgentes para descontaminar este rio e proteger a vida selvagem que depende dele.");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;    
            }
        } while (!escolha2.equals("2"));
            
        Jogos minigame = new Jogos();
        minigame.escolherJogo();
        System.out.println();
        System.out.println("Voce liderou uma equipe de voluntarios na limpeza dos arredores da fabrica abandonada, removendo residuos toxicos e materiais abandonados. \nEles tambem descontaminaram o rio proximo, restaurando a vida aquatica. Por meio de campanhas educativas, conscientizaram a comunidade sobre a importancia da preservacao ambiental. \nAs suas acoes transformaram a fabrica de um simbolo de decadencia em um exemplo de renovacao e esperanca.");
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
