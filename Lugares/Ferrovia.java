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
        System.out.println("Você chegou à " + nome + ".");

        do {
            // Se todas as ações já foram concluídas, não há necessidade de repetir o primeiro menu
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }

            System.out.println();
            System.out.println("O que você gostaria de fazer?:" + "\n[1] - Explorar os trilhos" + "\n[2] - Observar os vagões abandonados" + "\n[3] - Olhar a paisagem ao redor");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha = scanner.nextLine();
        
            // Verifica se a escolha é válida
            switch (escolha) {
                case "1":
                    System.out.println();
                    System.out.println("Enquanto caminhava pelos trilhos enferrujados da ferrovia abandonada, você imaginava os dias em que trens majestosos cortavam a paisagem, transportando pessoas e mercadorias. \nAgora, os trilhos estão cobertos de vegetação, e a ferrovia está silenciosa, um lembrete silencioso do abandono e da passagem do tempo.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Ao observar os vagões abandonados ao longo da ferrovia, você se depara com uma cena de desolação. Os vagões enferrujados estão cobertos de grafites e marcas de vandalismo. \nÉ triste ver como essas relíquias do passado foram deixadas para apodrecer, em vez de serem preservadas como parte da história da região.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Ao olhar a paisagem ao redor da ferrovia, você se depara com uma natureza exuberante tentando reivindicar seu espaço. \nÁrvores crescem ao longo dos trilhos e animais selvagens encontraram refúgio nos vagões abandonados. É um lembrete poderoso da capacidade da natureza de se recuperar, mesmo diante da destruição humana.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!escolha.equals("1") || !escolha.equals("2") || !escolha.equals("3"));

        System.out.println();
        System.out.println("O que você gostaria de fazer?:" + "\n[x] - Ir falar com o Ferroviário Abandonado");
        System.out.println();
        System.out.println("Sua escolha: ");
        scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Você deseja falar sobre qual das suas descobertas?" + "\n[1] - Falar sobre os trilhos" + "\n[2] - Falar sobre os vagões abandonados" + "\n[3] - Falar sobre a paisagem ao redor");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha2 = scanner.nextLine();
                
            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, desculpe incomodar. Você trabalhava nesta ferrovia, certo?");
                    System.out.println("Ferroviário Abandonado: Sim, eu costumava ser um dos condutores. O que você quer saber?");
                    System.out.println(nomeJogador + ": Enquanto explorava os trilhos, fiquei impressionado com a quantidade de vegetação que os cobre. O que aconteceu com a ferrovia?");
                    System.out.println("Ferroviário Abandonado: Ah, isso é triste. A ferrovia foi abandonada há anos, após o declínio da indústria local. Sem manutenção, a natureza logo começou a reivindicar seu espaço. Agora, ela está quase irreconhecível.");
                    System.out.println(nomeJogador + ": Entendo. É uma pena ver como algo tão importante foi deixado ao abandono.");
                    break;
                case "2":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, desculpe incomodar. Você trabalhava nesta ferrovia, certo?");
                    System.out.println("Ferroviário Abandonado: Sim, eu costumava ser um dos condutores. O que você quer saber?");
                    System.out.println(nomeJogador + ": Enquanto observava os vagões abandonados, fiquei curioso sobre sua história. Por que eles foram deixados para apodrecer?");
                    System.out.println("Ferroviário Abandonado: Infelizmente, com o declínio da indústria e o fechamento das fábricas locais, a ferrovia perdeu sua utilidade. Os vagões foram deixados para trás, sem ninguém para cuidar deles. É triste ver como algo que já foi tão vital agora está em ruínas.");
                    System.out.println(nomeJogador + ": Concordo. É importante preservar nossa história e aprender com nossos erros.");
                    break;
                case "3":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, desculpe incomodar. Você trabalhava nesta ferrovia, certo?");
                    System.out.println("Ferroviário Abandonado: Sim, eu costumava ser um dos condutores. O que você quer saber?");
                    System.out.println(nomeJogador + ": Enquanto olhava a paisagem ao redor da ferrovia, fiquei impressionado com a natureza exuberante que a envolve. Como você vê essa mudança?");
                    System.out.println("Ferroviário Abandonado: É incrível, não é? A natureza é muito resiliente. Mesmo após anos de abandono, ela está lentamente retomando seu lugar. É um lembrete de que, no final das contas, somos apenas passageiros neste mundo, e a natureza sempre prevalecerá.");
                    System.out.println(nomeJogador + ": Concordo. Devemos respeitar e preservar a natureza sempre que possível.");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Tente novamente.");
                    break;    
            }
        } while (!escolha2.equals("2"));
            
        Jogos minigame = new Jogos();
        minigame.escolherJogo();
        System.out.println();
        System.out.println("Junto de alguns voluntários, vocês se juntaram para ajudar na limpeza da ferrovia abandonada, removendo a vegetação excessiva e os entulhos ao redor dos trilhos. \nPor meio de campanhas educativas, conscientizaram a comunidade sobre a importância de preservar o patrimônio histórico e ambiental. \nAs suas ações ajudaram a revitalizar a área, transformando a ferrovia abandonada em um espaço seguro e acessível para todos.");
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
