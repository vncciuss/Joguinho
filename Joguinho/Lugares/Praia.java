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
        System.out.println("Voce chegou a " + nome + ".");

        do {
            if (pensamento1.equals("Concluido") && pensamento2.equals("Concluido") && pensamento3.equals("Concluido")) {
                break;
            }
            System.out.println();
            System.out.println("O que voce gostaria de fazer?:" + "\n[1] - Observar a fauna marinha" + "\n[2] - Recolher lixo na praia" + "\n[3] - Aprender sobre os recifes de corais");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println();
                    System.out.println("Enquanto observava a vida marinha, voce notou a diversidade de especies que habitam os recifes proximos a costa. \nOs peixes coloridos, as tartarugas majestosas e os corais vibrantes sao testemunhas da riqueza e fragilidade desse ecossistema marinho. Sua beleza inspira a protecao desses ambientes para as geracoes futuras.");
                    pensamento1 = "Concluido";
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Decidindo agir, voce se dedicou a recolher o lixo espalhado pela praia. Garrafas plasticas, sacolas e outros residuos foram removidos, contribuindo para a preservacao do ambiente marinho. \nSua acao demonstra o impacto positivo que cada individuo pode ter na conservacao do meio ambiente.");
                    pensamento2 = "Concluido";
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Interessado em aprender, voce se aproximou de um guia local que explicou sobre a importancia dos recifes de corais para a saude dos oceanos. \nAlem de abrigarem uma variedade impressionante de vida marinha, os recifes protegem as costas das ondas e tempestades, fornecem alimentos e sustento para comunidades locais e contribuem para a economia por meio do turismo sustentavel.");
                    pensamento3 = "Concluido";
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (!pensamento1.equals("Concluido") || !pensamento2.equals("Concluido") || !pensamento3.equals("Concluido"));

        System.out.println();
        System.out.println("O que voce gostaria de fazer?:" + "\n[x] - Conversar com o Biologo Marinho");
        System.out.println();
        System.out.println("Sua escolha: ");
        scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Voce deseja falar sobre qual dos seus interesses?" + "\n[1] - Fauna marinha" + "\n[2] - Conservacao ambiental" + "\n[3] - Recifes de corais");
            System.out.println();
            System.out.println("Sua escolha: ");
            escolha2 = scanner.nextLine();

            switch (escolha2) {
                case "1":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, voce e um biologo marinho?");
                    System.out.println("Biologo Marinho: Sim, sou especialista em vida marinha. Como posso ajuda-lo?");
                    System.out.println(nomeJogador + ": Estou fascinado com a diversidade de especies que encontrei aqui. Poderia me contar mais sobre a importancia da fauna marinha?");
                    System.out.println("Biologo Marinho: Certamente! A fauna marinha desempenha um papel crucial na regulacao do ecossistema marinho, desde a manutencao do equilíbrio das populacoes de peixes ate o fornecimento de nutrientes para os recifes de corais. \nE essencial proteger essas especies para garantir a saúde dos oceanos.");
                    break;
                case "2":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, voce e um biologo marinho?");
                    System.out.println("Biologo Marinho: Sim, estudo a conservacao ambiental marinha. Em que posso ajuda-lo?");
                    System.out.println(nomeJogador + ": Estou preocupado com a quantidade de lixo que encontrei na praia. O que podemos fazer para manter esse ambiente saudavel?");
                    System.out.println("Biologo Marinho: A conservacao ambiental e fundamental para proteger os ecossistemas marinhos. \nIniciativas como a reducao do uso de plasticos descartaveis, a reciclagem e a conscientizacao pública sao essenciais para preservar a beleza natural das praias e evitar danos à vida marinha.");
                    break;
                case "3":
                    System.out.println();
                    System.out.println(nomeJogador + ": Ola, voce e um biologo marinho?");
                    System.out.println("Biologo Marinho: Sim, sou especialista em recifes de corais. Como posso ajuda-lo?");
                    System.out.println(nomeJogador + ": Gostaria de aprender mais sobre a importancia dos recifes de corais para o ecossistema marinho.");
                    System.out.println("Biologo Marinho: Os recifes de corais sao ecossistemas incrivelmente diversos que fornecem habitat para milhoes de especies marinhas. Preservar os recifes de corais e essencial para a saúde dos oceanos e o bem-estar humano.");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        } while (!escolha2.equals("3"));

        Jogos minigame = new Jogos();
        minigame.escolherJogo();
        System.out.println();
        System.out.println("Voce participou de uma atividade de reflorestamento das dunas costeiras e ajudou a conscientizar os visitantes sobre a importancia da preservacao dos ecossistemas marinhos. \nSuas acoes contribuiram para a protecao da vida marinha e a conservacao das praias para as geracoes futuras.");
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
