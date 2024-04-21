package Lugares;

import Minigames.Jogos;
import Visualizacao.PraiaImagem;
import src.Main;

public class Praia extends Lugar {
    private String nome = "praia";
    private String pensamento1 = "";
    private String pensamento2 = "";
    private String pensamento3 = "";
    protected static boolean concluido = false;

    public void Viajar() {
        nomeJogador = Main.getNomeJogador();

        PraiaImagem imagem = new PraiaImagem();
        imagem.mostrar();
        System.out.println();
        System.out.println("Você chegou à " + nome + ".");

        do {
            // Se todas as ações já foram concluídas, não há necessidade de repetir o primeiro menu
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }
            System.out.println();
            System.out.println("O que você gostaria de fazer?:" + "\n[1] - Observar a fauna marinha" + "\n[2] - Recolher lixo na praia" + "\n[3] - Aprender sobre os recifes de corais");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha = scanner.nextLine();

            // Verifica se a escolha é válida
            switch (escolha) {
                case "1":
                    System.out.println();
                    System.out.println("Enquanto observava a vida marinha, você notou a diversidade de espécies que habitam os recifes próximos à costa. \nOs peixes coloridos, as tartarugas majestosas e os corais vibrantes são testemunhas da riqueza e fragilidade desse ecossistema marinho. Sua beleza inspira a proteção desses ambientes para as gerações futuras.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Decidindo agir, você se dedicou a recolher o lixo espalhado pela praia. Garrafas plásticas, sacolas e outros resíduos foram removidos, contribuindo para a preservação do ambiente marinho. \nSua ação demonstra o impacto positivo que cada indivíduo pode ter na conservação do meio ambiente.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Interessado em aprender, você se aproximou de um guia local que explicou sobre a importância dos recifes de corais para a saúde dos oceanos. \nAlém de abrigarem uma variedade impressionante de vida marinha, os recifes protegem as costas das ondas e tempestades, fornecem alimentos e sustento para comunidades locais e contribuem para a economia por meio do turismo sustentável.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!pensamento1.equals("Concluido") || !pensamento2.equals("Concluido") || !pensamento3.equals("Concluido"));

        System.out.println();
        System.out.println("O que você gostaria de fazer?:" + "\n[x] - Conversar com o Biólogo Marinho");
        System.out.println();
        System.out.println("Sua escolha: ");
        scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Você deseja falar sobre qual dos seus interesses?" + "\n[1] - Fauna marinha" + "\n[2] - Conservação ambiental" + "\n[3] - Recifes de corais");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha2 = scanner.nextLine();

            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, você é um biólogo marinho?");
                    System.out.println("Biólogo Marinho: Sim, sou especialista em vida marinha. Como posso ajudá-lo?");
                    System.out.println(nomeJogador + ": Estou fascinado com a diversidade de espécies que encontrei aqui. Poderia me contar mais sobre a importância da fauna marinha?");
                    System.out.println("Biólogo Marinho: Certamente! A fauna marinha desempenha um papel crucial na regulação do ecossistema marinho, desde a manutenção do equilíbrio das populações de peixes até o fornecimento de nutrientes para os recifes de corais. É essencial proteger essas espécies para garantir a saúde dos oceanos.");
                    break;
                case "2":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, você é um biólogo marinho?");
                    System.out.println("Biólogo Marinho: Sim, estudo a conservação ambiental marinha. Em que posso ajudá-lo?");
                    System.out.println(nomeJogador + ": Estou preocupado com a quantidade de lixo que encontrei na praia. O que podemos fazer para manter esse ambiente saudável?");
                    System.out.println("Biólogo Marinho: A conservação ambiental é fundamental para proteger os ecossistemas marinhos. Iniciativas como a redução do uso de plásticos descartáveis, a reciclagem e a conscientização pública são essenciais para preservar a beleza natural das praias e evitar danos à vida marinha.");
                    break;
                case "3":
                    System.out.println();
                    System.out.println(nomeJogador + ": Olá, você é um biólogo marinho?");
                    System.out.println("Biólogo Marinho: Sim, sou especialista em recifes de corais. Como posso ajudá-lo?");
                    System.out.println(nomeJogador + ": Gostaria de aprender mais sobre a importância dos recifes de corais para o ecossistema marinho.");
                    System.out.println("Biólogo Marinho: Os recifes de corais são ecossistemas incrivelmente diversos que fornecem habitat para milhões de espécies marinhas. Além disso, protegem as costas das ondas e tempestades, contribuem para a economia local por meio do turismo sustentável e são fontes de alimentos e sustento para comunidades costeiras. Preservar os recifes de corais é essencial para a saúde dos oceanos e o bem-estar humano.");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!escolha2.equals("3"));

        Jogos minigame = new Jogos();
        minigame.escolherJogo();
        System.out.println();
        System.out.println("Você participou de uma atividade de reflorestamento das dunas costeiras e ajudou a conscientizar os visitantes sobre a importância da preservação dos ecossistemas marinhos. Suas ações contribuíram para a proteção da vida marinha e a conservação das praias para as gerações futuras.");
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
