package Lugares;

import Minigames.Jogos;
import Visualizacao.FerroviaImagem;
import src.Main;

public class Ferrovia extends Lugar{
    private String nome = "ferrovia abandonada";
    private String pensamento1 = "";
    private String pensamento2 = "";
    private String pensamento3 = "";
    protected static boolean concluido = false;

    public void Viajar(){
        nomeJogador = Main.getNomeJogador();

        FerroviaImagem imagem = new FerroviaImagem();
        imagem.mostrar();
        System.out.println();
        System.out.println("Voce chegou a " + nome + ".");

        do {
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }
            System.out.println();
            System.out.println("O que voce gostaria de fazer?:" + "\n[1] - Explorar os trilhos" + "\n[2] - Observar os vagoes abandonados" + "\n[3] - Olhar a paisagem ao redor");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha = scanner.nextLine();
        
            switch (escolha) {
                case "1":
                    System.out.println();
                    System.out.println("Enquanto caminhava pelos trilhos enferrujados da ferrovia abandonada, voce imaginava os dias em que trens majestosos cortavam a paisagem, transportando pessoas e mercadorias. \nAgora, os trilhos estao cobertos de vegetacao, e a ferrovia esta silenciosa, um lembrete silencioso do abandono e da passagem do tempo.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Ao observar os vagoes abandonados ao longo da ferrovia, voce se depara com uma cena de desolacao. Os vagoes enferrujados estao cobertos de grafites e marcas de vandalismo. \nE triste ver como essas reliquias do passado foram deixadas para apodrecer, em vez de serem preservadas como parte da historia da regiao.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Ao olhar a paisagem ao redor da ferrovia, voce se depara com uma natureza exuberante tentando reivindicar seu espaco. \nArvores crescem ao longo dos trilhos e animais selvagens encontraram refugio nos vagoes abandonados. E um lembrete poderoso da capacidade da natureza de se recuperar, mesmo diante da destruicao humana.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (!escolha.equals("1") || !escolha.equals("2") || !escolha.equals("3"));

        System.out.println();
        System.out.println("O que voce gostaria de fazer?:" + "\n[x] - Ir falar com o Ferroviario Abandonado");
        System.out.println();
        System.out.println("Sua escolha: ");
        scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Voce deseja falar sobre qual das suas descobertas?" + "\n[1] - Falar sobre os trilhos" + "\n[2] - Falar sobre os vagoes abandonados" + "\n[3] - Falar sobre a paisagem ao redor");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha2 = scanner.nextLine();
                
            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, desculpe incomodar. Voce trabalhava nesta ferrovia, certo?");
                    System.out.println("Ferroviario Abandonado: Sim, eu costumava ser um dos condutores. O que voce quer saber?");
                    System.out.println(nomeJogador + ": Enquanto explorava os trilhos, fiquei impressionado com a quantidade de vegetacao que os cobre. O que aconteceu com a ferrovia?");
                    System.out.println("Ferroviario Abandonado: Ah, isso e triste. A ferrovia foi abandonada ha anos, apos o declinio da industria local. Sem manutencao, a natureza logo comecou a reivindicar seu espaco. Agora, ela esta quase irreconhecivel.");
                    System.out.println(nomeJogador + ": Entendo. E uma pena ver como algo tao importante foi deixado ao abandono.");
                    break;
                case "2":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, desculpe incomodar. Voce trabalhava nesta ferrovia, certo?");
                    System.out.println("Ferroviario Abandonado: Sim, eu costumava ser um dos condutores. O que voce quer saber?");
                    System.out.println(nomeJogador + ": Enquanto observava os vagoes abandonados, fiquei curioso sobre sua historia. Por que eles foram deixados para apodrecer?");
                    System.out.println("Ferroviario Abandonado: Infelizmente, com o declinio da industria e o fechamento das fabricas locais, a ferrovia perdeu sua utilidade. \nOs vagoes foram deixados para tras, sem ninguem para cuidar deles. E triste ver como algo que ja foi tao vital agora esta em ruinas.");
                    System.out.println(nomeJogador + ": Concordo. E importante preservar nossa historia e aprender com nossos erros.");
                    break;
                case "3":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, desculpe incomodar. Voce trabalhava nesta ferrovia, certo?");
                    System.out.println("Ferroviario Abandonado: Sim, eu costumava ser um dos condutores. O que voce quer saber?");
                    System.out.println(nomeJogador + ": Enquanto olhava a paisagem ao redor da ferrovia, fiquei impressionado com a natureza exuberante que a envolve. Como voce ve essa mudanca?");
                    System.out.println("Ferroviario Abandonado: E incrivel, nao e? A natureza e muito resiliente. Mesmo apos anos de abandono, ela esta lentamente retomando seu lugar. \nE um lembrete de que, no final das contas, somos apenas passageiros neste mundo, e a natureza sempre prevalecera.");
                    System.out.println(nomeJogador + ": Concordo. Devemos respeitar e preservar a natureza sempre que possivel.");
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
        System.out.println("Junto de alguns voluntarios, voces se juntaram para ajudar na limpeza da ferrovia abandonada, removendo a vegetacao excessiva e os entulhos ao redor dos trilhos. \nPor meio de campanhas educativas, conscientizaram a comunidade sobre a importancia de preservar o patrimonio historico e ambiental. \nAs suas acoes ajudaram a revitalizar a area, transformando a ferrovia abandonada em um espaco seguro e acessivel para todos.");
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
